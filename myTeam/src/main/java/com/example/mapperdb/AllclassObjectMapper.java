package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.AllclassInfoMapper;
import com.example.object.AllclassObject;

public interface AllclassObjectMapper extends AllclassInfoMapper{
	
	@Select({
		"select *",
        "from allclass"
    })
    @Results({
    	@Result(column="CL_ID", property="CL_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CO_ID", property="CO_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CL_name", property="CL_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CL_capacity", property="CL_capacity", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_number", property="CL_number", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_price", property="CL_price", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_startTime", property="CL_startTime", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_endTime", property="CL_endTime", jdbcType=JdbcType.DECIMAL)
    })
    List<AllclassObject> selectAll();
	
	@Select({
		"select *",
        "from allclass",
        "where CO_ID=#{CO_ID,jdbcType=DECIMAL}"
    })
    @Results({
    	@Result(column="CL_ID", property="CL_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CO_ID", property="CO_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CL_name", property="CL_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CL_capacity", property="CL_capacity", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_number", property="CL_number", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_price", property="CL_price", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_startTime", property="CL_startTime", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_endTime", property="CL_endTime", jdbcType=JdbcType.DECIMAL)
    })
    List<AllclassObject> selectByCoursesID(Integer CO_ID);
	
	@SelectProvider(type=AllclassObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="CL_ID", property="CL_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CO_ID", property="CO_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CL_name", property="CL_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CL_capacity", property="CL_capacity", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_number", property="CL_number", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_price", property="CL_price", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_startTime", property="CL_startTime", jdbcType=JdbcType.DECIMAL),
        @Result(column="CL_endTime", property="CL_endTime", jdbcType=JdbcType.DECIMAL)
    })
	List<AllclassObject> querySelective(AllclassObject allclass);


}
