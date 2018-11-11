package com.example.service;

import java.util.List;

import com.example.object.LessonObject;

public interface LessonService {

	int insert(LessonObject lesson);

	int delete(Integer L_ID);

	int update(LessonObject lesson);

	LessonObject selectByID(Integer L_ID);

	List<LessonObject> selectAll();

	List<LessonObject> querySelective(LessonObject lessonObject);

}
