package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.HomeworktestObjectMapper;
import com.example.object.HomeworktestObject;
import com.example.service.HomeworktestService;

@Service
public class HomeworktestServiceImpl implements HomeworktestService{

	@Autowired
	private HomeworktestObjectMapper homeworktestMapper;
	
	@Override
	public int insert(HomeworktestObject user) {
		// TODO Auto-generated method stub
		return homeworktestMapper.insert(user);
	}

	@Override
	public int delete(Integer userid) {
		// TODO Auto-generated method stub
		return homeworktestMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(HomeworktestObject user) {
		// TODO Auto-generated method stub
		return homeworktestMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public HomeworktestObject selectByID(Integer CO_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HomeworktestObject> selectAll() {
		// TODO Auto-generated method stub
		return homeworktestMapper.selectAll();
	}

	@Override
	public List<HomeworktestObject> querySelective(HomeworktestObject homeworktestObject) {
		// TODO Auto-generated method stub
		return homeworktestMapper.querySelective(homeworktestObject);
	}

}
