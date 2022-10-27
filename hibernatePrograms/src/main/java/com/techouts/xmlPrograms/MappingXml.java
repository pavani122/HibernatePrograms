package com.techouts.xmlPrograms;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techouts.oneToManyMapping.Company;
import com.techouts.oneToManyMapping.Employee;

public class MappingXml {

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
	    e.setEmpSalary(20000f);
	    
	    Employee e1=new Employee();
	    e1.setEmpId(134);
	    e1.setEmpName("Ani");
	    e1.setEmpSalary(20000f);
	    
	    ArrayList<Employee> list=new ArrayList<Employee>();
	    list.add(e);
	    list.add(e1);
	    
	    e.setCompany(c);
	    e1.setCompany(c);
	    c.setEmployee(list);
		
	    Transaction t=session.beginTransaction();
	    session.save(e);
	    session.save(e1);
	    session.save(c);
	    t.commit();
	    factory.close();
	    
	    System.out.println("Success");
		
		
		
	}

}
