package com.yiibai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentsController {

	@RequestMapping(value="/student",method=RequestMethod.GET)
	public String index() {
		return "student";
	}
}
