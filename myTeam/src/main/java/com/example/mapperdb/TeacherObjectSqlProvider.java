package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.TeacherObject;

public class TeacherObjectSqlProvider {
public String querySelective(TeacherObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("teacher");
		
		if (record.getID() != null) {
			sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		}
		
		if (record.getUsername() != null) {
			sql.WHERE("username = #{username,jdbcType=VARCHAR}");
		}
		
		if (record.getPasswords() != null) {
			sql.WHERE("passowrds = #{passowrds,jdbcType=VARCHAR}");
		}

		if (record.getT_name() != null) {
			sql.WHERE("T_name = #{T_name,jdbcType=VARCHAR}");
		}
		
		if (record.getT_Cnumber() != null) {
			sql.WHERE("T_Cnumber = #{T_Cnumber,jdbcType=CHAR}");
		}
		
		if (record.getT_sex() != null) {
			sql.WHERE("T_sex = #{T_sex,jdbcType=CHAR}");
		}

		if (record.getT_IDcard() != null) {
			sql.WHERE("T_IDcard = #{T_IDcard,jdbcType=CHAR}");
		}

		if (record.getT_introduction() != null) {
			sql.WHERE("T_introduction = #{T_introduction,jdbcType=VARCHAR}");
		}
		
		if (record.getT_QQ() != null) {
			sql.WHERE("T_QQ = #{T_QQ,jdbcType=VARCHAR}");
		}
		
		if (record.getT_wei() != null) {
			sql.WHERE("T_wei = #{T_wei,jdbcType=VARCHAR}");
		}

		if (record.getT_emile() != null) {
			sql.WHERE("T_emile = #{T_emile,jdbcType=VARCHAR}");
		}
		
		if (record.getT_mobile() != null) {
			sql.WHERE("T_mobile = #{T_mobile,jdbcType=DECIMAL}");
		}
		return sql.toString();
	}
}
