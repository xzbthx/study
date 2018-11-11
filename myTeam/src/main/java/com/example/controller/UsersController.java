package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.UsersObject;
import com.example.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService UsersService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		UsersObject users = parse(request);
		return UsersService.insert(users);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		String userid = String.valueOf(request.getParameter("ID"));
		return UsersService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		UsersObject users = parse(request);
		return UsersService.update(users);
	}
	
	@RequestMapping("/selectByID")
	public UsersObject selectByID(HttpServletRequest request) {
		UsersObject UsersObject = parse(request);

		UsersObject users = UsersService.selectByID(UsersObject.getID());
		return users;
	}
	
	@RequestMapping("/selectAll")
	public List<UsersObject> selectAll(HttpServletRequest request) {

		List<UsersObject> users = UsersService.selectAll();
		return users;
	}

	@RequestMapping("/querySelective")
	public List<UsersObject> querySelective(HttpServletRequest request){
		UsersObject usersObject=parse(request);
		List<UsersObject> users=UsersService.querySelective(usersObject);
		return users;
	}
	
	private UsersObject parse(HttpServletRequest request) {
		String ID = request.getParameter("ID");
		String username = request.getParameter("username");
		String passwords = request.getParameter("passwords");

		UsersObject users = new UsersObject();
		if (ID != null && ID.length() > 0)
			users.setID(ID);
		if (username != null && username.length() > 0)
			users.setUsername(username);
		if (passwords != null && passwords.length() > 0)
			users.setPasswords(passwords);
		return users;
	}

}
