package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertProduct {

	public static void main(String[] args) {
		Configuration cfg = new Configuration() ;
		cfg.configure(); //loads the hibernate.cfg.xml file 
		
		//SF is interface 
		//BSF is a method 
		SessionFactory factory = cfg.buildSessionFactory(); //this is an old method I guess, thats why it has ---/yellow
		Session session = factory.openSession();
		
		
		Transaction tx = session.beginTransaction();
		Product p1 = new Product();
		p1.setProductId(100);
		p1.setProductName("Apple");
		p1.setProductCost(1000);
		
		session.save(p1); //saving product object into hibernate session 
		System.out.println("Record inserted successfully");
		tx.commit();
		
	}

}



/* 1. after we have copied the code with configure and session/ factory code 
 * 
 * 2. Next the class we had call Product and name it p1 which hold the 3 product items we are gonna set/connect it
 * 		- with setters and getters using the .set method, right now we are giving default values 
 * 
 * 3. now with the p1 set it and connect it with setProductId,name, cost that is inside the product file 
 * 		
 * 4. Next set the values for the 3 product properties
 * 
 * 5. After we set the values next we have to save the object in session 
 * 		- using session and the .save() method
 * 		- add the p1 that we named for out product 
 * 		- we don't need to use "" for the p1 part 
 * 6. Our hibernate is connected to the database 
 * 
 * 
 * 7. After we save the obj we have to commit the operation 
 * 
 * 8. By using the transaction interface and name it tx, put it above the Product p1
 * 
 * 9. Next connect it with session 
 * 		- and add the .beginTransaction() method
 * 		- import the or.hibernate.Transacton by hovering the mouse to the Transaction 
 * 	 
 * 10. Next we have to commit the tx with tx.commit(); and code it below the session.save() method.
 * 
 * 
 * 11. next we are gonna syso above the commit method 
 * 
 * 12. if you haven't logged in the mysql server in a while, the server might be offline 
 * 
 * 13. you can find the instructions in my rohit2020 google keep for gettting the server back on 
 * 
 * 14. next you will create a new hibernate file called SearchProduct and add in the main 
 * 
 * 
 * 
 * 
 * 
 * */

























