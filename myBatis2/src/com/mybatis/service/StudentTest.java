package com.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.mappers.StudentMapper;
import com.mybatis.model.Student;
import com.mybatis.util.SqlSessionFactoryUtil;

public class StudentTest {

	private static Logger logger=Logger.getLogger(StudentTest.class);
	private SqlSession sqlSession=null;
	private StudentMapper studentMapper=null;
	
	/*
	 * ���Է���ǰ����
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		studentMapper=sqlSession.getMapper(StudentMapper.class);
	}

	/*
	 * ���Է��������
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testSearchStudents() {
		logger.info("��ѯѧ��(������)");
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("gradeId", 2);
		map.put("name", "%��%");
		map.put("age", 11);
		List<Student> studentList=studentMapper.searchStudents(map);
		for(Student student:studentList) {
			System.out.println(student);
		}
	}

	@Test
	public void testSearchStudents2() {
		logger.info("��ѯѧ��(������)");
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("searchBy", "gradeId");
		map.put("gradeId", 2);
		map.put("name", "%��%");
		map.put("age", 11);
		List<Student> studentList=studentMapper.searchStudents2(map);
		for(Student student:studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testSearchStudents3() {
		logger.info("��ѯѧ��(������)");
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("gradeId", 2);
		map.put("name", "%��%");
		map.put("age", 11);
		List<Student> studentList=studentMapper.searchStudents3(map);
		for(Student student:studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testSearchStudents4() {
		logger.info("��ѯѧ��(������)");
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("gradeId", 2);
		map.put("name", "%��%");
		map.put("age", 11);
		List<Student> studentList=studentMapper.searchStudents4(map);
		for(Student student:studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testSearchStudents5() {
		logger.info("��ѯѧ��(������)");
		Map<String,Object> map=new HashMap<String,Object>();
		List<Integer> gradeIds=new ArrayList<Integer>();
		gradeIds.add(1);
		//gradeIds.add(2);
		map.put("gradeIds", gradeIds);
		List<Student> studentList=studentMapper.searchStudents5(map);
		for(Student student:studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testUpdateStudent() {
		logger.info("����ѧ��(������)");
		Student student=new Student();
		student.setId(1);
		student.setName("����2");
		student.setAge(13);
		studentMapper.updateStudent(student);
		sqlSession.commit();
	}
}
