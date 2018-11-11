package com.example.mapper;

import com.example.entity.StudentInfo;
import org.apache.ibatis.jdbc.SQL;

public class StudentInfoSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String insertSelective(StudentInfo record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("student");
		if (record.getID() != null) {
			sql.VALUES("ID", "#{ID,jdbcType=VARCHAR}");
		}
		if (record.getUsername() != null) {
			sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
		}
		if (record.getPasswords() != null) {
			sql.VALUES("passwords", "#{passwords,jdbcType=VARCHAR}");
		}
		if (record.getS_name() != null) {
			sql.VALUES("S_name", "#{S_name,jdbcType=VARCHAR}");
		}
		if (record.getS_sex() != null) {
			sql.VALUES("S_sex", "#{S_sex,jdbcType=CHAR}");
		}
		if (record.getS_IDcard() != null) {
			sql.VALUES("S_IDcard", "#{S_IDcard,jdbcType=CHAR}");
		}
		if (record.getS_introduction() != null) {
			sql.VALUES("S_introduction", "#{S_introduction,jdbcType=VARCHAR}");
		}
		if (record.getS_qq() != null) {
			sql.VALUES("S_qq", "#{S_qq,jdbcType=VARCHAR}");
		}
		if (record.getS_wei() != null) {
			sql.VALUES("S_wei", "#{S_wei,jdbcType=VARCHAR}");
		}
		if (record.getS_emile() != null) {
			sql.VALUES("S_emile", "#{S_emile,jdbcType=VARCHAR}");
		}
		if (record.getS_mobile() != null) {
			sql.VALUES("S_mobile", "#{S_mobile,jdbcType=DECIMAL}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String updateByPrimaryKeySelective(StudentInfo record) {
		SQL sql = new SQL();
		sql.UPDATE("student");
		if (record.getUsername() != null) {
			sql.SET("username = #{username,jdbcType=VARCHAR}");
		}
		if (record.getPasswords() != null) {
			sql.SET("passwords = #{passwords,jdbcType=VARCHAR}");
		}
		if (record.getS_name() != null) {
			sql.SET("S_name = #{S_name,jdbcType=VARCHAR}");
		}
		if (record.getS_sex() != null) {
			sql.SET("S_sex = #{S_sex,jdbcType=CHAR}");
		}
		if (record.getS_IDcard() != null) {
			sql.SET("S_IDcard = #{S_IDcard,jdbcType=CHAR}");
		}
		if (record.getS_introduction() != null) {
			sql.SET("S_introduction = #{S_introduction,jdbcType=VARCHAR}");
		}
		if (record.getS_qq() != null) {
			sql.SET("S_qq = #{S_qq,jdbcType=VARCHAR}");
		}
		if (record.getS_wei() != null) {
			sql.SET("S_wei = #{S_wei,jdbcType=VARCHAR}");
		}
		if (record.getS_emile() != null) {
			sql.SET("S_emile = #{S_emile,jdbcType=VARCHAR}");
		}
		if (record.getS_mobile() != null) {
			sql.SET("S_mobile = #{S_mobile,jdbcType=DECIMAL}");
		}
		sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		return sql.toString();
	}
}