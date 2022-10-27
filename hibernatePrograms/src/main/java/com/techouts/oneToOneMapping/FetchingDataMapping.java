package com.techouts.oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingDataMapping {
	
	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		Object ques=session.get(Question.class, 2);
		Question obj=(Question)ques;
		System.out.println(obj);
		System.out.println(obj.getQuestion());
		Answer ans=obj.getAnswer();
		
		System.out.println(obj.getAnswer().getAnswer());
		
		System.out.println("success");
	}
	
	

}
