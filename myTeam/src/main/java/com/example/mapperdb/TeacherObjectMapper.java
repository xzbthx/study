package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.TeacherInfoMapper;
import com.example.object.TeacherObject;

public interface TeacherObjectMapper extends TeacherInfoMapper{
	
	@Select({
		"select *",
        "from teacher"
    })
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passwords", property="passwords", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_name", property="T_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_sex", property="T_sex", jdbcType=JdbcType.CHAR),
        @Result(column="T_Cnumber", property="T_Cnumber", jdbcType=JdbcType.CHAR),
        @Result(column="T_introduction", property="T_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_IDcard", property="T_IDcard", jdbcType=JdbcType.CHAR),
        @Result(column="T_QQ", property="T_QQ", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_wei", property="T_wei", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_emile", property="T_emile", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_mobile", property="T_mobile", jdbcType=JdbcType.DECIMAL)
    })
    List<TeacherObject> selectAll();
	
	@SelectProvider(type=TeacherObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passwords", property="passwords", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_name", property="T_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_sex", property="T_sex", jdbcType=JdbcType.CHAR),
        @Result(column="T_Cnumber", property="T_Cnumber", jdbcType=JdbcType.CHAR),
        @Result(column="T_introduction", property="T_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_IDcard", property="T_IDcard", jdbcType=JdbcType.CHAR),
        @Result(column="T_QQ", property="T_QQ", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_wei", property="T_wei", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_emile", property="T_emile", jdbcType=JdbcType.VARCHAR),
        @Result(column="T_mobile", property="T_mobile", jdbcType=JdbcType.DECIMAL)
    })
	List<TeacherObject> querySelective(TeacherObject teacher);
}
