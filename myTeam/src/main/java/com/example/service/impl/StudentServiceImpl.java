package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.StudentObjectMapper;
import com.example.object.StudentObject;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentObjectMapper studentMapper;
	
	@Override
	public int insert(StudentObject user) {
		// TODO Auto-generated method stub
		return studentMapper.insert(user);
	}

	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return studentMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(StudentObject user) {
		// TODO Auto-generated method stub
		return studentMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public StudentObject selectByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentObject> selectAll() {
		// TODO Auto-generated method stub
		return studentMapper.selectAll();
	}

	@Override
	public List<StudentObject> querySelective(StudentObject studentObject) {
		// TODO Auto-generated method stub
		return studentMapper.querySelective(studentObject);
	}

}
