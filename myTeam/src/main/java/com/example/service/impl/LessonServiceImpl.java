package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.LessonObjectMapper;
import com.example.object.LessonObject;
import com.example.service.LessonService;

@Service
public class LessonServiceImpl implements LessonService{

	@Autowired
	private LessonObjectMapper lessonMapper;
	
	@Override
	public int insert(LessonObject user) {
		// TODO Auto-generated method stub
		return lessonMapper.insert(user);
	}

	@Override
	public int delete(Integer userid) {
		// TODO Auto-generated method stub
		return lessonMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(LessonObject user) {
		// TODO Auto-generated method stub
		return lessonMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public LessonObject selectByID(Integer CO_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LessonObject> selectAll() {
		// TODO Auto-generated method stub
		return lessonMapper.selectAll();
	}

	@Override
	public List<LessonObject> querySelective(LessonObject lessonObject) {
		// TODO Auto-generated method stub
		return lessonMapper.querySelective(lessonObject);
	}

}
