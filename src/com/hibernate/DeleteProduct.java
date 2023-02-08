package com.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteProduct {

	public static void main(String[] args) {
		Configuration cfg = new Configuration() ;
		cfg.configure(); //loads the hibernate.cfg.xml file 
		
		//SF is interface 
		//BSF is a method 
		SessionFactory factory = cfg.buildSessionFactory(); //this is an old method I guess, thats why it has ---/yellow
		Session session = factory.openSession();
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter product id in search");
		int productId = scr.nextInt();
		
		
		Transaction tx = session.beginTransaction();
		Product product = (Product) session.get(Product.class, productId);
		
		if(product != null) {
			session.delete(product);
			System.out.println("deleted successfully..");
		} else {
			System.out.println("no records found");
		} 
		
		tx.commit();
		
		scr.close();
		
		
	}

}



/* 1. we copied the configs, sessions and scanner from the search product file 
 * 
 * 2. we will change the syso inside the if statement to session.delete(product);
 * 
 * 3. when we say we are deleting from the session, 
 * 		- we are saying we are deleting from the database as well 
 * 		- hibernate session is internally configured with the map with the database table 
 * 
 * 4. even though we told the user that the table has been deleted we have to initiate the delete code 
 * 	- by using transaction like we did before 
 * 	- we input the transaction code above the session.get code 
 * 	- we name it tx and
 * 	- we also close it with the tx.commit() 
 * 
 * 5. Next so we tried to delete the mysql 200 table by running the program 
 * 		- looks like we needed to save the mysql table in the program 
 * 		- because we inputed the 200 data manually and we didn't save 
 * 		- by clicking the apply below the table 
 * 
 * 6. so now when we run the app here and type 200 it will delete the 200 table inside mysql 
 * 
 * 
 * */












