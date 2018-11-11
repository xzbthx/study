package com.mybatis.service;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.mappers.StudentMapper;
import com.mybatis.model.Student;
import com.mybatis.util.SqlSessionFactoryUtil;

public class StudentTest2 {

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
	public void testAdd() {
		logger.info("���ѧ��");
		Student student=new Student("����",12);
		studentMapper.add(student);
		sqlSession.commit();
	}

	@Test
	public void testUpdate() {
		logger.info("�޸�ѧ��");
		Student student=new Student(8,"����",13);
		studentMapper.update(student);
		sqlSession.commit();
	}
	
	@Test
	public void testDelete() {
		logger.info("ɾ��ѧ��");
		studentMapper.delete(8);
		sqlSession.commit();
	}
	
	@Test
	public void testFindById() {
		logger.info("ͨ��ID����ѧ��");
		Student student=studentMapper.findById(1);
		System.out.println(student);
	}
	
	@Test
	public void testFind() {
		logger.info("��������ѧ��");
		List<Student> studentList=studentMapper.find();
		for(Student s:studentList) {
			System.out.println(s);
		}
	}
}
