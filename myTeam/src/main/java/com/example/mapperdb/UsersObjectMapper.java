package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.UsersInfoMapper;
import com.example.object.UsersObject;

public interface UsersObjectMapper extends UsersInfoMapper{
	
	@Select({
		"select *",
        "from users"
    })
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passwords", property="passwords", jdbcType=JdbcType.VARCHAR),
    })
    List<UsersObject> selectAll();
	
	@SelectProvider(type=UsersObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR,id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passswords", property="passswords", jdbcType=JdbcType.VARCHAR)
    })
	List<UsersObject> querySelective(UsersObject users);

}
