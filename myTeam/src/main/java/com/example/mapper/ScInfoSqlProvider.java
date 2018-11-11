package com.example.mapper;

import com.example.entity.ScInfo;
import org.apache.ibatis.jdbc.SQL;

public class ScInfoSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sc
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String insertSelective(ScInfo record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("sc");
		if (record.getSTU_ID() != null) {
			sql.VALUES("STU_ID", "#{STU_ID,jdbcType=VARCHAR}");
		}
		if (record.getCL_ID() != null) {
			sql.VALUES("CL_ID", "#{CL_ID,jdbcType=DECIMAL}");
		}
		if (record.getID() != null) {
			sql.VALUES("ID", "#{ID,jdbcType=VARCHAR}");
		}
		return sql.toString();
	}
}