package com.java1234.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.StudentDao;
import com.java1234.entity.Student;
import com.java1234.service.StudentService;

/**
 * 学生信息Service实现类
 * @author 12580
 *
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Resource
	private StudentDao studentDao;
	
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
	}
	
	
}
