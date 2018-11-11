package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.StudentInfoMapper;
import com.example.object.StudentObject;

public interface StudentObjectMapper extends StudentInfoMapper{
	
	@Select({
		"select *",
        "from student"
    })
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passwords", property="passwords", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_name", property="S_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_sex", property="S_sex", jdbcType=JdbcType.CHAR),
        @Result(column="S_IDcard", property="S_IDcard", jdbcType=JdbcType.CHAR),
        @Result(column="S_introduction", property="S_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_qq", property="S_qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_wei", property="S_wei", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_emile", property="S_emile", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_mobile", property="S_mobile", jdbcType=JdbcType.DECIMAL)
    })
    List<StudentObject> selectAll();
	
	@SelectProvider(type=StudentObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passwords", property="passwords", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_name", property="S_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_sex", property="S_sex", jdbcType=JdbcType.CHAR),
        @Result(column="S_IDcard", property="S_IDcard", jdbcType=JdbcType.CHAR),
        @Result(column="S_introduction", property="S_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_qq", property="S_qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_wei", property="S_wei", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_emile", property="S_emile", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_mobile", property="S_mobile", jdbcType=JdbcType.DECIMAL)
    })
	List<StudentObject> querySelective(StudentObject student);
}
