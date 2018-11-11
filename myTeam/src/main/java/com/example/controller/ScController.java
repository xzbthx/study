package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.ScObject;
import com.example.service.ScService;

@RestController
@RequestMapping("/sc")
public class ScController {

	@Autowired
	private ScService ScService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		ScObject sc = parse(request);
		return ScService.insert(sc);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		String stuid = request.getParameter("stuID");
		Integer clid = Integer.valueOf(request.getParameter("clID"));
		String id = request.getParameter("ID");
		return ScService.delete(stuid,clid,id);
	}

	@RequestMapping("/selectByID")
	public ScObject selectByID(HttpServletRequest request) {
		ScObject ScObject = parse(request);

		ScObject sc = ScService.selectByID(Integer.valueOf(ScObject.getSTU_ID()));
		return sc;
	}
	
	@RequestMapping("/selectAll")
	public List<ScObject> selectAll(HttpServletRequest request) {

		List<ScObject> sc = ScService.selectAll();
		return sc;
	}

	@RequestMapping("/querySelective")
	public List<ScObject> querySelective(HttpServletRequest request){
		ScObject scObject=parse(request);
		List<ScObject> sc=ScService.querySelective(scObject);
		return sc;
	}
	
	private ScObject parse(HttpServletRequest request) {
		String STU_ID = request.getParameter("stuID");
		String CL_ID = request.getParameter("clID");
		String ID = request.getParameter("ID");

		ScObject sc = new ScObject();
		if (STU_ID != null && STU_ID.length() > 0)
			sc.setSTU_ID(STU_ID);
		if (CL_ID != null && CL_ID.length() > 0)
			sc.setCL_ID(Integer.valueOf(CL_ID));
		if (ID != null && ID.length() > 0)
			sc.setID(ID);
		return sc;
	}

}
