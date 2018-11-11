package com.example.service;

import java.util.List;

import com.example.object.ScObject;

public interface ScService {

	int insert(ScObject Sc);

	int delete(String STU_ID, Integer CL_ID, String ID);
	
	ScObject selectByID(Integer STU_ID);

	List<ScObject> selectAll();

	List<ScObject> querySelective(ScObject scObject);

}
