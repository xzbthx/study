package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.ModuleObject;


public class ModuleObjectSqlProvider {
	public String querySelective(ModuleObject record) {
			
			SQL sql = new SQL();
			sql.SELECT("*");
			sql.FROM("module");
	
			if (record.getM_ID() != null) {
				sql.WHERE("M_ID = #{M_ID,jdbcType=DECIMAL}");
			}
	
			if (record.getM_name() != null) {
				sql.WHERE("M_name = #{M_name,jdbcType=VARCHAR}");
			}
	
			return sql.toString();
		}
}
