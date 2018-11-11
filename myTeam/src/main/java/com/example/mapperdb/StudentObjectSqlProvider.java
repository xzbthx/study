package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.StudentObject;

public class StudentObjectSqlProvider {
public String querySelective(StudentObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("student");
		
		if (record.getID() != null) {
			sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		}
		
		if (record.getUsername() != null) {
			sql.WHERE("username = #{username,jdbcType=VARCHAR}");
		}
		
		if (record.getPasswords() != null) {
			sql.WHERE("passwords = #{passwords,jdbcType=VARCHAR}");
		}

		if (record.getS_name() != null) {
			sql.WHERE("S_name = #{S_name,jdbcType=VARCHAR}");
		}
		
		if (record.getS_sex() != null) {
			sql.WHERE("S_sex = #{S_sex,jdbcType=CHAR}");
		}

		if (record.getS_IDcard() != null) {
			sql.WHERE("S_IDcard = #{S_IDcard,jdbcType=CHAR}");
		}

		if (record.getS_introduction() != null) {
			sql.WHERE("S_introduction = #{S_introduction,jdbcType=VARCHAR}");
		}
		
		if (record.getS_qq() != null) {
			sql.WHERE("S_qq = #{S_qq,jdbcType=VARCHAR}");
		}
		
		if (record.getS_wei() != null) {
			sql.WHERE("S_wei = #{S_wei,jdbcType=VARCHAR}");
		}

		if (record.getS_emile() != null) {
			sql.WHERE("S_emile = #{S_emile,jdbcType=VARCHAR}");
		}
		
		if (record.getS_mobile() != null) {
			sql.WHERE("S_mobile = #{S_mobile,jdbcType=DECIMAL}");
		}
		return sql.toString();
	}
}
