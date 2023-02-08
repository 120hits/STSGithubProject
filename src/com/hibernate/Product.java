package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Product_details")
public class Product {
@Id //primary key (unique + not null)
	private int productId;
@Column(name = "product_id")
	private String productName;
@Column(name = "product_name")
	private float productCost;
@Column(name = "product_cost")
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductCost() {
		return productCost;
	}

	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}
	
	

}


/*
 * 1. first we need to add the 3 privates  PID PN PC 
 * 2. next we need to get the getter and setter 
 * 	- by right clicking 
 * 		- source 
 * 		- generate getters and setters 
 * 3. Next we need to setup the mapping 
 * 	- add the @entity 
 * 	- which has a add-on that imports javax.persistence.Entity
 *  - add this outside the product class function 
 * 	- type Ent and hit ctrl + space find the add on to the import javax.presistence.Entity 
 * 	- Do the same thing for @Table and also import it 
 * 
 * 4. @Table, within the table map 
 * 		- we need to attach it with which table?
 * 		- we need to put it inside the () and name it
 * 		- That table name is (name = Product_details)
 * 		- don;t forget we need to add the "" for product_details 
 * 
 * 5. Maintaining primary key with @Id
 * 		- we put this inside the product class 
 * 		- same thing as @table add the additional imports 
 * 
 * 6. Give each private parameters @columns so 3 
 * 		- also name them 
 * 
 * 7. next we create a xml file by going 
 * 		
 * 7.1 right click on the HibernateProject 
 * 		- new > other > search/type xml > name the file hibernate.cfg.xml
 * 7.2 Go to google and type hibernate.cfg.xml and scroll down and copy all the xml code  
 * 7.3 and paste it inside the hibernate.cfg.xml file and remove the extra <?xml version="1.0" encoding="UTF-8"?>
 * 
 * 8. Now inside the xml file edit the dialet > mySQL5, conection driver > cj.jdbd/  and url > jdbc
 * 
 * 9. Inside the xml file change the old mapping and make your new mapping 
 * 		- with the short cut of < + ctrl + space 
 * 		- click on the mapping 
 * 		- name the class, you can also do the ctrl + space for this one like the mapping too 
 * 
 * 
 * 10. make a new class name call it HibernateClient inside the HibernateProject folder/scr 
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
 * */

