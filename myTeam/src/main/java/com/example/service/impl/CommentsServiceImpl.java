package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.CommentsObjectMapper;
import com.example.object.CommentsObject;
import com.example.service.CommentsService;

@Service
public class CommentsServiceImpl implements CommentsService{

	@Autowired
	private CommentsObjectMapper commentsMapper;
	
	@Override
	public int insert(CommentsObject user) {
		// TODO Auto-generated method stub
		return commentsMapper.insert(user);
	}

	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return commentsMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(CommentsObject user) {
		// TODO Auto-generated method stub
		return commentsMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public CommentsObject selectByID(Integer CO_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommentsObject> selectAll() {
		// TODO Auto-generated method stub
		return commentsMapper.selectAll();
	}

	@Override
	public List<CommentsObject> querySelective(CommentsObject commentsObject) {
		// TODO Auto-generated method stub
		return commentsMapper.querySelective(commentsObject);
	}

}
