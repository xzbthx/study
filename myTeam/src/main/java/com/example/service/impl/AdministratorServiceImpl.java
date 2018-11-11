package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.AdministratorObjectMapper;
import com.example.object.AdministratorObject;
import com.example.service.AdministratorService;

@Service
public class AdministratorServiceImpl implements AdministratorService{

	@Autowired
	private AdministratorObjectMapper administratorMapper;
	
	@Override
	public int insert(AdministratorObject user) {
		// TODO Auto-generated method stub
		return administratorMapper.insert(user);
	}

	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return administratorMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(AdministratorObject user) {
		// TODO Auto-generated method stub
		return administratorMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public AdministratorObject selectByID(String CO_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdministratorObject> selectAll() {
		// TODO Auto-generated method stub
		return administratorMapper.selectAll();
	}

	@Override
	public List<AdministratorObject> querySelective(AdministratorObject administratorObject) {
		// TODO Auto-generated method stub
		return administratorMapper.querySelective(administratorObject);
	}

}
