package com.example.service;

import java.util.List;

import com.example.object.StudentObject;

public interface StudentService {

	int insert(StudentObject student);

	int delete(String ID);

	int update(StudentObject student);

	StudentObject selectByID(String ID);

	List<StudentObject> selectAll();

	List<StudentObject> querySelective(StudentObject studentObject);

}
