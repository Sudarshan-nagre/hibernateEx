package com.ex.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.entity.Student;

public class DeleteObjectClient {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory(); 
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setRollNo(10);
		session.delete(st);
		tx.commit();
		factory.close();
	}
}
