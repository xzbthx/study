package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	private static List<Student> studentList=new ArrayList<Student>();
	
	static {
		studentList.add(new Student(1,"����",11));
		studentList.add(new Student(2,"����",12));
		studentList.add(new Student(3,"����",13));
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("studentList",studentList);
		mav.setViewName("student/list");
		return mav;
	}
	
	@RequestMapping("/preSave")
	public ModelAndView preSave(@RequestParam(value="id",required=false)String id) {
		ModelAndView mav=new ModelAndView();
		if(id!=null) {
			mav.addObject("student",studentList.get(Integer.parseInt(id)-1));
			mav.setViewName("student/update");
		}else {
			mav.setViewName("student/add");
		}
		return mav;
	}
	
	@RequestMapping("/save")
	public String save(Student student) {
		if(student.getId()!=0) {
			Student s=studentList.get(student.getId()-1);
			s.setName(student.getName());
			s.setAge(student.getAge());
		}else {
			studentList.add(student);
		}
		return "redirect:/student/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id")int id) {
		studentList.remove(id-1);
		return "redirect:/student/list.do";
	}
}
