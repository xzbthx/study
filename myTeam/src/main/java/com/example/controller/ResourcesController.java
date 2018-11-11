package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.ResourcesObject;
import com.example.service.ResourcesService;

@RestController
@RequestMapping("/resources")
public class ResourcesController {

	@Autowired
	private ResourcesService ResourcesService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		ResourcesObject resources = parse(request);
		return ResourcesService.insert(resources);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		Integer userid = Integer.valueOf(request.getParameter("reID"));
		return ResourcesService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		ResourcesObject resources = parse(request);
		return ResourcesService.update(resources);
	}
	
	@RequestMapping("/selectByID")
	public ResourcesObject selectByID(HttpServletRequest request) {
		ResourcesObject ResourcesObject = parse(request);

		ResourcesObject resources = ResourcesService.selectByID(ResourcesObject.getRE_ID());
		return resources;
	}
	
	@RequestMapping("/selectAll")
	public List<ResourcesObject> selectAll(HttpServletRequest request) {

		List<ResourcesObject> resources = ResourcesService.selectAll();
		return resources;
	}

	@RequestMapping("/querySelective")
	public List<ResourcesObject> querySelective(HttpServletRequest request){
		ResourcesObject resourcesObject=parse(request);
		List<ResourcesObject> resources=ResourcesService.querySelective(resourcesObject);
		return resources;
	}
	
	private ResourcesObject parse(HttpServletRequest request) {
		String RE_ID = request.getParameter("reID");
		String L_ID = request.getParameter("lID");
		String RE_form = request.getParameter("reform");
		String RE_introduction = request.getParameter("reintroduction");

		ResourcesObject resources = new ResourcesObject();
		if (RE_ID != null && RE_ID.length() > 0)
			resources.setRE_ID(Integer.valueOf(RE_ID));
		if (L_ID != null && L_ID.length() > 0)
			resources.setL_ID(Integer.valueOf(L_ID));
		if (RE_form != null && RE_form.length() > 0)
			resources.setRE_form(RE_form);
		if (RE_introduction != null && RE_introduction.length() > 0)
			resources.setRE_introduction(RE_introduction);
		return resources;
	}

}
