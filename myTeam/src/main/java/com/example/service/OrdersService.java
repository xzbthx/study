package com.example.service;

import java.util.List;

import com.example.object.OrdersObject;

public interface OrdersService {

	int insert(OrdersObject orders);

	int delete(String ID,Integer CL_ID);

	int update(OrdersObject orders);

	OrdersObject selectByID(String ID,Integer CL_ID);

	List<OrdersObject> selectAll();

	List<OrdersObject> querySelective(OrdersObject ordersObject);

}
