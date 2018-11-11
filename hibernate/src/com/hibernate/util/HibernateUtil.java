package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory=buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		//创建session工厂
		
		//hibernate5.1以下使用
		/*Configuration configuration = new Configuration().configure();//实例化配置文件
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();//实例化服务登记
		return configuration.buildSessionFactory(serviceRegistry);//返回session工厂
		 */	
		
		//hibernate5.1及以上使用
		StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build(); //实例化服务登记
		SessionFactory sessionFactory=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();//创建session工厂
		return sessionFactory;
	}
	
	//调用该方法获得session工厂
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
