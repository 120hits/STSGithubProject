package com.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchProduct {

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
		
		Product product = (Product) session.get(Product.class, productId);
		
		if(product != null) {
		System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductCost());
		} else {
			System.out.println("no records found");
		} 
		scr.close();
		
	}

}


/* 1. copy the config, sessionfactory, session that was inside the insertProduct.java file 
 * 
 * 2. create a session.get method
 * 		- we are asking, what is that class?
 * 		- next we map the session.get method with the class 
 * 		- by inserting the class inside the session.get() parameters 
 * 		- inside the param we put product.class, as the first param 
 * 		- the .class is an primary key id 
 * 		- with the primary key we have to 
 * 		- add in the scanner method 
 * 
 * 3. add in the Scanner scr = new Scanner.(System.in);
 * 		- don't forget to import the scanner 
 * 
 * 4. next we are connecting the scanner with the int called peoductId
 * 		- by using the sce.nextInt();
 * 
 * 5. next remember the second param for the session.getmethod 
 * 		- we are setting the int productID as the second param for the session.get(x,productId)method
 * 
 * 6. after we setup the session.get method we are adding that concept inside the Product and calling it product as well 
 * 
 * 7. the right side of the session will need a cast as an product
 * 		- that will say 'add cast to product'
 * 		- after doing that the session will get a (Product) in front of the session 
 * 		- ex (Product) session.get(x,y) = casting as Product 
 * 		- it is going to return a obj 
 * 		- complete product will be returned 
 * 		- based on the primary key the product key will be returned 
 * 
 * 8. next we are sysouting(product.getProductId() + product.get.ProductName() + product.get.ProductCost());
 * 		
 * 9. we are done with the scanner method now so we have to close it with scr.close();
 * 
 * 10. we finally add if the user inputs the wrong information then we need to output "no record found" 
 * 		- we do this by adding the if and else method within our sysout 
 * 		- we need to make if product != null then sysout the id name and cost
 * 		- if wrong user input then else sysout "No records found" 
 * 
 * 11. next looks like ram forgot the sysout for the scanner input we have made in line 22 
 * 		- add in the sysout "enter product id to search" 
 *
 * 12. ram also said product id is the primary key
 * 
 * 13. so it looks like on line 26 for the session
 * 		- the second param I forgot to put the productId, before it was (product.class,args)
 * 
 * 
 * */
 