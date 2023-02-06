package org.shrestha.javabrains;

public class Point {
	
	//28
	int x;
	int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}


/*	29++. Create an int x and y with getters and setters. 
 * 
 * 30. INITIALIZING THE POINTS with SPRING
 * 
 * 		//previous code 
 * 		- idk if we can //comment the const args inside the spring xml so im gonna ctrl c/v here 
 * 		- below code is the previous example code 		
 * 				<constructor-arg index="0" value="equilateral"/>
				<constructor-arg index="1" value="20"/>
 * 		//previous code ^
 * 
 *
 * 	31.	 Defining a zero point with new bean and property 
 * 		- go into spring xml file 
 * 		- start a new <bean id & class>
 * 		- set the bean id to "zeroPoint" 
 * 		- set the class name to our java package org.shrestha.javabrains.Point
 * 			//add the .Point at the end of package name to connect the Point.java class 
 * 		- now like in {} inside beans {}
 * 		- put x & y (2) properties with name and values 
 * 		- <property name="x"/"y" value="0"/"1" /> (2x)
 * 
 		*we now created an bean that creates an object with the point class* 
 
  			<bean id="zeroPoint" class="org.shrestha.javabrains">  
				<property name="x" value="0"/>
				<property name="y" value="1"/>
			</bean>
 
 * 
 * 	32. 
 * - Next create 2 more bean point objs with the x value of -20 and 20 inside the spring xml file
 * - don't forget to change the bean id name to point 2 and point3 
 * - Initialize the 3 bean point objects in the drawing app 
 * 
 * - lets ask spring to get the zeroPoint obj and set it to the property tag name="zeroPoint"
 * 		- inside the BEAN triangle id 
 * 		- lets add 3 properties with name and ref= and not value 
 * 		- name each pros with the bean we created for the zeroPoint bean objs 
 * 			- prop name = "zeroPoint " 
 * 			- prop 2 name = "pointB" p3 = "pointC" 
 * 		- next reference it with the bean id for the 3 points we name 
 * 			- ref="zeroPoint" ref2="point2" ref3"point3"
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

