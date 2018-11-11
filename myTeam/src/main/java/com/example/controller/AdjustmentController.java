package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.AdjustmentObject;
import com.example.service.AdjustmentService;

@RestController
@RequestMapping("/adjustment")
public class AdjustmentController {

	@Autowired
	private AdjustmentService adjustmentService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		AdjustmentObject adjustment = parse(request);
		return adjustmentService.insert(adjustment);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		Integer adID = Integer.valueOf(request.getParameter("adID"));
		return adjustmentService.delete(adID);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		AdjustmentObject adjustment = parse(request);
		return adjustmentService.update(adjustment);
	}
	
	@RequestMapping("/selectByID")
	public AdjustmentObject selectByID(HttpServletRequest request) {
		AdjustmentObject adjustmentObject = parse(request);
		AdjustmentObject adjustment = adjustmentService.selectByID(adjustmentObject.getAD_ID());
		return adjustment;
	}
	
	@RequestMapping("/selectAll")
	public List<AdjustmentObject> selectAll(HttpServletRequest request) {

		List<AdjustmentObject> adjustment = adjustmentService.selectAll();
		return adjustment;
	}

	@RequestMapping("/querySelective")
	public List<AdjustmentObject> querySelective(HttpServletRequest request){
		AdjustmentObject adjustmentObject=parse(request);
		List<AdjustmentObject> adjustment=adjustmentService.querySelective(adjustmentObject);
		return adjustment;
	}
	
	private AdjustmentObject parse(HttpServletRequest request) {
		String AD_ID = request.getParameter("adID");
		String ID = request.getParameter("ID");
		String STU_ID = request.getParameter("stuID");
		String AD_time = request.getParameter("adtime");
		String AD_introduction = request.getParameter("adintroduction");

		AdjustmentObject adjustment = new AdjustmentObject();
		if (AD_ID != null && AD_ID.length() > 0)
			adjustment.setAD_ID(Integer.valueOf(AD_ID));
		if (ID != null && ID.length() > 0)
			adjustment.setID(ID);
		if (STU_ID != null && STU_ID.length() > 0)
			adjustment.setSTU_ID(STU_ID);
		if (AD_time != null && AD_time.length() > 0)
			adjustment.setAD_time(Long.parseLong(AD_time));
		if (AD_introduction != null && AD_introduction.length() > 0)
			adjustment.setAD_introduction(AD_introduction);
		return adjustment;
	}

}
