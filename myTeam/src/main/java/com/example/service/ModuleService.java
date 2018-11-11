package com.example.service;

import java.util.List;

import com.example.object.ModuleObject;

public interface ModuleService {

	int insert(ModuleObject module);

	int delete(Integer M_ID);

	int update(ModuleObject module);

	ModuleObject selectByID(Integer M_ID);

	List<ModuleObject> selectAll();

	ModuleObject selectallCourses(Integer M_ID);
	
	List<ModuleObject> querySelective(ModuleObject moduleObject);
}
