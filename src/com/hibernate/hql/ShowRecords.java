package com.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Product;

public class ShowRecords {

	public static void main(String[] args) {

		
		Configuration cfg = new Configuration() ;
		cfg.configure(); //loads the hibernate.cfg.xml file 
		
		//SF is interface 
		//BSF is a method 
		SessionFactory factory = cfg.buildSessionFactory(); //this is an old method I guess, thats why it has ---/yellow
		Session session = factory.openSession();
		
		//Query query = session.createQuery("from Product");
		Query query = session.createQuery("from Product as P where P.productCost > 600 ");
		
		List<Product> productList = query.list();
		System.out.println("Pid\tPname\tcost");
		System.out.println("======================");
		
		for (Product product : productList) {
			System.out.println(
					product.getProductId()+"\t"+ 
					product.getProductName()+"\t"+
					product.getProductCost());
		}
		
		
		
	}//main 

} //show records class 


/* 1. again like we did with the hibernate project for search, delete product 
 * 		- we have to copy the config and session/factory 
 * 
 * 
 * 2. create a query using session.query method 
 * 		- when i saw the shortcut the param showed as string 
 *		- the param is from our pojo class Product 
 *		- so we write "from Product" to grab from our pojo class
 *		- ram is also saying not from a table class 
 *		- the import for the query is org.hibernate 
 *
 *
 * 3. HQL is ALWAYS interacting with the pojo classes 
 * 		- class are already connected internally with the table 
 * 		- data class are connected with the form of list 
 * 
 * 
 * 4. next we create the direct method for the query list method 
 * 
 * 5. next we create a List<> 
 * 		- we name the list as productList 
 * 		- inside the <> the value is Product 
 * 		- then import the list as java util 
 * 		- then import the Product as com.hibernate
 *	
 *	6. all the values are mapped with the product class 
 *	
 *	7. next we will display the pid, pname, cost using sysout 
 *		- also we are making a border with the sysout "==================" 
 *
 *	8. next make a foreach method, iterate over an array 
 *		- this will make a for loop with the 
 *		- Product class and product list
 *		- next sysout product.getid/name/cost inside the foreach method 
 *			- dont forget to add the "\t" + Pname + "\t" = new line 
 *	
 *	9. next we manually added several data sets into the mysql table and applied/saved it 
 *		- when i ran the showRecord application it showed the inputed data 
 *
 *	10. inside the query wheere the param "from Product" 
 *			- we also added "as P where P.property name which is productCost > 600")
 *			- HQL hibernate query language 
 *			- HQL uses "string quotes" to execute the code 
 *			- it connects to the database and it will generate the query internally 
 *
 *
 * 
 * */
 