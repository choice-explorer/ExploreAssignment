package com.javabasics.variables;

/**
 * @author gaurnitai
 */
public class InstanceVariableTest {
	
	// declare instance variables
	int a; 
	int b;
	String name; 
	boolean bool;
	char c;

	public static void main(String[] args) {
		
		// Try accessing instance variable in STATIC method
		
		System.out.println(b); // throw error since we cannot access instance variable in static method
		System.out.println(c); // throw error since we cannot access instance variable in static method
		System.out.println(name); // throw error since we cannot access instance variable in static method	 	
		System.out.println(bool); // throw error since we cannot access instance variable in static method

		// Try initializing instance variable in static method
		
		a = 12;     // These are throwing error since we cannot initialize instance variable in STATIC method
		b = 14;     // These are throwing error since we cannot initialize instance variable in STATIC method
		name = "Balarama";  // These are throwing error since we cannot initialize instance variable in STATIC method
		bool = false;  // These are throwing error since we cannot initialize instance variable in STATIC method
		c = 'A';  // These are throwing error since we cannot initialize instance variable in STATIC method
		
		// What if I still need to access INSTANCE variable in STATIC method 
		// To do so-----By creating Object of the class
		
		// By prefixing the CLASS name with dot operator
		
		InstanceVariableTest obj = new InstanceVariableTest();
		
		obj.a = 12;    // here we can see --- we dont have any error since we are accessing through object obj
		obj.b = 14;
		obj.name = "Balarama"; 
		obj.bool = false; 
		obj.c = 'A';
		
		System.out.println(obj.a );
		System.out.println(obj.b );
		System.out.println(obj.name );
		System.out.println(obj.bool );
		System.out.println(obj.c );
		
	}

}
