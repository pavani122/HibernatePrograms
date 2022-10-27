package com.techouts.manyToManyMapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchEmployeesData {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		Employees e=session.get(Employees.class, 1232);
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpSal());
		List<Projects> list=e.getProjects();
		System.out.println(list.size());
		for(Projects p:list)
		{
			System.out.println(p.getProjectId()+"\t"+p.getProjectName());
		
		}
		
        System.out.println("Success");
	}

}
