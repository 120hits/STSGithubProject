package com.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecords {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();//this loads the hibernate.cfg.xml file
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("update Product as P set productCost = ? where P.productCost > 300");
		query.setFloat(0, 1000.56f);
		
		int result = query.executeUpdate();
		
		if(result > 0) {
			System.out.println(result + "records are updated ");
		}else {
			System.out.println("no records found");
		}
		
		tx.commit();
	}

}


/**
 *	1. same thing as show records we have to have config. session, and session factory 
 * 		- create a new Configuration and name it cfg
 * 		- load the hibernate xml file by connecting it with cfg.configure 
 * 		- create a Session and name it session
 * 		- connect the factory with session 
 * 		- use the .openSession() method and connects with the factory 
 *
 * 	2. make the query again and connect it via session.createQuery 
 * 		- name the Query query 
 * 		- using session we are gonna use the .createQuery() method together 
 * 		- now using the HQL we are gonna use the ""
 *		- and add "update Product set P.productCost = cost "	
 *			- so update from the product 
 *			- set productCost = cost 
 * 
 * 
 * 	3. next set query wit the .float() method with the param of 0, 1000.56f
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * /
 */