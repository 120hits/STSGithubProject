package com.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecords {

	public static void main(String[] args) {
		
	Configuration cfg = new Configuration();
	cfg.configure();//this loads the hibernate.cfg.xml file
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	Transaction tx = session.beginTransaction();
	Query query = session.createQuery("delete from Product as P where P.productCost > 1000");
	
	int result = query.executeUpdate();
	
	if(result > 0) {
		System.out.println(result + "records are deleted ");
	}else {
		System.out.println("no records found");
	}
	
	tx.commit();
	}

}




/*	1. same thing as show records we have to have config. session, and session factory 
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
 *		- and add "delete from Product as P where P.productCost "	
 *			- so delete from the product 
 *			- where is under the product cost property 
 *
 * 
 * 	3. create an integer and name it result
 * 		- result will contain 
 * 			- an query with the .executeUpdate() method
 * 
 * 
 * 	4. make an if statement with result being greater than 0 
 * 		- sysout the result + " description saying " Record are deleted" 
 * 
 * 
 * 	5. next commit an transaction with the beginTransaction() method 
 * 		- this has to be placed above the sessionQuery method()
 * 		- create an Transaction and name it tx
 * 		- tx contains the session.beginTranaction()  method
 * 		- commit the transaction with the tx.commit() method outside the if statement 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 