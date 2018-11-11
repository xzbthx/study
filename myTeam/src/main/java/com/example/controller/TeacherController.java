package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.TeacherObject;
import com.example.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService TeacherService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		TeacherObject teacher = parse(request);
		return TeacherService.insert(teacher);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		String userid = request.getParameter("ID");
		return TeacherService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		TeacherObject teacher = parse(request);
		return TeacherService.update(teacher);
	}
	
	@RequestMapping("/selectByID")
	public TeacherObject selectByID(HttpServletRequest request) {
		TeacherObject TeacherObject = parse(request);

		TeacherObject teacher = TeacherService.selectByID(TeacherObject.getID());
		return teacher;
	}
	
	@RequestMapping("/selectAll")
	public List<TeacherObject> selectAll(HttpServletRequest request) {

		List<TeacherObject> teacher = TeacherService.selectAll();
		return teacher;
	}

	@RequestMapping("/querySelective")
	public List<TeacherObject> querySelective(HttpServletRequest request){
		TeacherObject teacherObject=parse(request);
		List<TeacherObject> teacher=TeacherService.querySelective(teacherObject);
		return teacher;
	}
	
	private TeacherObject parse(HttpServletRequest request) {
		String ID = request.getParameter("ID");
		String username = request.getParameter("username");
		String passwords = request.getParameter("passwords");
		String T_name = request.getParameter("tname");
		String T_sex = request.getParameter("tsex");
		String T_Cnumber = request.getParameter("tCnumber");
		String T_introduction = request.getParameter("tintroduction");
		String T_IDcard = request.getParameter("tIDcard");
		String T_QQ = request.getParameter("tqq");
		String T_wei = request.getParameter("twei");
		String T_emile = request.getParameter("temile");
		String T_mobile = request.getParameter("tmobile");

		TeacherObject teacher = new TeacherObject();
		if (ID != null && ID.length() > 0)
			teacher.setID(ID);
		if (username != null && username.length() > 0)
			teacher.setUsername(username);
		if (passwords != null && passwords.length() > 0)
			teacher.setPasswords(passwords);
		if (T_name != null && T_name.length() > 0)
			teacher.setT_name(T_name);
		if (T_sex != null && T_sex.length() > 0)
			teacher.setT_sex(T_sex);
		if (T_Cnumber != null && T_Cnumber.length() > 0)
			teacher.setT_Cnumber(T_Cnumber);
		if (T_IDcard != null && T_IDcard.length() > 0)
			teacher.setT_IDcard(T_IDcard);
		if (T_introduction != null && T_introduction.length() > 0)
			teacher.setT_introduction(T_introduction);
		if (T_QQ != null && T_QQ.length() > 0)
			teacher.setT_QQ(T_QQ);
		if (T_wei != null && T_wei.length() > 0)
			teacher.setT_wei(T_wei);
		if (T_emile != null && T_emile.length() > 0)
			teacher.setT_emile(T_emile);
		if (T_mobile != null && T_mobile.length() > 0)
			teacher.setT_mobile(Long.valueOf(T_mobile));
		return teacher;
	}

}
