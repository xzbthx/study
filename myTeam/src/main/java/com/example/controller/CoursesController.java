package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.CoursesObject;
import com.example.service.CoursesService;

@RestController
@RequestMapping("/courses")
public class CoursesController {

	@Autowired
	private CoursesService coursesService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		CoursesObject courses = parse(request);
		return coursesService.insert(courses);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		Integer userid = Integer.valueOf(request.getParameter("coID"));
		return coursesService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		CoursesObject courses = parse(request);
		return coursesService.update(courses);
	}
	
	
	@RequestMapping("/selectByID")
	public CoursesObject selectByID(HttpServletRequest request) {
		CoursesObject coursesObject = parse(request);

		CoursesObject courses = coursesService.selectByID(coursesObject.getCO_ID());
		return courses;
	}
	
	@RequestMapping("/selectAll")
	public List<CoursesObject> selectAll(HttpServletRequest request) {

		List<CoursesObject> courses = coursesService.selectAll();
		return courses;
	}

	@RequestMapping("/selectallClass")
	public CoursesObject selectallclass(HttpServletRequest request) {
		CoursesObject coursesObject = parse(request);
		
		CoursesObject courses = coursesService.selectallClass(Integer.valueOf(coursesObject.getCO_ID()));
		return courses;
	}
	
	@RequestMapping("/selectByModuleID")
	public List<CoursesObject> selectByModuleID(HttpServletRequest request){
		List<CoursesObject> courses = coursesService.selectByModuleID(Integer.valueOf(request.getParameter("mID")));
		return courses;
	}
	
	@RequestMapping("/querySelective")
	public List<CoursesObject> querySelective(HttpServletRequest request){
		CoursesObject coursesObject=parse(request);
		List<CoursesObject> courses=coursesService.querySelective(coursesObject);
		return courses;
	}
	
	private CoursesObject parse(HttpServletRequest request) {
		String CO_ID = request.getParameter("coID");
		String M_ID = request.getParameter("mID");
		String CO_name = request.getParameter("coname");
		String CO_introduction = request.getParameter("cointroduction");

		CoursesObject courses = new CoursesObject();
		if (CO_ID != null && CO_ID.length() > 0)
			courses.setCO_ID(Integer.valueOf(CO_ID));
		if (CO_name != null && CO_name.length() > 0)
			courses.setCO_name(CO_name);
		if (M_ID != null && M_ID.length() > 0)
			courses.setM_ID(Integer.valueOf(M_ID));
		if (CO_introduction != null && CO_introduction.length() > 0)
			courses.setCO_introduction(CO_introduction);
		return courses;
	}

}
