package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.OrdersObjectMapper;
import com.example.object.OrdersObject;
import com.example.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService{

	@Autowired
	private OrdersObjectMapper ordersMapper;
	
	@Override
	public int insert(OrdersObject user) {
		// TODO Auto-generated method stub
		return ordersMapper.insert(user);
	}

	@Override
	public int delete(String ID,Integer CL_ID) {
		// TODO Auto-generated method stub
		return ordersMapper.deleteByPrimaryKey(ID,CL_ID);
	}

	@Override
	public int update(OrdersObject user) {
		// TODO Auto-generated method stub
		return ordersMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public OrdersObject selectByID(String ID,Integer CL_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrdersObject> selectAll() {
		// TODO Auto-generated method stub
		return ordersMapper.selectAll();
	}

	@Override
	public List<OrdersObject> querySelective(OrdersObject ordersObject) {
		// TODO Auto-generated method stub
		return ordersMapper.querySelective(ordersObject);
	}

}
