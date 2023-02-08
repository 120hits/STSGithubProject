package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration() ;
		cfg.configure(); //loads the hibernate.cfg.xml file 
		
		//SF is interface 
		//BSF is a method 
		SessionFactory factory = cfg.buildSessionFactory(); //this is an old method I guess, thats why it has ---/yellow
		Session session = factory.openSession();
		
		System.out.println("Table created...");
		session.close();
		factory.close();
		
	}

}


/* 1. inside the main, make a configuration class, by typing configuration + ctrl + space 
 * 
 * 1.2 then match it with the org and cfg and select that and it will import the org.hibernate.cfg.Configuration 
 * 
 * 2. next in a new line type cfg.configuration(); //loads the hinernate.cfg.xml file automatically 
 * 
 * 3. Next create a session factory interface and call it factory, don't forget to import the session factory 
 * 
 * 4. Connect the session factory with the cfg 
 * 
 * 5. with the same session factory and cfg, connect the cfg with the build session factory method() 
 * 
 * 6. Create a Session, call it session, and import it as well 
 * 
 * 7. we have to create a product table, we can do that within the xml file 
 * 		- and make a new property <> 
 * 		- name it "hibernate.hbm2ddl.auto"
 * 		- outside the <> add the <>update<>
 * 8. if the table is there.created then it will update the table automatically 
 * 
 * 
 * 9. Come back to this file and close the session and factory like we did with the scr.close()
 * 
 * 10. Finish it off with the sysout saying "Table created..."
 * 
 * 
 * 11. make anew class called Insert product and copy the 
 * 		- Configuration code
 * 		- session/factory code as well into the insert production class 
 * 
 * 
 * 
 * 
 * 
 * */
 