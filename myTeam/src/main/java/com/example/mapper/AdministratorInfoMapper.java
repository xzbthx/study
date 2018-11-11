package com.example.mapper;

import com.example.entity.AdministratorInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AdministratorInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table administrator
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Delete({ "delete from administrator", "where ID = #{ID,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table administrator
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Insert({ "insert into administrator (ID, username, ", "passwords, A_struts)",
			"values (#{ID,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
			"#{passwords,jdbcType=VARCHAR}, #{A_struts,jdbcType=DECIMAL})" })
	int insert(AdministratorInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table administrator
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@InsertProvider(type = AdministratorInfoSqlProvider.class, method = "insertSelective")
	int insertSelective(AdministratorInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table administrator
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Select({ "select", "ID, username, passwords, A_struts", "from administrator",
			"where ID = #{ID,jdbcType=VARCHAR}" })
	@Results({ @Result(column = "ID", property = "ID", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "passwords", property = "passwords", jdbcType = JdbcType.VARCHAR),
			@Result(column = "A_struts", property = "A_struts", jdbcType = JdbcType.DECIMAL) })
	AdministratorInfo selectByPrimaryKey(String ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table administrator
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@UpdateProvider(type = AdministratorInfoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(AdministratorInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table administrator
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Update({ "update administrator", "set username = #{username,jdbcType=VARCHAR},",
			"passwords = #{passwords,jdbcType=VARCHAR},", "A_struts = #{A_struts,jdbcType=DECIMAL}",
			"where ID = #{ID,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(AdministratorInfo record);
}