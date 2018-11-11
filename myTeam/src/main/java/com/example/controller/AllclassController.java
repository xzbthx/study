package com.example.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.AllclassObject;
import com.example.service.AllclassService;

@RestController
@RequestMapping("/allclass")
public class AllclassController {

	@Autowired
	private AllclassService allclassService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		AllclassObject allclass = parse(request);
		return allclassService.insert(allclass);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		Integer userid = Integer.valueOf(request.getParameter("clID"));
		return allclassService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		AllclassObject allclass = parse(request);
		return allclassService.update(allclass);
	}
	
	@RequestMapping("/selectByID")
	public AllclassObject selectByID(HttpServletRequest request) {
		AllclassObject AllclassObject = parse(request);
		AllclassObject allclass = allclassService.selectByID(AllclassObject.getCO_ID());
		return allclass;
	}
	
	@RequestMapping("/selectAll")
	public List<AllclassObject> selectAll(HttpServletRequest request) {
		List<AllclassObject> allclass = allclassService.selectAll();
		return allclass;
	}

	@RequestMapping("/selectByCoursesID")
	public List<AllclassObject> selectByCoursesID(HttpServletRequest request){
		List<AllclassObject> allclass=allclassService.selectByCoursesID(Integer.valueOf(request.getParameter("coID")));
		return allclass;
	}
	
	@RequestMapping("/querySelective")
	public List<AllclassObject> querySelective(HttpServletRequest request){
		AllclassObject allclassObject=parse(request);
		List<AllclassObject> allclass=allclassService.querySelective(allclassObject);
		return allclass;
	}
	
	private AllclassObject parse(HttpServletRequest request) {
		String CL_ID = request.getParameter("clID");
		String CO_ID = request.getParameter("coID");
		String ID = request.getParameter("ID");
		String CL_name = request.getParameter("clname");
		String CL_capacity = request.getParameter("clcapacity");
		String CL_number = request.getParameter("clnumber");
		String CL_price = request.getParameter("clprice");
		String CL_startTime = request.getParameter("clstarttime");
		String CL_endTime = request.getParameter("clendtime");

		AllclassObject allclass = new AllclassObject();
		if (CL_ID != null && CL_ID.length() > 0)
			allclass.setCL_ID(Integer.valueOf(CL_ID));
		if (CO_ID != null && CO_ID.length() > 0)
			allclass.setCO_ID(Integer.valueOf(CO_ID));
		if (ID != null && ID.length() > 0)
			allclass.setID(ID);
		if (CL_name != null && CL_name.length() > 0)
			allclass.setCL_name(CL_name);
		if (CL_capacity != null && CL_capacity.length() > 0)
			allclass.setCL_capacity(Integer.valueOf(CL_capacity));
		if (CL_number != null && CL_number.length() > 0)
			allclass.setCL_number(Integer.valueOf(CL_number));
		if (CL_price != null && CL_price.length() > 0)
			allclass.setCL_price(BigDecimal.valueOf(Long.valueOf(CL_price)));
		if (CL_startTime != null && CL_startTime.length() > 0)
			allclass.setCL_startTime(Long.valueOf(CL_startTime));
		if (CL_endTime != null && CL_endTime.length() > 0)
			allclass.setCL_endTime(Long.valueOf(CL_endTime));
		return allclass;
	}

}
