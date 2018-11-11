package com.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.module.Student;
import com.hibernate.util.HibernateUtil;

public class StudentService {

	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();//����һ��session
		session.beginTransaction();//��������
		
		Student s=new Student();
		s.setName("����");
		session.save(s);
		
		session.getTransaction().commit();//�ύ����
		session.close();//�ر�session
		sessionFactory.close();//�ر�session����
	}
	
}
