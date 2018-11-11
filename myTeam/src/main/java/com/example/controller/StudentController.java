package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.StudentObject;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService StudentService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		StudentObject student = parse(request);
		return StudentService.insert(student);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		String userid = request.getParameter("ID");
		return StudentService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		StudentObject student = parse(request);
		return StudentService.update(student);
	}
	
	@RequestMapping("/selectByID")
	public StudentObject selectByID(HttpServletRequest request) {
		StudentObject StudentObject = parse(request);

		StudentObject student = StudentService.selectByID(StudentObject.getID());
		return student;
	}
	
	@RequestMapping("/selectAll")
	public List<StudentObject> selectAll(HttpServletRequest request) {

		List<StudentObject> student = StudentService.selectAll();
		return student;
	}

	@RequestMapping("/querySelective")
	public List<StudentObject> querySelective(HttpServletRequest request){
		StudentObject studentObject=parse(request);
		List<StudentObject> student=StudentService.querySelective(studentObject);
		return student;
	}
	
	private StudentObject parse(HttpServletRequest request) {
		String ID = request.getParameter("ID");
		String username = request.getParameter("username");
		String passwords = request.getParameter("passwords");
		String S_name = request.getParameter("sname");
		String S_sex = request.getParameter("ssex");
		String S_IDcard = request.getParameter("sIDcard");
		String S_introduction = request.getParameter("sintroduction");
		String S_qq = request.getParameter("sqq");
		String S_wei = request.getParameter("swei");
		String S_emile = request.getParameter("semile");
		String S_mobile = request.getParameter("smobile");

		StudentObject student = new StudentObject();
		if (ID != null && ID.length() > 0)
			student.setID(ID);
		if (username != null && username.length() > 0)
			student.setUsername(username);
		if (passwords != null && passwords.length() > 0)
			student.setPasswords(passwords);
		if (S_name != null && S_name.length() > 0)
			student.setS_name(S_name);
		if (S_sex != null && S_sex.length() > 0)
			student.setS_sex(S_sex);
		if (S_IDcard != null && S_IDcard.length() > 0)
			student.setS_IDcard(S_IDcard);
		if (S_introduction != null && S_introduction.length() > 0)
			student.setS_introduction(S_introduction);
		if (S_qq != null && S_qq.length() > 0)
			student.setS_qq(S_qq);
		if (S_wei != null && S_wei.length() > 0)
			student.setS_wei(S_wei);
		if (S_emile != null && S_emile.length() > 0)
			student.setS_emile(S_emile);
		if (S_mobile != null && S_mobile.length() > 0)
			student.setS_mobile(Long.valueOf(S_mobile));
		return student;
	}

}
