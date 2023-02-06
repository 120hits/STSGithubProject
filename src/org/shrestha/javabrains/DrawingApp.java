package org.shrestha.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class DrawingApp {

	public static void main(String[] args) {

		//this is an example if we don't use spring 
		//Triangle triangle = new Triangle ();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}



/*
 * 1. first create a new bean factory on the left 
 * 		- on the right we are gonna create a new Xml bean factory 
 * 		- inside the () xml BF we are gonna create a new FileSystemResource 
 * 			- new file will be spring.xml file system resource 
 * 2. then import all the org.springframework.xyz
 * 
 * 3. next we will create a new xml file 
 * 		- note this will relate to the one we named it for the file system resource called spring.xml in line 14 
 * 		- hover the mouse to the Springdemo and make a new xml file 
 * 
 * 4. xml file creation 
 * 		- new > other > xml folder> xml file 
 * 		- name it spring.xml 
 * 		- go inside the spring.xml file 
 * 			- click source 
 * 
 * 5. xml bean id creation in-order for the instantiated for the Triangle object.
 * 
	 * 6. Next open up in File and find the spring frame work zip folder you extracted in 
	 * 		- go to the projects folder
	 * 		- and find the applicationContext.xml file in the search bar
	 * 		- open that file inside the eclipse and 
	 * 		- copy the DOCTYPE and XML version code 
	 * 		- aka line 1 and 2
	 * 		- copy and paste it inside the spring.xml file 
	 * 			- you can delete/replace the original xml code on line 1 
 * 
 * 	   7. Now we can define all the beans that we want with the bean node <beans></beans>
 * 
 * 8. Finally adding the id for the triangle and connecting it our package and class
 * 		- create a <bean />
 * 		- <bean id "string" class"package name.Class obj Triangle" />
 * 		- <bean id="triangle" class = "org.shrestha.javabrains.Triangle" />
 * 		- the id is an reference for the class which is our package 
 * 	
 * 
 * 9. Calling the .getbean method from the factory 
 * 		- factory.getBean but this shortcut is the one for the string argument 
 * 		- factory.getBean("triangle");
 * 
 * 10. Next we need to make an instance and cast it to our Triangle object
 * 		-  Triangle name is triangle and 	
 * 		- cast into (Triangle) 
 * 		- now the obj that factory.getBean is retrieving will be casted into the (Triangle) object
 * 		- which then will be assigned my local triangle variable which is left of the code line 15
 * 
 * 
 * 11.Next we will do a new style for creating the file system resource 
 * 		- this is good because I had issues with the spring framework core io resource for somereason 
 * 		- my hypothesis was that apache and maven was not correctly installed in the system and project folder for Spring demo  
 * 
 * 
 * 
 * 12. Lets create an ApplicationContext 
 * 		- name it context 
 * 		- create a new ClassPathXmlApplicationContext()
 * 		- add ("spring.xml") inside the param of the new class path 
 * 	
 * 13. Moving the xml file inside the src folder of our SpringDemo 
 * 
 * 14. Having member variable of an triangle,
 * 		- how you can instantiate an object with the member variable preset 
 * 
 * 15. Go to the Triangle.java file 
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
 * 
 * 
 * 
 * 
 * 
 * */
 