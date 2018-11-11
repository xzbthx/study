package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory=buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		//����session����
		
		//hibernate5.1����ʹ��
		/*Configuration configuration = new Configuration().configure();//ʵ���������ļ�
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();//ʵ��������Ǽ�
		return configuration.buildSessionFactory(serviceRegistry);//����session����
		 */	
		
		//hibernate5.1������ʹ��
		StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build(); //ʵ��������Ǽ�
		SessionFactory sessionFactory=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();//����session����
		return sessionFactory;
	}
	
	//���ø÷������session����
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
