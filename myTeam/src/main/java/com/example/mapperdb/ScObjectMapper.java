package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.ScInfoMapper;
import com.example.object.ScObject;

public interface ScObjectMapper extends ScInfoMapper{
	
	@Select({
		"select *",
        "from sc"
    })
    @Results({
    	@Result(column="STU_ID", property="STU_ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CL_ID", property="CL_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<ScObject> selectAll();
	
	@SelectProvider(type=ScObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="STU_ID", property="STU_ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CL_ID", property="CL_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true)
    })
	List<ScObject> querySelective(ScObject sc);
}
