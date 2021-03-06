package com.plate.publicmag.dao;

import com.plate.publicmag.model.PublicCode;
import com.plate.publicmag.model.PublicCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    int countByExample(PublicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    int deleteByExample(PublicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("codeType") String codeType, @Param("code") String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    int insert(PublicCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    int insertSelective(PublicCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    List<PublicCode> selectByExample(PublicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    PublicCode selectByPrimaryKey(@Param("codeType") String codeType, @Param("code") String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PublicCode record, @Param("example") PublicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PublicCode record, @Param("example") PublicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PublicCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PublicCode record);
}