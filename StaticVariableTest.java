package com.javabasics.variables;

/**
 * @author rajeshwar_sharma 
 */
public class StaticVariableTest {
	
	// declare static variables
	static int a; 
	static int b;
	static String name; 
	static boolean bool;
	static char c;

	public static void main(String[] args) {
		
		// Try accessing instance variable in STATIC method
		
		System.out.println(b); // No error since we can access directly static variable in static method
		System.out.println(c); // No error since we can access directly static variable in static method
		System.out.println(name); // No error since we can access directly static variable in static method
		System.out.println(bool); //No error since we can access directly static variable in static method

		// Here we will get all the default values for instance variable since we have not initialize so far
		
		// lets Try initializing instance variable in static method
		
		a = 12;     // No error since we can initialize instance variable in STATIC method
		b = 14;     // No error since we can initialize instance variable in STATIC method
		name = "Balarama";  // No error since we can initialize instance variable in STATIC method
		bool = false;  // No error since we can initialize instance variable in STATIC method
		c = 'A';  // No error since we can initialize instance variable in STATIC method
		
		System.out.println(b); // No error since we can access directly static variable in static method
		System.out.println(c); // No error since we can access directly static variable in static method
		System.out.println(name); // No error since we can access directly static variable in static method
		System.out.println(bool); //No error since we can access directly static variable in static method

		// Here we will get all the initialized values for instance variable since we have already  initialized
		
		// Also we can access static variable in static method 
		
		//1.By prefixing the CLASS name with dot operator 
		
		StaticVariableTest.a = 12;     // No error since we can initialize instance variable in STATIC method
		StaticVariableTest.b = 14;     // No error since we can initialize instance variable in STATIC method
		StaticVariableTest.name = "Balarama";  // No error since we can initialize instance variable in STATIC method
		StaticVariableTest.bool = false;  // No error since we can initialize instance variable in STATIC method
		StaticVariableTest.c = 'A';  // No error since we can initialize instance variable in STATIC method
		
		System.out.println(StaticVariableTest.b); // No error since we can access directly static variable in static method
		System.out.println(StaticVariableTest.c); // No error since we can access directly static variable in static method
		System.out.println(StaticVariableTest.name); // No error since we can access directly static variable in static method
		System.out.println(StaticVariableTest.bool); //No error since we can access directly static variable in static method
		
		// 2.By creating Object of the class
		
		StaticVariableTest obj = new StaticVariableTest();
		
		obj.a = 12;    // here we can see --- we dont have any error 
		obj.b = 14;
		obj.name = "Balarama"; 
		obj.bool = false; 
		obj.c = 'A';
		
		System.out.println(obj.a );  // Here we can see some warning since its always recommended not to use object reference for 
		System.out.println(obj.b );   // -accessing static variable in static method rather we can access directly or use 1st approach
		System.out.println(obj.name ); // -ie. ClassName.staticVariableName
		System.out.println(obj.bool );
		System.out.println(obj.c );
		
	}

}
