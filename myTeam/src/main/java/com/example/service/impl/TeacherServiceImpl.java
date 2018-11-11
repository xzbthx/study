package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.TeacherObjectMapper;
import com.example.object.TeacherObject;
import com.example.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherObjectMapper teacherMapper;
	
	@Override
	public int insert(TeacherObject user) {
		// TODO Auto-generated method stub
		return teacherMapper.insert(user);
	}

	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return teacherMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(TeacherObject user) {
		// TODO Auto-generated method stub
		return teacherMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public TeacherObject selectByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeacherObject> selectAll() {
		// TODO Auto-generated method stub
		return teacherMapper.selectAll();
	}

	@Override
	public List<TeacherObject> querySelective(TeacherObject teacherObject) {
		// TODO Auto-generated method stub
		return teacherMapper.querySelective(teacherObject);
	}

}
