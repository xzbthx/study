package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.OrdersObject;
import com.example.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersService OrdersService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		OrdersObject Orders = parse(request);
		return OrdersService.insert(Orders);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		Integer CL_ID=Integer.valueOf(request.getParameter("clID"));
		String userid = request.getParameter("ID");
		return OrdersService.delete(userid,CL_ID);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		OrdersObject Orders = parse(request);
		return OrdersService.update(Orders);
	}
	
	@RequestMapping("/selectByID")
	public OrdersObject selectByID(HttpServletRequest request) {
		OrdersObject OrdersObject = parse(request);

		OrdersObject Orders = OrdersService.selectByID(OrdersObject.getID(),OrdersObject.getCL_ID());
		return Orders;
	}
	
	@RequestMapping("/selectAll")
	public List<OrdersObject> selectAll(HttpServletRequest request) {

		List<OrdersObject> Orders = OrdersService.selectAll();
		return Orders;
	}

	@RequestMapping("/querySelective")
	public List<OrdersObject> querySelective(HttpServletRequest request){
		OrdersObject ordersObject=parse(request);
		List<OrdersObject> orders=OrdersService.querySelective(ordersObject);
		return orders;
	}
	
	private OrdersObject parse(HttpServletRequest request) {
		String ID = request.getParameter("ID");
		String CL_ID = request.getParameter("clID");
		String O_Time = request.getParameter("otime");

		OrdersObject Orders = new OrdersObject();
		if (ID != null && ID.length() > 0)
			Orders.setID(ID);
		if (CL_ID != null && CL_ID.length() > 0)
			Orders.setCL_ID(Integer.valueOf(CL_ID));
		if (O_Time != null && O_Time.length() > 0)
			Orders.setO_Time(Long.valueOf(O_Time));
		return Orders;
	}

}
