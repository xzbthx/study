package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.LessonObject;
import com.example.service.LessonService;

@RestController
@RequestMapping("/lesson")
public class LessonController {

	@Autowired
	private LessonService lessonService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		LessonObject Lesson = parse(request);
		return lessonService.insert(Lesson);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		Integer userid = Integer.valueOf(request.getParameter("lID"));
		return lessonService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		LessonObject Lesson = parse(request);
		return lessonService.update(Lesson);
	}
	
	@RequestMapping("/selectByID")
	public LessonObject selectByID(HttpServletRequest request) {
		LessonObject lessonObject = parse(request);

		LessonObject lesson = lessonService.selectByID(lessonObject.getL_ID());
		return lesson;
	}
	
	@RequestMapping("/selectAll")
	public List<LessonObject> selectAll(HttpServletRequest request) {

		List<LessonObject> Lesson = lessonService.selectAll();
		return Lesson;
	}

	@RequestMapping("/querySelective")
	public List<LessonObject> querySelective(HttpServletRequest request){
		LessonObject lessonObject=parse(request);
		List<LessonObject> lesson=lessonService.querySelective(lessonObject);
		return lesson;
	}
	
	private LessonObject parse(HttpServletRequest request) {
		String L_ID = request.getParameter("lID");
		String CL_ID = request.getParameter("clID");
		String L_name = request.getParameter("lname");
		String L_introduction = request.getParameter("lintroduction");
		String L_startTime = request.getParameter("lstarttime");
		String L_endTime = request.getParameter("lendtime");

		LessonObject Lesson = new LessonObject();
		if (L_ID != null && L_ID.length() > 0)
			Lesson.setL_ID(Integer.valueOf(L_ID));
		if (CL_ID != null && CL_ID.length() > 0)
			Lesson.setCL_ID(Integer.valueOf(CL_ID));
		if (L_name != null && L_name.length() > 0)
			Lesson.setL_name(L_name);
		if (L_introduction != null && L_introduction.length() > 0)
			Lesson.setL_introduction(L_introduction);
		if (L_startTime != null && L_startTime.length() > 0)
			Lesson.setL_startTime(Long.valueOf(L_startTime));
		if (L_endTime != null && L_endTime.length() > 0)
			Lesson.setL_endTime(Long.valueOf(L_endTime));
		return Lesson;
	}

}
