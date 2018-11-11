package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.AllclassObject;

public class AllclassObjectSqlProvider {
public String querySelective(AllclassObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("allclass");
		
		if (record.getCL_ID() != null) {
			sql.WHERE("CL_ID = #{CL_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getCO_ID() != null) {
			sql.WHERE("CO_ID = #{CO_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getID() != null) {
			sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		}

		if (record.getCL_name() != null) {
			sql.WHERE("CL_name = #{CL_name,jdbcType=VARCHAR}");
		}
		
		if (record.getCL_capacity() != null) {
			sql.WHERE("CL_capacity = #{CL_capacity,jdbcType=DECIMAL}");
		}

		if (record.getCL_number() != null) {
			sql.WHERE("CL_number = #{CL_number,jdbcType=DECIMAL}");
		}

		if (record.getCL_price() != null) {
			sql.WHERE("CL_price = #{CL_price,jdbcType=DECIMAL}");
		}

		if (record.getCL_startTime() != null) {
			sql.WHERE("CL_startTime = #{CL_startTime,jdbcType=DECIMAL}");
		}
		
		if (record.getCL_endTime() != null) {
			sql.WHERE("CL_endTime = #{CL_endTime,jdbcType=DECIMAL}");
		}

		return sql.toString();
	}
}
