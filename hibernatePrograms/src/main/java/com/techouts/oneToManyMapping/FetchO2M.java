package com.techouts.oneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchO2M {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		Company c=session.get(Company.class,1);
		System.out.println(c.getCompanyName());
		System.out.println(c.getCompanyAddress());
		
		List<Employee> list=c.getEmployee();
		for(Employee e:list)
		{
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpSalary());
		}
		
		
		
	}

}
