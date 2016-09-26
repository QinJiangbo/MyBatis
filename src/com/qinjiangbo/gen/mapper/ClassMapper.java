package com.qinjiangbo.gen.mapper;

import com.qinjiangbo.gen.model.Class;
import com.qinjiangbo.gen.model.ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    long countByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    int deleteByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    int insert(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    int insertSelective(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    List<Class> selectByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);
}