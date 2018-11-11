package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.AdjustmentInfoMapper;
import com.example.object.AdjustmentObject;

public interface AdjustmentObjectMapper extends AdjustmentInfoMapper{
	
	@Select({
		"select *",
        "from adjustment"
    })
    @Results({
    	@Result(column="AD_ID", property="AD_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="STU_ID", property="STU_ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="AD_time", property="AD_time", jdbcType=JdbcType.DECIMAL),
    	@Result(column="AD_introduction", property="AD_introduction", jdbcType=JdbcType.VARCHAR)
    })
    List<AdjustmentObject> selectAll();
	
	@SelectProvider(type=AdjustmentObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="AD_ID", property="AD_ID", jdbcType=JdbcType.DECIMAL,id=true),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="STU_ID", property="STU_ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="AD_time", property="AD_time", jdbcType=JdbcType.DECIMAL),
        @Result(column="AD_introduction", property="AD_introduction", jdbcType=JdbcType.VARCHAR)
    })
	List<AdjustmentObject> querySelective(AdjustmentObject adjustment);

	@Select({
		"select *",
        "from adjustment",
        "where AD_ID=#{AD_ID,jdbcType=DECIMAL}"
    })
    @Results({
    	@Result(column="AD_ID", property="AD_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="STU_ID", property="STU_ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="AD_time", property="AD_time", jdbcType=JdbcType.DECIMAL),
    	@Result(column="AD_introduction", property="AD_introduction", jdbcType=JdbcType.VARCHAR)
    })
	AdjustmentObject selectByID(Integer AD_ID);

}
