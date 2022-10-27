package com.techouts.hibernatePrograms;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.Certificate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args) throws Exception
    {
        System.out.println( "Hello World!" );
        
     
      Configuration conf=new Configuration();
      conf.configure("hibernate.cfg.xml");
      SessionFactory factory=conf.buildSessionFactory();
      
      Student s=new Student();
      s.setName("pavani");
      s.setEmail("pavani.p@gmail.com");
      s.setAddress("Secunderabad");
      
      
      
      Country c=new Country();
      c.setCountryName("India");
      c.setStateName("Telangana");
      s.setCountry(c);
      
      FileInputStream fis=new FileInputStream("src/main/java/pic1.jpg");
      byte[] b=new byte[fis.available()];
      s.setImage(b);
      
      System.out.println(s);
      Session session=factory.openSession();
      Transaction t=session.beginTransaction();
      session.save(s);
      t.commit();
      session.close();
      
      System.out.println("Successful");
      
     
      
      
             
    }
    
   
}
