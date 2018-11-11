package com.example.service;

import java.util.List;

import com.example.object.CommentsObject;

public interface CommentsService {

	int insert(CommentsObject comments);

	int delete(String COM_ID);

	int update(CommentsObject comments);

	CommentsObject selectByID(Integer COM_ID);

	List<CommentsObject> selectAll();

	List<CommentsObject> querySelective(CommentsObject commentsObject);

}
