package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.CommentsObject;
import com.example.service.CommentsService;

@RestController
@RequestMapping("/comments")
public class CommentsController {

	@Autowired
	private CommentsService CommentsService;

	@RequestMapping("/insert")
	public int insert(HttpServletRequest request) {
		CommentsObject Comments = parse(request);
		return CommentsService.insert(Comments);
	}

	@RequestMapping("/delete")
	public int delete(HttpServletRequest request) {
		String userid = request.getParameter("comID");
		return CommentsService.delete(userid);
	}

	@RequestMapping("/update")
	public int update(HttpServletRequest request) {
		CommentsObject Comments = parse(request);
		return CommentsService.update(Comments);
	}
	
	@RequestMapping("/selectByID")
	public CommentsObject selectByID(HttpServletRequest request) {
		CommentsObject CommentsObject = parse(request);

		CommentsObject Comments = CommentsService.selectByID(Integer.valueOf(CommentsObject.getCOM_ID()));
		return Comments;
	}
	
	@RequestMapping("/selectAll")
	public List<CommentsObject> selectAll(HttpServletRequest request) {

		List<CommentsObject> Comments = CommentsService.selectAll();
		return Comments;
	}

	@RequestMapping("/querySelective")
	public List<CommentsObject> querySelective(HttpServletRequest request){
		CommentsObject commentsObject=parse(request);
		List<CommentsObject> comments=CommentsService.querySelective(commentsObject);
		return comments;
	}
	
	private CommentsObject parse(HttpServletRequest request) {
		String COM_ID = request.getParameter("comID");
		String L_ID = request.getParameter("lID");
		String ID = request.getParameter("ID");
		String COM_information = request.getParameter("cominformation");
		String COM_time = request.getParameter("comtime");

		CommentsObject Comments = new CommentsObject();
		if (COM_ID != null && COM_ID.length() > 0)
			Comments.setCOM_ID(COM_ID);
		if (L_ID != null && L_ID.length() > 0)
			Comments.setL_ID(Integer.valueOf(L_ID));
		if (ID != null && ID.length() > 0)
			Comments.setID(ID);
		if (COM_information != null && COM_information.length() > 0)
			Comments.setCOM_information(COM_information);
		if (COM_time != null && COM_time.length() > 0)
			Comments.setCOM_time(Long.valueOf(COM_time));
		return Comments;
	}

}
