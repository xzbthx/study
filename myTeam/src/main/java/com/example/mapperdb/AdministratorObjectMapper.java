package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.AdministratorInfoMapper;
import com.example.object.AdministratorObject;

public interface AdministratorObjectMapper extends AdministratorInfoMapper{
	
	@Select({
		"select *",
        "from administrator"
    })
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passwords", property="passwords", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_struts", property="A_struts", jdbcType=JdbcType.DECIMAL)
    })
    List<AdministratorObject> selectAll();
	
	@SelectProvider(type=AdministratorObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passwords", property="passwords", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_struts", property="A_struts", jdbcType=JdbcType.DECIMAL)
    })
	List<AdministratorObject> querySelective(AdministratorObject administrator);

}
