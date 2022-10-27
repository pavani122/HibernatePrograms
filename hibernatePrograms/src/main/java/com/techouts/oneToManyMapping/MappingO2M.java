package com.techouts.oneToManyMapping;

import java.util.ArrayList;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingO2M {

	public static void main(String[] args) {
	
		Configuration con=new Configuration().configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		Company c=new Company();
	    c.setCompanyName("Techouts");
	    c.setCompanyAddress("Hyderabad");
	    
	    Employee e=new Employee();
	    e.setEmpId(84);
	    e.setEmpName("Anitha");
	    e.setEmpSalary(20000);
	    
	    Employee e1=new Employee();
	    e1.setEmpId(134);
	    e1.setEmpName("Ani");
	    e1.setEmpSalary(20000);
	    
	    Employee e2=new Employee();
	    e2.setEmpId(24);
	    e2.setEmpName("priya");
	    e2.setEmpSalary(15670);
	    
	    ArrayList<Employee> list=new ArrayList<Employee>();
	    list.add(e);
	    list.add(e1);
	    list.add(e2);
	    e.setCompany(c);
	    e1.setCompany(c);
	    e2.setCompany(c);
	    c.setEmployee(list);
		
	    Transaction t=session.beginTransaction();
	    session.save(e);
	    session.save(e1);
	    session.save(e2);
	    session.save(c);
		
		System.out.println("...");
	  
	    t.commit();
	    factory.close();
	    
	    System.out.println("Success");
		
		
		
	}

}
