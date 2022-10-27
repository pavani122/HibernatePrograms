package com.techouts.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLSample {

	public static void main(String[] args) {

		Configuration con=new Configuration().configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		String query="from Employee";
		Query q=session.createQuery(query);
		
		List<Employee> list=q.list();
		for(Employee e:list)
		{
			System.out.println(e.getEmpName()+"\t"+e.getEmpSalary());
		}
     
	}

}
