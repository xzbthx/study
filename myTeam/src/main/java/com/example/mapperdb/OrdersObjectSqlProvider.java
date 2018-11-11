package com.example.mapperdb;

import org.apache.ibatis.jdbc.SQL;

import com.example.object.OrdersObject;

public class OrdersObjectSqlProvider {
public String querySelective(OrdersObject record) {
		
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("orders");
		
		if (record.getID() != null) {
			sql.WHERE("ID = #{ID,jdbcType=VARCHAR}");
		}
		
		if (record.getCL_ID() != null) {
			sql.WHERE("CL_ID = #{CL_ID,jdbcType=DECIMAL}");
		}
		
		if (record.getO_Time() != null) {
			sql.WHERE("O_Time = #{O_Time,jdbcType=DECIMAL}");
		}
		
		return sql.toString();
	}
}
