package com.example.mapper;

import com.example.entity.LessonInfo;
import org.apache.ibatis.jdbc.SQL;

public class LessonInfoSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table lesson
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String insertSelective(LessonInfo record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("lesson");
		if (record.getL_ID() != null) {
			sql.VALUES("L_ID", "#{L_ID,jdbcType=DECIMAL}");
		}
		if (record.getCL_ID() != null) {
			sql.VALUES("CL_ID", "#{CL_ID,jdbcType=DECIMAL}");
		}
		if (record.getL_name() != null) {
			sql.VALUES("L_name", "#{L_name,jdbcType=VARCHAR}");
		}
		if (record.getL_introduction() != null) {
			sql.VALUES("L_introduction", "#{L_introduction,jdbcType=VARCHAR}");
		}
		if (record.getL_startTime() != null) {
			sql.VALUES("L_startTime", "#{L_startTime,jdbcType=DECIMAL}");
		}
		if (record.getL_endTime() != null) {
			sql.VALUES("L_endTime", "#{L_endTime,jdbcType=DECIMAL}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table lesson
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String updateByPrimaryKeySelective(LessonInfo record) {
		SQL sql = new SQL();
		sql.UPDATE("lesson");
		if (record.getCL_ID() != null) {
			sql.SET("CL_ID = #{CL_ID,jdbcType=DECIMAL}");
		}
		if (record.getL_name() != null) {
			sql.SET("L_name = #{L_name,jdbcType=VARCHAR}");
		}
		if (record.getL_introduction() != null) {
			sql.SET("L_introduction = #{L_introduction,jdbcType=VARCHAR}");
		}
		if (record.getL_startTime() != null) {
			sql.SET("L_startTime = #{L_startTime,jdbcType=DECIMAL}");
		}
		if (record.getL_endTime() != null) {
			sql.SET("L_endTime = #{L_endTime,jdbcType=DECIMAL}");
		}
		sql.WHERE("L_ID = #{L_ID,jdbcType=DECIMAL}");
		return sql.toString();
	}
}