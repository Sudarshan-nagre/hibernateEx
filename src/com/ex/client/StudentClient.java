package com.ex.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.ex.entity.Student;

public class StudentClient {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setRollNo(30);
		st.setName("Vinay");
		st.setEmail("vinay@gmail.com");
		
		session.close();  
		session.clear();  
		session.evict(st);   
		
		session.save(st);
		tx.commit();
		factory.close();
		
		System.out.println("Done !!!!");
	}
}
