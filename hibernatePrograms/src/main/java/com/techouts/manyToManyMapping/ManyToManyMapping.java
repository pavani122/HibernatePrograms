package com.techouts.manyToManyMapping;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMapping {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employees e1=new Employees();
		e1.setEmpId(1232);
		e1.setEmpName("manisha");
		e1.setEmpSal(24500);
		
		Employees e2=new Employees();
		e2.setEmpId(562);
		e2.setEmpName("yashashwini");
		e2.setEmpSal(23000);
		
		Projects p1=new Projects();
		p1.setProjectId(101);
		p1.setProjectName("Online Booking System");
		
		Projects p2=new Projects();
		p2.setProjectId(102);
		p2.setProjectName("Fashion Factory System");
		
		ArrayList<Projects> projList=new ArrayList<Projects>();
		projList.add(p1);
		projList.add(p2);
		
		ArrayList<Employees> empList=new ArrayList<Employees>();
		empList.add(e1);
		empList.add(e2);
		
		e1.setProjects(projList);
		p2.setEmployees(empList);
		
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
        
		t.commit();
		factory.close();
		System.out.println("Success");
	}

}
