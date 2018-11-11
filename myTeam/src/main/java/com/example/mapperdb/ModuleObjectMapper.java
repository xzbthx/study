package com.example.mapperdb;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.example.mapper.ModuleInfoMapper;
import com.example.object.ModuleObject;

public interface ModuleObjectMapper extends ModuleInfoMapper{
	@Select({
        "select *",
        "from module",
    })
    @Results({
    	@Result(column="M_ID", property="M_ID", jdbcType=JdbcType.CHAR,id=true),
        @Result(column="M_name", property="M_name", jdbcType=JdbcType.CHAR),
    })
	List<ModuleObject> selectAll();

	@Select({
        "select",
        "M_ID,M_name",
        "from module",
        "where M_ID = #{M_ID,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="M_ID", property="M_ID", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="M_name", property="M_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="M_ID", property="allCourses", javaType=List.class,
			many=@Many(select="com.example.mapperdb.CoursesObjectMapper.selectByModuleID"))
    })
    ModuleObject selectallCourses(Integer M_ID);
	
	@SelectProvider(type=ModuleObjectSqlProvider.class, method="querySelective")
    @Results({
    	@Result(column="M_ID", property="M_ID", jdbcType=JdbcType.DECIMAL,id=true),
        @Result(column="M_name", property="M_name", jdbcType=JdbcType.VARCHAR)
    })
	List<ModuleObject> querySelective(ModuleObject module);

}
