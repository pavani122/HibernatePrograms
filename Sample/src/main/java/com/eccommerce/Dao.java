package com.eccommerce;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Dao {
	
	static Configuration conf=new Configuration().configure();
	static SessionFactory factory=conf.buildSessionFactory();
	static Session session=factory.openSession();
	static Transaction t=session.beginTransaction();

	public static int saveData(UserData ud)
	{
		int i=0;
		
		UserData data=new UserData();
		data.setUserName(ud.getUserName());
		data.setEmail(ud.getEmail());
		data.setPassword(ud.getPassword());
		
		i=(Integer) session.save(data);
		System.out.println(i);
		t.commit();
		
		return i;
	}
	
	public static List<UserData> getData(List<UserData> list)
	{

		
		String query="from UserData";
		Query q=session.createQuery(query);
        list=q.list();
		return list;
	}
	
	
}















