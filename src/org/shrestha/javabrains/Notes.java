package org.shrestha.javabrains;

public class Notes {

}


/*//INNER BEANS 
 * - if we are using the point obj for the triangle class only then 	
 * - we dont have to specify the bean definitions seperately and give it a name 
 * - but we can define something called inner bean 
 * - we remove the sub-bean and just combine the beans into main bean 
 * - this only works if we only use the obj bean for the main triangle bean only 
 * - if we use a different shape then we go back into speprate beans
 * - ID IS ONLY REQUIRED WHEN YOU ARE REFERENCING IT FOR SOMEWHERE ELSE 
 * - REF AND ID GO HAND IN HAND  
 * 
 * ALIASES = having an alternative name for the same bean 
 * - giving different names to the same bean 
 * - we can use reference for aliases anywhere in our spring application 
 * - the bean can have 
 * 		- id 
 * 		- name 
 * 		- an aliases tag: name and aliases="bean name -aliases" 
 * 			ex <aliases name="triangle" aliases="triangle-aliases" />
 * 
 * - its best to use ID for references 
 * 
 * REFID = AN BEAN WITH A ID 
 * - a fool proof reference 
 * - extra validation 
 * 
 * 
 */