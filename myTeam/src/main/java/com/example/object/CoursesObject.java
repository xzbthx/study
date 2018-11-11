package com.example.object;


import java.util.List;

import com.example.entity.AllclassInfo;
import com.example.entity.CoursesInfo;

public class CoursesObject extends CoursesInfo{

	private List<AllclassInfo> allClass;

	public List<AllclassInfo> getAllClass() {
		return allClass;
	}

	public void setAllClass(List<AllclassInfo> allclass) {
		this.allClass = allclass;
	}
}
