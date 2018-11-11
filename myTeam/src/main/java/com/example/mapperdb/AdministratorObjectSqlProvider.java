package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.AdministratorObject;

public class AdministratorObjectSqlProvider {
public String querySelective(AdministratorObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("administrator");
		
		if (record.getID() != null) {
			sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		}
		
		if (record.getUsername() != null) {
			sql.WHERE("username = #{username,jdbcType=VARCHAR}");
		}
		
		if (record.getPasswords() != null) {
			sql.WHERE("passwords = #{passwords,jdbcType=VARCHAR}");
		}

		if (record.getA_struts() != null) {
			sql.WHERE("A_struts = #{A_struts,jdbcType=DECIMAL}");
		}

		return sql.toString();
	}
}
