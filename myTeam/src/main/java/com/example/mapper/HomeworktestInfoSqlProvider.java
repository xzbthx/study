package com.example.mapper;

import com.example.entity.HomeworktestInfo;
import org.apache.ibatis.jdbc.SQL;

public class HomeworktestInfoSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table homeworktest
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String insertSelective(HomeworktestInfo record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("homeworktest");
		if (record.getHT_ID() != null) {
			sql.VALUES("HT_ID", "#{HT_ID,jdbcType=DECIMAL}");
		}
		if (record.getL_ID() != null) {
			sql.VALUES("L_ID", "#{L_ID,jdbcType=DECIMAL}");
		}
		if (record.getHT_form() != null) {
			sql.VALUES("HT_form", "#{HT_form,jdbcType=VARCHAR}");
		}
		if (record.getHT_introduction() != null) {
			sql.VALUES("HT_introduction", "#{HT_introduction,jdbcType=VARCHAR}");
		}
		if (record.getHT_startTime() != null) {
			sql.VALUES("HT_startTime", "#{HT_startTime,jdbcType=DECIMAL}");
		}
		if (record.getHT_endTime() != null) {
			sql.VALUES("HT_endTime", "#{HT_endTime,jdbcType=DECIMAL}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table homeworktest
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String updateByPrimaryKeySelective(HomeworktestInfo record) {
		SQL sql = new SQL();
		sql.UPDATE("homeworktest");
		if (record.getL_ID() != null) {
			sql.SET("L_ID = #{L_ID,jdbcType=DECIMAL}");
		}
		if (record.getHT_form() != null) {
			sql.SET("HT_form = #{HT_form,jdbcType=VARCHAR}");
		}
		if (record.getHT_introduction() != null) {
			sql.SET("HT_introduction = #{HT_introduction,jdbcType=VARCHAR}");
		}
		if (record.getHT_startTime() != null) {
			sql.SET("HT_startTime = #{HT_startTime,jdbcType=DECIMAL}");
		}
		if (record.getHT_endTime() != null) {
			sql.SET("HT_endTime = #{HT_endTime,jdbcType=DECIMAL}");
		}
		sql.WHERE("HT_ID = #{HT_ID,jdbcType=DECIMAL}");
		return sql.toString();
	}
}