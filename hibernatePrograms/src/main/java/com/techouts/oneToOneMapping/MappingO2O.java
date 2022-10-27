package com.techouts.oneToOneMapping;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingO2O {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter question:");
		String question=sc.nextLine();
		System.out.println("Enter answer:");
		String answer=sc.nextLine();
		
		Configuration con=new Configuration().configure();
		SessionFactory factory=con.buildSessionFactory();
		
		Question que=new Question();
		que.setQuestion(question);
		
		Answer ans=new Answer();
		ans.setAnswer(answer);
		que.setAnswer(ans);
		
		
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		session.save(que);
		session.save(ans);
		t.commit();
		factory.close();

		System.out.println("success");
	}

}
