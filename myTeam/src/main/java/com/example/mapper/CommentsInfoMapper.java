package com.example.mapper;

import com.example.entity.CommentsInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CommentsInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comments
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Delete({ "delete from comments", "where COM_ID = #{COM_ID,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String COM_ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comments
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Insert({ "insert into comments (COM_ID, L_ID, ", "ID, COM_information, ", "COM_time)",
			"values (#{COM_ID,jdbcType=VARCHAR}, #{L_ID,jdbcType=DECIMAL}, ",
			"#{ID,jdbcType=VARCHAR}, #{COM_information,jdbcType=VARCHAR}, ", "#{COM_time,jdbcType=DECIMAL})" })
	int insert(CommentsInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comments
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@InsertProvider(type = CommentsInfoSqlProvider.class, method = "insertSelective")
	int insertSelective(CommentsInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comments
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Select({ "select", "COM_ID, L_ID, ID, COM_information, COM_time", "from comments",
			"where COM_ID = #{COM_ID,jdbcType=VARCHAR}" })
	@Results({ @Result(column = "COM_ID", property = "COM_ID", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "L_ID", property = "L_ID", jdbcType = JdbcType.DECIMAL),
			@Result(column = "ID", property = "ID", jdbcType = JdbcType.VARCHAR),
			@Result(column = "COM_information", property = "COM_information", jdbcType = JdbcType.VARCHAR),
			@Result(column = "COM_time", property = "COM_time", jdbcType = JdbcType.DECIMAL) })
	CommentsInfo selectByPrimaryKey(String COM_ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comments
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@UpdateProvider(type = CommentsInfoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(CommentsInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comments
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Update({ "update comments", "set L_ID = #{L_ID,jdbcType=DECIMAL},", "ID = #{ID,jdbcType=VARCHAR},",
			"COM_information = #{COM_information,jdbcType=VARCHAR},", "COM_time = #{COM_time,jdbcType=DECIMAL}",
			"where COM_ID = #{COM_ID,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(CommentsInfo record);
}