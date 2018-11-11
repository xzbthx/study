package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.ModuleObjectMapper;
import com.example.object.ModuleObject;
import com.example.service.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService{

	@Autowired
	private ModuleObjectMapper moduleMapper;
	
	@Override
	public int insert(ModuleObject user) {
		// TODO Auto-generated method stub
		return moduleMapper.insert(user);
	}

	@Override
	public int delete(Integer userid) {
		// TODO Auto-generated method stub
		return moduleMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(ModuleObject user) {
		// TODO Auto-generated method stub
		return moduleMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public ModuleObject selectByID(Integer userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModuleObject> selectAll() {
		// TODO Auto-generated method stub
		return moduleMapper.selectAll();
	}

	@Override
	public ModuleObject selectallCourses(Integer M_ID) {
		// TODO Auto-generated method stub
		return moduleMapper.selectallCourses(M_ID);
	}

	@Override
	public List<ModuleObject> querySelective(ModuleObject moduleObject) {
		// TODO Auto-generated method stub
		return moduleMapper.querySelective(moduleObject);
	}

}
