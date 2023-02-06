package org.shrestha.javabrains;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	
	
	
	
	
	
	
	
	
	//16
//	private String type;
//	
	//24
//	//adding another member var for the const args w/ getters only 
//	private int height;
//	
//	public int getHeight() {
//		return height;
//	}
//
	
	//22
//	//const W/ 1 PARAM
//	// type is set to the this member variable 
//	public Triangle(String type) {
//		this.type = type;
//	}
//	
//	public Triangle(int height) {
//		this.height = height;
//	}
//	
	//25
//	//copied the same Triangle const w/ 2 params 
//	//adding this.height = height;
//	public Triangle(String type, int height) {
//		this.type = type;
//		this.height = height;
//	}
//	
//	public String getType() {
//		return type;
//	}

//	//setter injection 
//	public void setType(String type) {
//		this.type = type;
//	}	









	//20
	public void draw() {
	
		//System.out.println(getType() + " triangle drawn with the height og " + getHeight());
		 
		
	}
	
	
}



/*	1. we first made a draw object and printed out "triangle drawn"
 * 
 * 16. Next we are gonna make a MEMBER VARIABLE outside the draw() object with the	
 * 		- private String type;
 * 		- next get the getters and setters for the type 
 *
 * 17. Next what you can do with the spring container is that 
 * 		- Instantiate an object with the triangle obj 
 * 		- we can preset the vale of the type var 
 * 		- we can do that with the spring xml file
 * 
 * 18. XML file - Extending the xml blue print - MEMBER VARIABLE 
 * 		- pre-filling the value for the new member variable called type.
 * 		- we will close the same bean stack that we made for the id"triangle" class="package" 
 * 		- we do this by closing off the stack with 
 * 			<beans>
 * 				<bean id="" class=""> 
 * 					
 * 					<property tag called name = "type" value"equilateral" />
 * 
 * 				</bean> //this connects to the bean id class 
 * 			</beans>
 *
 *
 *	19. Explanation logic for the 18. 
 *			- when we ask spring to get me the triangle obj we casted (Triangle) context.getBean("triangle"); 
 *			- what spring is gonna do is look at the xml file 
 *			- it will look at the bean and say this guy wants a triangle of the class and instantiate an obj of this class 
 *			- then it sees the property tag 
 *			- then it will fill the value 
 *			- which the value is set to "Equilateral"
 *			- next assign it to the type 
 *			- then it will return an obj for me that has value set for the type 
 *
 *
 *	20. Next - changing the sysout to connect the getType() method value "Equilateral" + with the " triangle drawn" 
 *			
 *		- it should print out "Equilaterl triangle drawn" 
 * 		- this shows that i can put the preset value inside the xml file 
 * 		- even though i ran the .get bean method, it also runs the preset value nicely and together 
 * 		- by just adding the .getType() method 
 * 
 * 	 
 * 	21. Constructor injection summary 
 * 			- const = which takes in the param in the class for its member variables 
 * 			- you can use the const to set the values instead using a setter 
 * 			- we need to change the property tag inorder to use the const injection 
 * 
 * 	22. setting up the const injec 
 * 			- make a public called Triangle and set the param as String type 
 * 			- next inside the {} we will input this.type = type;
 * 			- type is now set to this member variable 
 * 		
 * 			- we configURed the setter by using the property tag 
 * 			- now we need to tell spring to initialize the obj using the Triangle const 
 * 			- we want spring to pass the value "eqilateral" to the Triangle cosnt 
 * 				- We do this by CHANGING THE PROPETY TAG 
 * 				- TO <constructer-arg /> which stands for const argument 
 * 				- const arg doesn't have a name, only value 
 * 
 * 23. run result = "Equilateral Triangle drawn" 
 * 		- even though we commented the setter 
 * 		- and also the type is a private 
 * 		- it still runs the result we wanted by USING THE CONST ARG
 * 		- WE HAVE ASKED SPRING TO INTIALIZE THE TRIANGLE OBJ 
 * 		- AND PASS IN THE VALUE USING THE TRIANGEL CONST INSIDE THE TRIANGLE.JAVA FILE 		
 * 
 * 24. HAVING MULIPLE CONST ARGS INSIDE THE XML FILE 
 * 		- lets create another member variable 
 * 			private int height;
 * 		- generate the getters only with the source 
 * 		- for setters we will use the const 
 * 
 * 
 * 25. MAKING 2 CONSTS W/ 2 PARMS 
 * 		- we copied the same Triangle const from line //22
 * 		- then we added the int height param 
 * 		- then we also added the this.height = height;
 * 		-SPRING WILL THEN GO TO THE XML FILE AND LOOK HOW MANY CONST TAGS THERE ARE 
 * 		- AND IT WILL AUTO FIND THE CONST WE MADE AND CHOOSE THE ONE WITH BOTH PARMS 
 * 		- DONT FORGET TO ADD THE getType() + getHeight() inside the sysout 
 * 		- also inside the xml file add the second const tag and set the height value to "20"
 * 		- spring knows that we set the value int 20 with "20" as a "stirng"
 * 
 * 
 * 26. we added integer height with the this method 
 * 		- but WE NEED TO DELETE THE FIRST CONST INSIDE THE XML FILE
 * 			constructor-arg value="equilateral"/>
 * 		- NOW FOR THE SECOND CONST INSIDE THE XML FILE 
 * 			- WE CHANGED THE TYPE SET TO "INT" 
 * 			- NOW SPRING CAN KNOW THE VALUE WE ARE PASSING IN AN INT TYPE
 * 		
 * 
 * 27. USING INDEX NUMBS FOR COSNT-ARG TO SPECIFY THE ORDER OF THE CONST INJECTION 
 * 		- INSIDE THE CONST-ARG TAG REMOVE THE TYPE="INT" 
 * 		- ADD THE INDEX="0" OR "1"
 * 		- THIS WAY WE CAN LET SPRING KNOW WHICH TO CALL FIRST 
 * 
 * 
 * 28. INJECTION OBJECTS 
 * 		- COMMENT AND RE-SET THE TRIANGLE.JAVA FILE 
 * 		- CREATE A NEW CLASS CALLED Point
 * 
 * 		29. Go to the triangle.java 
 * 			- we are gonna make 3 objs called 
 * 				- private Point pointA;
 * 				- private Point pointB;
 * 				- private Point pointC;
 * 	
 * -- go to the point.java class now --
 * 
 *
 * */
 