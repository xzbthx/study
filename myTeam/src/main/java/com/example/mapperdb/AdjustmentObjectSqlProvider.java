package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.AdjustmentObject;

public class AdjustmentObjectSqlProvider {
public String querySelective(AdjustmentObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("adjustment");
		
		if (record.getAD_ID() != null) {
			sql.WHERE("AD_ID = #{AD_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getID() != null) {
			sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		}

		if (record.getSTU_ID() != null) {
			sql.WHERE("STU_ID = #{STU_ID,jdbcType=VARCHAR}");
		}
		
		if (record.getAD_time() != null) {
			sql.WHERE("AD_time = #{AD_time,jdbcType=DECIMAL}");
		}

		if (record.getAD_introduction() != null) {
			sql.WHERE("AD_introduction = #{AD_introduction,jdbcType=VARCHAR}");
		}

		return sql.toString();
	}
}
