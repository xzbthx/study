package com.example.mapper;

import com.example.entity.AllclassInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AllclassInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table allclass
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Delete({ "delete from allclass", "where CL_ID = #{CL_ID,jdbcType=DECIMAL}" })
	int deleteByPrimaryKey(Integer CL_ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table allclass
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Insert({ "insert into allclass (CL_ID, CO_ID, ", "ID, CL_name, CL_capacity, ", "CL_number, CL_price, ",
			"CL_startTime, CL_endTime)", "values (#{CL_ID,jdbcType=DECIMAL}, #{CO_ID,jdbcType=DECIMAL}, ",
			"#{ID,jdbcType=VARCHAR}, #{CL_name,jdbcType=VARCHAR}, #{CL_capacity,jdbcType=DECIMAL}, ",
			"#{CL_number,jdbcType=DECIMAL}, #{CL_price,jdbcType=DECIMAL}, ",
			"#{CL_startTime,jdbcType=DECIMAL}, #{CL_endTime,jdbcType=DECIMAL})" })
	int insert(AllclassInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table allclass
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@InsertProvider(type = AllclassInfoSqlProvider.class, method = "insertSelective")
	int insertSelective(AllclassInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table allclass
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Select({ "select", "CL_ID, CO_ID, ID, CL_name, CL_capacity, CL_number, CL_price, CL_startTime, CL_endTime",
			"from allclass", "where CL_ID = #{CL_ID,jdbcType=DECIMAL}" })
	@Results({ @Result(column = "CL_ID", property = "CL_ID", jdbcType = JdbcType.DECIMAL, id = true),
			@Result(column = "CO_ID", property = "CO_ID", jdbcType = JdbcType.DECIMAL),
			@Result(column = "ID", property = "ID", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CL_name", property = "CL_name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CL_capacity", property = "CL_capacity", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CL_number", property = "CL_number", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CL_price", property = "CL_price", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CL_startTime", property = "CL_startTime", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CL_endTime", property = "CL_endTime", jdbcType = JdbcType.DECIMAL) })
	AllclassInfo selectByPrimaryKey(Integer CL_ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table allclass
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@UpdateProvider(type = AllclassInfoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(AllclassInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table allclass
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Update({ "update allclass", "set CO_ID = #{CO_ID,jdbcType=DECIMAL},", "ID = #{ID,jdbcType=VARCHAR},",
			"CL_name = #{CL_name,jdbcType=VARCHAR},", "CL_capacity = #{CL_capacity,jdbcType=DECIMAL},",
			"CL_number = #{CL_number,jdbcType=DECIMAL},", "CL_price = #{CL_price,jdbcType=DECIMAL},",
			"CL_startTime = #{CL_startTime,jdbcType=DECIMAL},", "CL_endTime = #{CL_endTime,jdbcType=DECIMAL}",
			"where CL_ID = #{CL_ID,jdbcType=DECIMAL}" })
	int updateByPrimaryKey(AllclassInfo record);
}