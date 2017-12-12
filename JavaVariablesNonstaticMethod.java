package com.javabasics.variables;

public class JavaVariablesNonstaticMethod {
	
	// Lets call Instance (non static) variables in non-static method and then call in main (static) method

	 int age = 34; // here we use define static since we are declaring and initializing instance variable within class
	  int salary;  
	//salary = 45000;  // Illegal since salary is instance variable and we cannot 
	                  //reinitialize instance variable within class
	 char x = 'A';
	 char y = 65 ; // will print the UNICODE value of 65 i.e. A since data type is CHAR
	 double discount = 10.25 ; // here we can use trailing d/D as we use in float but its just an optional:)
	 float comission = 23.56f; // f or F is used to denote float no.
	
	// Now lets print all these variables on console and to do so we need to write main method since Java execution start with main() method
	
	 
   public void useVariables() {
		 
		 System.out.println("The instance variable declare within class " + age );
	     System.out.println("The instance variable declare within class " + salary );
		 System.out.println("The instance variable declare within class " + x + "and"+ y );
		 System.out.println("The instance variable declare within class " + discount );
		 System.out.println("The instance variable declare within class " + comission );
		 
		 // So here if we see we dont have any error,it means we can call instance variable in non static method
	 }
	
	public static void main(String args[]) {
		
		// Now lets use / call useVariables() method in main() method
		
		// to print anything on console in Java we have 2 methods println() and print();
		
		//useVariables(); // throwing error since its non - static method and we cant call in static method
		// so to call non static method useVariables() in static main() we need to use the same logic 
		//as we use for variables ie. create Object and then use 
		
		salary = 4500;  // we cant even intialize instance variable here too without creating object
		
		System.out.println("The instance variable declare within class " + age );
	     System.out.println("The instance variable declare within class " + salary );
		 System.out.println("The instance variable declare within class " + x + "and"+ y );
		 System.out.println("The instance variable declare within class " + discount );
		 System.out.println("The instance variable declare within class " + comission );
		
		 JavaVariablesNonstaticMethod object = new JavaVariablesNonstaticMethod();
		
		object.salary = 45000; 
		 System.out.println("The instance variable declare within class " + object.discount );
		 System.out.println("The instance variable declare within class " + object.comission );
		
		object.useVariables();
		
		// Now if we run this,we will get the values for all the instance variable;
		
		
	}
	
}

