package com.example.service;

import java.util.List;

import com.example.object.UsersObject;

public interface UsersService {

	int insert(UsersObject users);

	int delete(String ID);

	int update(UsersObject users);

	UsersObject selectByID(String ID);

	List<UsersObject> selectAll();

	List<UsersObject> querySelective(UsersObject usersObject);

}
