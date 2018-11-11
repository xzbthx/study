package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.CommentsInfoMapper;
import com.example.object.CommentsObject;

public interface CommentsObjectMapper extends CommentsInfoMapper{
	
	@Select({
		"select *",
        "from comments"
    })
    @Results({
    	@Result(column="COM_ID", property="COM_ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="L_ID", property="L_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="COM_introduction", property="COM_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="COM_time", property="COM_time", jdbcType=JdbcType.DECIMAL)
    })
    List<CommentsObject> selectAll();
	
	@SelectProvider(type=CommentsObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="COM_ID", property="COM_ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="L_ID", property="L_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="COM_introduction", property="COM_introduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="COM_time", property="COM_time", jdbcType=JdbcType.DECIMAL)
    })
	List<CommentsObject> querySelective(CommentsObject comments);

}
