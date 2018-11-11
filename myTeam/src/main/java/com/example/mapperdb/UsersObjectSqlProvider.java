package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.UsersObject;

public class UsersObjectSqlProvider {
public String querySelective(UsersObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("users");
		
		if (record.getID() != null) {
			sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		}
		
		if (record.getUsername() != null) {
			sql.WHERE("username = #{username,jdbcType=VARCHAR}");
		}
		
		if (record.getPasswords() != null) {
			sql.WHERE("passwords = #{passwords,jdbcType=VARCHAR}");
		}

		return sql.toString();
	}
}
