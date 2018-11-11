package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.ResourcesObjectMapper;
import com.example.object.ResourcesObject;
import com.example.service.ResourcesService;

@Service
public class ResourcesServiceImpl implements ResourcesService{

	@Autowired
	private ResourcesObjectMapper resourcesMapper;
	
	@Override
	public int insert(ResourcesObject user) {
		// TODO Auto-generated method stub
		return resourcesMapper.insert(user);
	}

	@Override
	public int delete(Integer userid) {
		// TODO Auto-generated method stub
		return resourcesMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(ResourcesObject user) {
		// TODO Auto-generated method stub
		return resourcesMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public ResourcesObject selectByID(Integer CO_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourcesObject> selectAll() {
		// TODO Auto-generated method stub
		return resourcesMapper.selectAll();
	}

	@Override
	public List<ResourcesObject> querySelective(ResourcesObject resourcesObject) {
		// TODO Auto-generated method stub
		return resourcesMapper.querySelective(resourcesObject);
	}

}
