package com.ex.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.entity.Student;

public class UpdateObjectDemo {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory(); 
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setRollNo(20);
		st.setName("Vinayak");
		st.setEmail("vinayak@yahoo.com");
		
		session.update(st);
		tx.commit();
		factory.close();
		System.out.println("Update done !!");
	}
}
