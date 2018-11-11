package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.CommentsObject;

public class CommentsObjectSqlProvider {
public String querySelective(CommentsObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("comments");
		
		if (record.getCOM_ID() != null) {
			sql.WHERE("COM_ID = #{COM_ID,jdbcType=VARCHAR}");
		}
		
		if (record.getL_ID() != null) {
			sql.WHERE("L_ID = #{L_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getID() != null) {
			sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		}

		if (record.getCOM_information() != null) {
			sql.WHERE("COM_information = #{COM_information,jdbcType=VARCHAR}");
		}
		
		if (record.getCOM_time() != null) {
			sql.WHERE("COM_time = #{COM_time,jdbcType=DECIMAL}");
		}

		return sql.toString();
	}
}
