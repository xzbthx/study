package com.example.mapper;

import com.example.entity.ResourcesInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ResourcesInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resources
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Delete({ "delete from resources", "where RE_ID = #{RE_ID,jdbcType=DECIMAL}" })
	int deleteByPrimaryKey(Integer RE_ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resources
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Insert({ "insert into resources (RE_ID, L_ID, ", "RE_form, RE_introduction)",
			"values (#{RE_ID,jdbcType=DECIMAL}, #{L_ID,jdbcType=DECIMAL}, ",
			"#{RE_form,jdbcType=VARCHAR}, #{RE_introduction,jdbcType=VARCHAR})" })
	int insert(ResourcesInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resources
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@InsertProvider(type = ResourcesInfoSqlProvider.class, method = "insertSelective")
	int insertSelective(ResourcesInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resources
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Select({ "select", "RE_ID, L_ID, RE_form, RE_introduction", "from resources",
			"where RE_ID = #{RE_ID,jdbcType=DECIMAL}" })
	@Results({ @Result(column = "RE_ID", property = "RE_ID", jdbcType = JdbcType.DECIMAL, id = true),
			@Result(column = "L_ID", property = "L_ID", jdbcType = JdbcType.DECIMAL),
			@Result(column = "RE_form", property = "RE_form", jdbcType = JdbcType.VARCHAR),
			@Result(column = "RE_introduction", property = "RE_introduction", jdbcType = JdbcType.VARCHAR) })
	ResourcesInfo selectByPrimaryKey(Integer RE_ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resources
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@UpdateProvider(type = ResourcesInfoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(ResourcesInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resources
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Update({ "update resources", "set L_ID = #{L_ID,jdbcType=DECIMAL},", "RE_form = #{RE_form,jdbcType=VARCHAR},",
			"RE_introduction = #{RE_introduction,jdbcType=VARCHAR}", "where RE_ID = #{RE_ID,jdbcType=DECIMAL}" })
	int updateByPrimaryKey(ResourcesInfo record);
}