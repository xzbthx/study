package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.UsersObjectMapper;
import com.example.object.UsersObject;
import com.example.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersObjectMapper usersMapper;
	
	@Override
	public int insert(UsersObject user) {
		// TODO Auto-generated method stub
		return usersMapper.insert(user);
	}

	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return usersMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(UsersObject user) {
		// TODO Auto-generated method stub
		return usersMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public UsersObject selectByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsersObject> selectAll() {
		// TODO Auto-generated method stub
		return usersMapper.selectAll();
	}

	@Override
	public List<UsersObject> querySelective(UsersObject usersObject) {
		// TODO Auto-generated method stub
		return usersMapper.querySelective(usersObject);
	}

}
