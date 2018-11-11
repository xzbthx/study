package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.LessonObject;


public class LessonObjectSqlProvider {
	public String querySelective(LessonObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("lesson");

		if (record.getL_ID() != null) {
			sql.WHERE("L_ID = #{L_ID,jdbcType=DECIMAL}");
		}

		if (record.getCL_ID() != null) {
			sql.WHERE("CL_ID = #{CL_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getL_name() != null) {
			sql.WHERE("L_name = #{L_name,jdbcType=VARCHAR}");
		}

		if (record.getL_introduction() != null) {
			sql.WHERE("L_introduction = #{L_introduction,jdbcType=VARCHAR}");
		}
		
		if (record.getL_startTime() != null) {
			sql.WHERE("L_startTime = #{L_startTime,jdbcType=DECIMAL}");
		}

		if (record.getL_endTime() != null) {
			sql.WHERE("L_endTime = #{L_endTime,jdbcType=DECIMAL}");
		}

		return sql.toString();
	}
}
