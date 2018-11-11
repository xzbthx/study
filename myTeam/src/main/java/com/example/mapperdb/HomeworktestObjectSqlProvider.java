package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.HomeworktestObject;

public class HomeworktestObjectSqlProvider {
public String querySelective(HomeworktestObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("homeworktest");
		
		if (record.getHT_ID() != null) {
			sql.WHERE("HT_ID = #{HT_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getL_ID() != null) {
			sql.WHERE("L_ID = #{L_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getHT_form() != null) {
			sql.WHERE("HT_form = #{HT_form,jdbcType=VARCHAR}");
		}

		if (record.getHT_introduction() != null) {
			sql.WHERE("HT_introduction = #{HT_introduction,jdbcType=VARCHAR}");
		}
		
		if (record.getHT_startTime() != null) {
			sql.WHERE("HT_startTime = #{HT_startTime,jdbcType=DECIMAL}");
		}

		if (record.getHT_endTime() != null) {
			sql.WHERE("HT_endTime = #{HT_endTime,jdbcType=DECIMAL}");
		}

		return sql.toString();
	}
}
