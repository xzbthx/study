package com.example.service;

import java.util.List;

import com.example.object.ResourcesObject;

public interface ResourcesService {

	int insert(ResourcesObject resources);

	int delete(Integer RE_ID);

	int update(ResourcesObject resources);

	ResourcesObject selectByID(Integer RE_ID);

	List<ResourcesObject> selectAll();

	List<ResourcesObject> querySelective(ResourcesObject resourcesObject);

}
