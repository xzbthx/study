package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.ResourcesObject;

public class ResourcesObjectSqlProvider {
public String querySelective(ResourcesObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("resources");
		
		if (record.getRE_ID() != null) {
			sql.WHERE("RE_ID = #{RE_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getL_ID() != null) {
			sql.WHERE("L_ID = #{L_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getRE_form() != null) {
			sql.WHERE("RE_form = #{RE_form,jdbcType=VARCHAR}");
		}

		if (record.getRE_introduction() != null) {
			sql.WHERE("RE_introduction = #{RE_introduction,jdbcType=VARCHAR}");
		}

		return sql.toString();
	}
}
