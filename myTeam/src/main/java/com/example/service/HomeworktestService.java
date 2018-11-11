package com.example.service;

import java.util.List;

import com.example.object.HomeworktestObject;

public interface HomeworktestService {

	int insert(HomeworktestObject homeworktest);

	int delete(Integer HT_ID);

	int update(HomeworktestObject homeworktest);

	HomeworktestObject selectByID(Integer HT_ID);

	List<HomeworktestObject> selectAll();

	List<HomeworktestObject> querySelective(HomeworktestObject homeworktestObject);

}
