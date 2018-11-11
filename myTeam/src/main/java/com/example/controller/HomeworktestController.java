package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.HomeworktestObject;
import com.example.service.HomeworktestService;

@RestController
@RequestMapping("/homeworktest")
public class HomeworktestController {

	@Autowired
	private HomeworktestService HomeworktestService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		HomeworktestObject homeworktest = parse(request);
		return HomeworktestService.insert(homeworktest);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		Integer userid = Integer.valueOf(request.getParameter("htID"));
		return HomeworktestService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		HomeworktestObject homeworktest = parse(request);
		return HomeworktestService.update(homeworktest);
	}
	
	@RequestMapping("/selectByID")
	public HomeworktestObject selectByID(HttpServletRequest request) {
		HomeworktestObject HomeworktestObject = parse(request);

		HomeworktestObject homeworktest = HomeworktestService.selectByID(HomeworktestObject.getHT_ID());
		return homeworktest;
	}
	
	@RequestMapping("/selectAll")
	public List<HomeworktestObject> selectAll(HttpServletRequest request) {

		List<HomeworktestObject> homeworktest = HomeworktestService.selectAll();
		return homeworktest;
	}

	@RequestMapping("/querySelective")
	public List<HomeworktestObject> querySelective(HttpServletRequest request){
		HomeworktestObject homeworktestObject=parse(request);
		List<HomeworktestObject> homeworktest=HomeworktestService.querySelective(homeworktestObject);
		return homeworktest;
	}
	
	private HomeworktestObject parse(HttpServletRequest request) {
		String HT_ID = request.getParameter("htID");
		String L_ID = request.getParameter("lID");
		String HT_form = request.getParameter("htform");
		String HT_introduction = request.getParameter("htintroduction");
		String HT_startTime = request.getParameter("htstarttime");
		String HT_endTime = request.getParameter("htendtime");

		HomeworktestObject homeworktest = new HomeworktestObject();
		if (HT_ID != null && HT_ID.length() > 0)
			homeworktest.setHT_ID(Integer.valueOf(HT_ID));
		if (L_ID != null && L_ID.length() > 0)
			homeworktest.setL_ID(Integer.valueOf(L_ID));
		if (HT_form != null && HT_form.length() > 0)
			homeworktest.setHT_form(HT_form);
		if (HT_introduction != null && HT_introduction.length() > 0)
			homeworktest.setHT_introduction(HT_introduction);
		if (HT_startTime != null && HT_startTime.length() > 0)
			homeworktest.setHT_startTime(Long.valueOf(HT_startTime));
		if (HT_endTime != null && HT_endTime.length() > 0)
			homeworktest.setHT_endTime(Long.valueOf(HT_endTime));
		return homeworktest;
	}

}
