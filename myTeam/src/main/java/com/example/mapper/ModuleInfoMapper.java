package com.example.mapper;

import com.example.entity.ModuleInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ModuleInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table module
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Delete({ "delete from module", "where M_ID = #{M_ID,jdbcType=DECIMAL}" })
	int deleteByPrimaryKey(Integer M_ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table module
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Insert({ "insert into module (M_ID, M_name)", "values (#{M_ID,jdbcType=DECIMAL}, #{M_name,jdbcType=VARCHAR})" })
	int insert(ModuleInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table module
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@InsertProvider(type = ModuleInfoSqlProvider.class, method = "insertSelective")
	int insertSelective(ModuleInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table module
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Select({ "select", "M_ID, M_name", "from module", "where M_ID = #{M_ID,jdbcType=DECIMAL}" })
	@Results({ @Result(column = "M_ID", property = "M_ID", jdbcType = JdbcType.DECIMAL, id = true),
			@Result(column = "M_name", property = "M_name", jdbcType = JdbcType.VARCHAR) })
	ModuleInfo selectByPrimaryKey(Integer M_ID);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table module
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@UpdateProvider(type = ModuleInfoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(ModuleInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table module
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	@Update({ "update module", "set M_name = #{M_name,jdbcType=VARCHAR}", "where M_ID = #{M_ID,jdbcType=DECIMAL}" })
	int updateByPrimaryKey(ModuleInfo record);
}