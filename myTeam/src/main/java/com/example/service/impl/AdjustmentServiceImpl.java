package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.AdjustmentObjectMapper;
import com.example.object.AdjustmentObject;
import com.example.service.AdjustmentService;

@Service
public class AdjustmentServiceImpl implements AdjustmentService{

	@Autowired
	private AdjustmentObjectMapper adjustmentMapper;
	
	@Override
	public int insert(AdjustmentObject user) {
		// TODO Auto-generated method stub
		return adjustmentMapper.insert(user);
	}

	@Override
	public int delete(Integer userid) {
		// TODO Auto-generated method stub
		return adjustmentMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(AdjustmentObject user) {
		// TODO Auto-generated method stub
		return adjustmentMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public AdjustmentObject selectByID(Integer CO_ID) {
		// TODO Auto-generated method stub
		return adjustmentMapper.selectByID(CO_ID);
	}

	@Override
	public List<AdjustmentObject> selectAll() {
		// TODO Auto-generated method stub
		return adjustmentMapper.selectAll();
	}

	@Override
	public List<AdjustmentObject> querySelective(AdjustmentObject adjustmentObject) {
		// TODO Auto-generated method stub
		return adjustmentMapper.querySelective(adjustmentObject);
	}

}
