package com.mybatis.service;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.mappers.GradeMapper;
import com.mybatis.mappers.StudentMapper;
import com.mybatis.model.Grade;
import com.mybatis.model.Student;
import com.mybatis.util.SqlSessionFactoryUtil;

public class GradeTest4 {

	private static Logger logger=Logger.getLogger(StudentTest.class);
	private SqlSession sqlSession=null;
	private GradeMapper gradeMapper=null;
	
	/*
	 * ���Է���ǰ����
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		gradeMapper=sqlSession.getMapper(GradeMapper.class);
	}

	/*
	 * ���Է��������
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testFindGradeWithStudents() {
		logger.info("��ѯ�꼶����ѧ����");
		Grade grade=gradeMapper.findById(2);
		System.out.println(grade);
	}

}
