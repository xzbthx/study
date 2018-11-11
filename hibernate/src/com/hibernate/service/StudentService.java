package com.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.module.Student;
import com.hibernate.util.HibernateUtil;

public class StudentService {

	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();//生成一个session
		session.beginTransaction();//开启事务
		
		Student s=new Student();
		s.setName("张三");
		session.save(s);
		
		session.getTransaction().commit();//提交事务
		session.close();//关闭session
		sessionFactory.close();//关闭session工厂
	}
	
}
