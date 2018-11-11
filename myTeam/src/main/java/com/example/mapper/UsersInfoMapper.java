package com.example.mapper;

import com.example.entity.UsersInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UsersInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Delete({ "delete from users", "where ID = #{ID,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Insert({ "insert into users (ID, username, ", "passwords)",
			"values (#{ID,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ", "#{passwords,jdbcType=VARCHAR})" })
	int insert(UsersInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@InsertProvider(type = UsersInfoSqlProvider.class, method = "insertSelective")
	int insertSelective(UsersInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Select({ "select", "ID, username, passwords", "from users", "where ID = #{ID,jdbcType=VARCHAR}" })
	@Results({ @Result(column = "ID", property = "ID", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "passwords", property = "passwords", jdbcType = JdbcType.VARCHAR) })
	UsersInfo selectByPrimaryKey(String ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@UpdateProvider(type = UsersInfoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(UsersInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Update({ "update users", "set username = #{username,jdbcType=VARCHAR},",
			"passwords = #{passwords,jdbcType=VARCHAR}", "where ID = #{ID,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(UsersInfo record);
}