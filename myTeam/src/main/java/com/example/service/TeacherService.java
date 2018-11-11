package com.example.service;

import java.util.List;

import com.example.object.TeacherObject;

public interface TeacherService {

	int insert(TeacherObject teacher);

	int delete(String ID);

	int update(TeacherObject teacher);

	TeacherObject selectByID(String ID);

	List<TeacherObject> selectAll();

	List<TeacherObject> querySelective(TeacherObject teacherObject);

}
