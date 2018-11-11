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

public class StudentTest3 {

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
	public void testFindStudetWithAddress() {
		logger.info("��ѯѧ��������ַ��");
		Student student=studentMapper.findStudentWithAddress(2);
		System.out.println(student);
	}
	
	@Test
	public void testFindStudentWithGrade() {
		logger.info("��ѯѧ�������꼶��");
		Student student=studentMapper.findStudentWithAddress(2);
		System.out.println(student);
	}

}
