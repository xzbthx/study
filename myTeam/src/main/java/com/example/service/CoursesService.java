package com.example.service;

import java.util.List;

import com.example.object.CoursesObject;

public interface CoursesService {

	int insert(CoursesObject courses);

	int delete(Integer CO_ID);

	int update(CoursesObject courses);

	CoursesObject selectByID(Integer CO_ID);

	List<CoursesObject> selectAll();
	
	List<CoursesObject> selectByModuleID(Integer M_ID);

	List<CoursesObject> querySelective(CoursesObject coursesObject);

	CoursesObject selectallClass(Integer CO_ID);

}
