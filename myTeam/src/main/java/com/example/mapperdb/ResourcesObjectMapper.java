package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.ResourcesInfoMapper;
import com.example.object.ResourcesObject;

public interface ResourcesObjectMapper extends ResourcesInfoMapper{
	
	@Select({
		"select *",
        "from resources"
    })
    @Results({
    	@Result(column="RE_ID", property="RE_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="L_ID", property="L_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="RE_form", property="RE_form", jdbcType=JdbcType.VARCHAR),
        @Result(column="RE_introduction", property="RE_introduction", jdbcType=JdbcType.VARCHAR)
    })
    List<ResourcesObject> selectAll();
	
	@SelectProvider(type=ResourcesObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="RE_ID", property="RE_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="L_ID", property="L_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="RE_form", property="RE_form", jdbcType=JdbcType.VARCHAR),
        @Result(column="RE_introduction", property="RE_introduction", jdbcType=JdbcType.VARCHAR)
    })
	List<ResourcesObject> querySelective(ResourcesObject resources);
}
