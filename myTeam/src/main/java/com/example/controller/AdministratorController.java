package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.AdministratorObject;
import com.example.service.AdministratorService;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

	@Autowired
	private AdministratorService administratorService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		AdministratorObject administrator = parse(request);
		return administratorService.insert(administrator);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		String ID = request.getParameter("ID");
		return administratorService.delete(ID);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		AdministratorObject administrator = parse(request);
		return administratorService.update(administrator);
	}
	
	@RequestMapping("/selectByID")
	public AdministratorObject selectByID(HttpServletRequest request) {
		AdministratorObject administratorObject = parse(request);

		AdministratorObject administrator = administratorService.selectByID(administratorObject.getID());
		return administrator;
	}
	
	@RequestMapping("/selectAll")
	public List<AdministratorObject> selectAll(HttpServletRequest request) {

		List<AdministratorObject> administrator = administratorService.selectAll();
		return administrator;
	}

	@RequestMapping("/querySelective")
	public List<AdministratorObject> querySelective(HttpServletRequest request){
		AdministratorObject administratorObject=parse(request);
		List<AdministratorObject> administrator=administratorService.querySelective(administratorObject);
		return administrator;
	}
	
	private AdministratorObject parse(HttpServletRequest request) {
		String ID = request.getParameter("ID");
		String username = request.getParameter("username");
		String passwords = request.getParameter("passwords");
		String A_struts = request.getParameter("astruts");

		AdministratorObject administrator = new AdministratorObject();
		if (ID != null && ID.length() > 0)
			administrator.setID(ID);
		if (username != null && username.length() > 0)
			administrator.setUsername(username);
		if (passwords != null && passwords.length() > 0)
			administrator.setPasswords(passwords);
		if (A_struts != null && A_struts.length() > 0)
			administrator.setA_struts(Integer.valueOf(A_struts));
		return administrator;
	}

}
