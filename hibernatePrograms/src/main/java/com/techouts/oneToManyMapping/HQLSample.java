package com.techouts.oneToManyMapping;

import java.util.Arrays;
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
		
		String query="from Employee where id=84";
		Query q=session.createQuery(query);
		
		List<Employee> list=q.list();
		for(Employee e:list)
		{
			System.out.println(e.getEmpName()+"\t"+e.getEmpSalary());
		}
		
		
		Query q1=session.createQuery("select e.empName,e.empId,c.companyName from Employee as e"
				+ "InnerJoin "
				+ "Company as c");
     
		List<Object[]> list1=q1.list();
		for(Object[] o:list1)
		{
			System.out.println(Arrays.toString(o));
		}
	}

}
