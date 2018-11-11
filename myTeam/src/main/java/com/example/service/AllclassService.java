package com.example.service;

import java.util.List;

import com.example.object.AllclassObject;

public interface AllclassService {

	int insert(AllclassObject allclass);

	int delete(Integer CL_ID);

	int update(AllclassObject allclass);

	AllclassObject selectByID(Integer CL_ID);

	List<AllclassObject> selectAll();

	List<AllclassObject> querySelective(AllclassObject allclassObject);

	List<AllclassObject> selectByCoursesID(Integer CO_ID);

}
