package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.ScObject;

public class ScObjectSqlProvider {
public String querySelective(ScObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("sc");
		
		if (record.getSTU_ID() != null) {
			sql.WHERE("STU_ID = #{STU_ID,jdbcType=VARCHAR}");
		}
		
		if (record.getCL_ID() != null) {
			sql.WHERE("CL_ID = #{CL_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getID() != null) {
			sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		}

		return sql.toString();
	}
}
