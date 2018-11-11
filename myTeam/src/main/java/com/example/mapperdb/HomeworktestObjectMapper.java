package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.HomeworktestInfoMapper;
import com.example.object.HomeworktestObject;

public interface HomeworktestObjectMapper extends HomeworktestInfoMapper{
	
	@Select({
		"select *",
        "from homeworktest"
    })
    @Results({
    	@Result(column="HT_ID", property="HT_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="L_ID", property="L_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="HT_form", property="HT_form", jdbcType=JdbcType.VARCHAR),
        @Result(column="HT_introduction", property="HT_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="HT_startTime", property="HT_startTime", jdbcType=JdbcType.DECIMAL),
        @Result(column="HT_endTime", property="HT_endTime", jdbcType=JdbcType.DECIMAL)
    })
    List<HomeworktestObject> selectAll();
	
	@SelectProvider(type=HomeworktestObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="HT_ID", property="HT_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="L_ID", property="L_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="HT_form", property="HT_form", jdbcType=JdbcType.VARCHAR),
        @Result(column="HT_introduction", property="HT_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="HT_startTime", property="HT_startTime", jdbcType=JdbcType.DECIMAL),
        @Result(column="HT_endTime", property="HT_endTime", jdbcType=JdbcType.DECIMAL)
    })
	List<HomeworktestObject> querySelective(HomeworktestObject homeworktest);
}
