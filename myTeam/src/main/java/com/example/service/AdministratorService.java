package com.example.service;

import java.util.List;

import com.example.object.AdministratorObject;

public interface AdministratorService {

	int insert(AdministratorObject administrator);

	int delete(String ID);

	int update(AdministratorObject administrator);

	AdministratorObject selectByID(String ID);

	List<AdministratorObject> selectAll();

	List<AdministratorObject> querySelective(AdministratorObject administratorObject);

}
