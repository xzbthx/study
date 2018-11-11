package com.java1234.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> map) {
		map.put("name", "zs");
		return "index";
	}
}
