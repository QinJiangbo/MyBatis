package com.qinjiangbo.gen.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.dom.DOMDocumentType;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.DefaultDocumentType;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Date: 9/26/16
 * Author: qinjiangbo@github.io
 */
public class CreateGenConfigXML {

    /**
     * 获得数据库连接
     *
     * @return
     */
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis",
                            "Richard", "123456");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取全部的表名
     *
     * @return
     * @throws SQLException
     */
    public static List<String> getTableNames() throws SQLException {
        List<String> names = new ArrayList<String>();
        Connection connection = getConnection();
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        String[] types = {"TABLE"};
        ResultSet resultSet = databaseMetaData.getTables(null, null, "%", types);
        while (resultSet.next()) {
            String name = (String) resultSet.getObject("TABLE_NAME");
            if (name.contains("（") || name.contains("）")) {
                continue;
            }
            names.add(name);
        }
        connection.close();
        return names;
    }

    /**
     * 生成DOM文件
     * @return
     * @throws SQLException
     */
    private static Document createDom() throws SQLException {
        Document doc = DocumentHelper.createDocument();
        //创建DOCTYPE申明
        doc.setDocType(new DOMDocumentType("generatorConfiguration",
                "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN",
                "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd"));

        //创建根结点
        Element root = doc.addElement("generatorConfiguration");

        //创建上下文结点
        Element context = root.addElement("context");
        context.addAttribute("id", "MBG");
        context.addAttribute("targetRuntime", "Mybatis3");
        context.addAttribute("defaultModelType", "conditional");

        //创建插件结点(这里默认每个类序列化)
        Element plugin = context.addElement("plugin");
        plugin.addAttribute("type", "org.mybatis.generator.plugins.SerializablePlugin");

        //创建注释结点,判断是否生成注释
        Element commentGenerator = context.addElement("commentGenerator");
        Element property = commentGenerator.addElement("property");
        property.addAttribute("name", "suppressAllComments");
        property.addAttribute("value", "false");

        //创建jdbc连接结点
        Element jdbcConnection = context.addElement("jdbcConnection");
        jdbcConnection.addAttribute("driverClass", "com.mysql.jdbc.Driver");
        jdbcConnection.addAttribute("connectionURL", "jdbc:mysql://localhost:3306/mybatis");
        jdbcConnection.addAttribute("userId", "Richard");
        jdbcConnection.addAttribute("password", "123456");

        //创建java类型处理类结点
        Element javaTypeResolver = context.addElement("javaTypeResolver");
        Element property2 = javaTypeResolver.addElement("property");
        property2.addAttribute("name", "forceBigDecimals");
        property2.addAttribute("value", "false");

        //创建java模型结点
        Element javaModelGenerator = context.addElement("javaModelGenerator");
        javaModelGenerator.addAttribute("targetPackage", "com.qinjiangbo.gen.model");
        javaModelGenerator.addAttribute("targetProject", "src");
        Element property3 = javaModelGenerator.addElement("property");
        property3.addAttribute("name", "enableSubPackages");
        property3.addAttribute("value", "true");

        //创建sql映射文件结点
        Element sqlMapGenerator = context.addElement("sqlMapGenerator");
        sqlMapGenerator.addAttribute("targetPackage", "com.qinjiangbo.gen.mapper");
        sqlMapGenerator.addAttribute("targetProject", "src");
        Element property4 = sqlMapGenerator.addElement("property");
        property4.addAttribute("name", "enableSubPackages");
        property4.addAttribute("value", "true");

        //创建java客户端结点,这里声明了dao层的位置
        Element javaClientGenerator = context.addElement("javaClientGenerator");
        javaClientGenerator.addAttribute("type", "XMLMAPPER");
        javaClientGenerator.addAttribute("targetPackage", "com.qinjiangbo.gen.mapper");
        javaClientGenerator.addAttribute("targetProject", "src");
        Element property5 = javaClientGenerator.addElement("property");
        property5.addAttribute("name", "enableSubPackages");
        property5.addAttribute("value", "true");

        //创建表(table)结点
        List<String> names = getTableNames();
        for (String name : names) {
            String[] words = name.split("_");
            String entityName = "";
            for (String word : words) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
                if (entityName == null || entityName.equals("")) {
                    entityName = word;
                } else {
                    entityName = entityName + word;
                }
            }
            Element tableNode = context.addElement("table");
            tableNode.addAttribute("tableName", name);
            tableNode.addAttribute("domainObjectName", entityName);
            tableNode.addAttribute("enableCountByExample", "true");
            tableNode.addAttribute("enableUpdateByExample", "true");
            tableNode.addAttribute("enableDeleteByExample", "true");
            tableNode.addAttribute("enableSelectByExample", "true");
            tableNode.addAttribute("selectByExampleQueryId", "true");
            tableNode.addAttribute("enableDeleteByPrimaryKey", "true");
            tableNode.addAttribute("enableSelectByPrimaryKey", "true");
            tableNode.addAttribute("enableUpdateByPrimaryKey", "true");
            tableNode.addAttribute("enableInsert", "true");
        }

        return doc;
    }

    /**
     * 写入到XML文件中
     * @throws Exception
     */
    public static void writeXML() throws Exception {
        XMLWriter xmlWriter = null;
        String userDir = System.getProperty("user.dir");
        String fileName = userDir + "/src/com/qinjiangbo/gen/util/generatorConfiguration.xml";
        OutputFormat format = OutputFormat.createPrettyPrint();
        FileOutputStream fos = new FileOutputStream(new File(fileName));
        format.setEncoding("utf-8");
        xmlWriter = new XMLWriter(fos, format);
        xmlWriter.write(createDom());
        xmlWriter.close();
    }

    public static void main(String[] args) throws Exception {
        writeXML();
        System.out.println("Completed!");
    }
}
