package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.CoursesObject;

public class CoursesObjectSqlProvider {
public String querySelective(CoursesObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("courses");
		
		if (record.getCO_ID() != null) {
			sql.WHERE("CO_ID = #{CO_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getM_ID() != null) {
			sql.WHERE("M_ID = #{M_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getCO_name() != null) {
			sql.WHERE("CO_name = #{CO_name,jdbcType=VARCHAR}");
		}

		if (record.getCO_introduction() != null) {
			sql.WHERE("CO_introduction = #{CO_introduction,jdbcType=VARCHAR}");
		}
		
		return sql.toString();
	}
}
