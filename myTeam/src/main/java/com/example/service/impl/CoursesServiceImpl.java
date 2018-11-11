package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.service.CoursesService;
import com.example.mapperdb.CoursesObjectMapper;
import com.example.object.CoursesObject;

@Service
public class CoursesServiceImpl implements CoursesService{

	@Autowired
	private CoursesObjectMapper coursesMapper;
	
	@Override
	public int insert(CoursesObject user) {
		// TODO Auto-generated method stub
		return coursesMapper.insert(user);
	}

	@Override
	public int delete(Integer userid) {
		// TODO Auto-generated method stub
		return coursesMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(CoursesObject user) {
		// TODO Auto-generated method stub
		return coursesMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public CoursesObject selectByID(Integer CO_ID) {
		// TODO Auto-generated method stub
		return coursesMapper.selectByPrimaryKey(CO_ID);
	}

	@Override
	public List<CoursesObject> selectAll() {
		// TODO Auto-generated method stub
		return coursesMapper.selectAll();
	}

	@Override
	public List<CoursesObject> selectByModuleID(Integer M_ID) {
		// TODO Auto-generated method stub
		return coursesMapper.selectByModuleID(M_ID);
	}

	@Override
	public List<CoursesObject> querySelective(CoursesObject coursesObject) {
		// TODO Auto-generated method stub
		return coursesMapper.querySelective(coursesObject);
	}

	@Override
	public CoursesObject selectallClass(Integer CO_ID) {
		// TODO Auto-generated method stub
		return coursesMapper.selectallClass(CO_ID);
	}

}
