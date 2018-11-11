package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.CoursesInfoMapper;
import com.example.object.CoursesObject;

public interface CoursesObjectMapper extends CoursesInfoMapper{
	
	@Select({
		"select *",
        "from courses"
    })
    @Results({
    	@Result(column="CO_ID", property="CO_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="M_ID", property="M_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="CO_name", property="CO_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CO_introduction", property="CO_introduction", jdbcType=JdbcType.VARCHAR)
    })
    List<CoursesObject> selectAll();
	
	@Select({
		"select *",
        "from courses",
        "where M_ID=#{M_ID,jdbcType=DECIMAL}"
    })
    @Results({
    	@Result(column="CO_ID", property="CO_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="M_ID", property="M_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="CO_name", property="CO_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CO_introduction", property="CO_introduction", jdbcType=JdbcType.VARCHAR)
    })
    List<CoursesObject> selectByModuleID(Integer M_ID);
	
	@SelectProvider(type=CoursesObjectSqlProvider.class, method="querySelective")
	@Results({
    	@Result(column="CO_ID", property="CO_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="M_ID", property="M_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="CO_name", property="CO_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CO_introduction", property="CO_introduction", jdbcType=JdbcType.VARCHAR)
    })
	List<CoursesObject> querySelective(CoursesObject courses);

	@Select({
		"select",
		"CO_ID,M_ID,CO_name,CO_introduction",
        "from courses",
        "where CO_ID=#{CO_ID,jdbcType=DECIMAL}"
    })
    @Results({
    	@Result(column="CO_ID", property="CO_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="M_ID", property="M_ID", jdbcType=JdbcType.DECIMAL),
        @Result(column="CO_name", property="CO_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CO_introduction", property="CO_introduction", jdbcType=JdbcType.VARCHAR),
    	@Result(column="M_ID", property="allClass", javaType=List.class,
			many=@Many(select="com.example.mapperdb.AllclassObjectMapper.selectByCoursesID"))
    })
	CoursesObject selectallClass(Integer CO_ID);
}
