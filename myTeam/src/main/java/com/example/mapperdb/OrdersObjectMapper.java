package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.OrdersInfoMapper;
import com.example.object.OrdersObject;

public interface OrdersObjectMapper extends OrdersInfoMapper{
	
	@Select({
		"select *",
        "from orders"
    })
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CL_ID", property="CL_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="O_Time", property="O_Time", jdbcType=JdbcType.DECIMAL)
    })
    List<OrdersObject> selectAll();
	
	@SelectProvider(type=OrdersObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CL_ID", property="CL_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="O_Time", property="O_Time", jdbcType=JdbcType.DECIMAL)
    })
	List<OrdersObject> querySelective(OrdersObject orders);
}
