package com.example.object;

import java.util.List;

import com.example.entity.CoursesInfo;
import com.example.entity.ModuleInfo;

public class ModuleObject extends ModuleInfo{

	private List<CoursesInfo> allCourses;

	public List<CoursesInfo> getAllCourses() {
		return allCourses;
	}

	public void setAllCourses(List<CoursesInfo> allCourses) {
		this.allCourses = allCourses;
	}
	
	
}
