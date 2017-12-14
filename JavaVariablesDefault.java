package com.javabasics.variables;

public class JavaVariablesDefault {
	
	/* 
	 lets discuss what should be the default value for instance variable in case we dont initialize;
	*/
	 byte a;
	 short s;
	 int age ; // here we use define static since we are declaring and initializing instance variable within class
	 int salary;  
	//salary = 45000;  // Illegal since salary is instance variable and we cannot 
	                  //reinitialize instance variable within class
	 char x ;
	 char y ; // will print the UNICODE value of 65 i.e. A since data type is CHAR
	 double discount ; // here we can use trailing d/D as we use in float but its just an optional:)
	 float comission ; // f or F is used to denote float no.
	 boolean b;
	// Now lets print all these variables on console and to do so we need to write main method since Java execution start with main() method
	
	
	public static void main(String args[]) {
		
		// to print anything on console in Java we have 2 methods println() and print();
		
		// create OBJECT for the class 
		JavaVariablesDefault object = new JavaVariablesDefault();
		
		System.out.println("The default value of byte a is " + object.age );
		System.out.println("The default value of short s is " + object.salary );
		System.out.println("The default value of int age is " + object.age );
		System.out.println("The default value of int salary is " + object.salary );
		System.out.println("The default value of char x & y is " + object.x + " and "+ object.y );
		System.out.println("The default value of double discount is " + object.discount );
		System.out.println("The default value of float comission is " + object.comission );
		System.out.println("The default value of boolean b is " + object.comission );
			
	}
	
}

