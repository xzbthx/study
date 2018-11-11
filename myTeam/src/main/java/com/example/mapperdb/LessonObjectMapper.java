package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.LessonInfoMapper;
import com.example.object.LessonObject;

public interface LessonObjectMapper extends LessonInfoMapper{
	
	@Select({
		"select *",
        "from lesson"
    })
    @Results({
    	@Result(column="L_ID", property="L_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CL_ID", property="CL_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="L_name", property="L_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="L_introduction", property="L_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="L_startTime", property="L_startTime", jdbcType=JdbcType.DECIMAL),
        @Result(column="L_endTime", property="L_endTime", jdbcType=JdbcType.DECIMAL)
    })
    List<LessonObject> selectAll();
	
	@SelectProvider(type=LessonObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="L_ID", property="L_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CL_ID", property="CL_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="L_name", property="L_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="L_introduction", property="L_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="L_startTime", property="L_startTime", jdbcType=JdbcType.DECIMAL),
        @Result(column="L_endTime", property="L_endTime", jdbcType=JdbcType.DECIMAL)
    })
	List<LessonObject> querySelective(LessonObject lesson);
}
