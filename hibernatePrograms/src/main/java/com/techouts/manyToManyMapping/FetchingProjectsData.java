package com.techouts.manyToManyMapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingProjectsData {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		Projects p=session.get(Projects.class, 102);
		System.out.println(p.getProjectId());
		System.out.println(p.getProjectName());
		
		List<Employees> list=p.getEmployees();
		for(Employees e:list)
		{
			System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSal());
			
			
		}
		
		System.out.println("success");

	}

}
