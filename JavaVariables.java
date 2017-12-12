package com.javabasics.variables;

public class JavaVariables {
	
	/* 
	 lets discuss one of the very important aspect of any programming languages. 
	 which we call generally variables. Variables are nothing but a container 
	 which is used for storing values of any types within the memory of CPU 
	 lets define what are the diffrent types of variables we have in Java.
	 
	/* 
	
	In Java Variables are broadly classified as PRIMITIVE TYPE and OBJECT REFERENCE TYPES. Again 
	PRIMITIVE type is further classified as 'boolean' and 'Numeric'. Again Numeric data type is further 
	classifies as integer , floating and character . 
	Integer further classified as byte ,short, int , long
	Floating further classified as float and decimal
	Character further classified as char 
	
	*/
	
	static int age = 34; // here we use define static since we are declaring and initializing instance variable within class
	int salary;  
	//salary = 45000;  // Illegal since salary is instance variable and we cannot 
	                  //reinitialize instance variable within class
	char x = 'A';
	char y = 65 ; // will print the UNICODE value of 65 i.e. A since data type is CHAR
	double discount = 10.25 ; // here we can use trailing d/D as we use in float but its just an optional:)
	float comission = 23.56f; // f or F is used to denote float no.
	
	// Now lets print all these variables on console and to do so we need to write main method since Java execution start with main() method
	
	
	public static void main(String args[]) {
		
		// to print anything on console in Java we have 2 methods println() and print();
		salary = 45000; // we cant even intialize instance variable here too.
		System.out.println("The instance variable declare within class " + age );
		System.out.println("The instance variable declare within class " + salary );
		System.out.println("The instance variable declare within class " + x + "and"+ y );
		System.out.println("The instance variable declare within class " + discount );
		System.out.println("The instance variable declare within class " + comission );
		
		/*
	    So here all the print statements are throwing some error and the reason we are trying to access nonstatic 
		variable using static method which is not at all possible . Then what to do in this case,Is it something 
		we cant even use these instance variable in static method.So the answer to this simply NO,we can use 
		these variables simply by creating the OBJECTs of JavaVariables class or 
		Simply by making all instance variable as 'static'
		
		*/
		
		//Lets see how we can resolve error using objects;
		
		JavaVariables jv = new JavaVariables(); // here we are creating object of the class
		jv.salary = 45000; // we cant even intialize instance variable here too.
		System.out.println("The instance variable declare within class " + age );
		System.out.println("The instance variable declare within class " + jv.salary ); // calling salary variable through object jv
		System.out.println("The instance variable declare within class " + jv.x+"and"+ jv.y );
		System.out.println("The instance variable declare within class " + jv.discount );
		System.out.println("The instance variable declare within class " + jv.comission );
		
	}
	
}

