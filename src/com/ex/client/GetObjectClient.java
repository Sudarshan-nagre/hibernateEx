package com.ex.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ex.entity.Student;

public class GetObjectClient {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Student st = (Student) session.get(Student.class, 20);
		
		//Student st = (Student) session.load(Student.class, 100);
		
		System.out.println("RollNo : "+st.getRollNo());
		System.out.println("Name : "+st.getName());
		System.out.println("Email : "+st.getEmail());
		factory.close();
	}
}
