package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.ScObjectMapper;
import com.example.object.ScObject;
import com.example.service.ScService;

@Service
public class ScServiceImpl implements ScService{

	@Autowired
	private ScObjectMapper scMapper;
	
	@Override
	public int insert(ScObject user) {
		// TODO Auto-generated method stub
		return scMapper.insert(user);
	}

	@Override
	public int delete(String STU_ID,Integer CL_ID,String ID) {
		// TODO Auto-generated method stub
		return scMapper.deleteByPrimaryKey(STU_ID,CL_ID,ID);
	}

	@Override
	public ScObject selectByID(Integer CO_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScObject> selectAll() {
		// TODO Auto-generated method stub
		return scMapper.selectAll();
	}

	@Override
	public List<ScObject> querySelective(ScObject scObject) {
		// TODO Auto-generated method stub
		return scMapper.querySelective(scObject);
	}

}
