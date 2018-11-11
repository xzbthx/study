package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.ModuleObject;
import com.example.service.ModuleService;

@RestController
@RequestMapping("/module")
public class ModuleController {

	@Autowired
	private ModuleService ModuleService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		ModuleObject module = parse(request);
		return ModuleService.insert(module);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		Integer userid = Integer.valueOf(request.getParameter("mID"));
		return ModuleService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		ModuleObject module = parse(request);
		return ModuleService.update(module);
	}
	
	@RequestMapping("/selectByID")
	public ModuleObject selectByID(HttpServletRequest request) {
		ModuleObject ModuleObject = parse(request);

		ModuleObject module = ModuleService.selectByID(ModuleObject.getM_ID());
		return module;
	}
	
	@RequestMapping("/selectAll")
	public List<ModuleObject> selectAll(HttpServletRequest request) {

		List<ModuleObject> module = ModuleService.selectAll();
		return module;
	}

	@RequestMapping("/selectallCourses")
	public ModuleObject selectallCourses(HttpServletRequest request) {
		ModuleObject moduleObject = parse(request);
		
		ModuleObject module = ModuleService.selectallCourses(moduleObject.getM_ID());
		return module;
	}
	
	@RequestMapping("/querySelective")
	public List<ModuleObject> querySelective(HttpServletRequest request){
		ModuleObject moduleObject=parse(request);
		List<ModuleObject> module=ModuleService.querySelective(moduleObject);
		return module;
	}
	
	private ModuleObject parse(HttpServletRequest request) {
		String M_ID = request.getParameter("mID");
		String M_name = request.getParameter("mname");

		ModuleObject module = new ModuleObject();
		if (M_ID != null && M_ID.length() > 0)
			module.setM_ID(Integer.valueOf(M_ID));
		if (M_name != null && M_name.length() > 0)
			module.setM_name(M_name);
		return module;
	}

}
