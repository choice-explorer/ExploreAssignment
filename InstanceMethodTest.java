
package com.javabasics.methods;

/**
 * @author gaurnitai
 * @date 10/12/2017
 */
public class InstanceMethodTest {
	
	double scoredMarks;
	double totalMarks;
	String name;
	
	public void calculatePercent() {  // This is INSTANCE method ie. non-static since we dont have static keyword
		
		scoredMarks = 400; // Initializing instance variable in INSTANCE method -- NO error
		totalMarks = 800; // Initializing instance variable in INSTANCE method -- NO error
		
		//NOTE : what if we try initializing INSTANCE variable in STATIC method ... lets see at main() method
		 
		double percent = (scoredMarks)*100/totalMarks ;
		
		System.out.println(percent); // Here we can write print statement to get 'percent' variable printed at console.
		
		// Here we can see --- while accessing INSTANCE variables 'scoredMarks & totalMarks' we are not getting error
		// and the reason is we are accessing INSTANCE variable in INSTANCE method 
		
		
	}

	// Lets try initializing INSTANCE variable & calling INSTANCE calculatePercent() method in main() method
	
	public static void main(String[] args) { //This is STATIC method since we have STATIC keyword
		
		scoredMarks = 400; // We can see error here INSTANCE variable cannot be accessed in STATIC method directly
		
		totalMarks = 800; // We can see error here INSTANCE variable cannot be accessed in STATIC method directly
		
	// On calling calculatePercent() method in main() method we are getting error
		
		calculatePercent();  // and the reason is we are trying to call INSTANCE(non-static) method in STATIC method directly
		
		// So to access INSTANCE variable & calculatePercent() method in main() without error 
		// we need to create an OBJECT of CLASS as follows
		
		InstanceMethodTest obj = new InstanceMethodTest();
		
		obj.name = "Krishna";
		obj.scoredMarks = 400;
		obj.totalMarks = 800;
		
		obj.calculatePercent();  // So here we dont see any error 
		
		// What if I would like to print the percent value in console
		
		// Is it possible to write percent variable here 
		
		System.out.println(percent);  // NO! -- Here we can see error and the reason is we have defined 'percent' variable 
		// within calculatePercent() method and hence it acts as a local variable and always remember LOCAL variable scope is 
		//restricted to method in which it is defined.
		// But the same print statement --System.out.println(percent); we can write in calculatePercent() method as shown above
		
	}

}
