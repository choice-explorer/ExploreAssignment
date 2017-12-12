package com.javabasics.typecasting;

public class JavaTypeCasting {
	
	/*
	lets discuss another important aspect of JAVA variables ie. Type Casting
	Basically there are 2 main types of casting ie. IMPLICIT and EXPLICIT Type Casting
	IMPLICIT type casting is also know as widening (smaller to larger datatype) conversion and EXPLICIT type casting
	is also known as narrowing(larger to smaller) conversion
	
	*/
	
	/* If we logically see those terms WIDENING i.e from smaller to larger datatype we can think of - if we have one 
	 small container and one larger container and we want to store things of small container to large one
	 then we dont need any extra effort to do so since larger container is big enough 
	 But 
	 if we have to do vice versa then definitely we have to think of something because its not possible to 
	 accomodate larger container stuffs to smaller one.Thats why to do so we have to use NARROWING conversion.
	 Same applies to the variables to. 
	 if we have to store Larger data types values to smaller data type we have to explicitly do conversion of larger
	 datatype to smaller one and know as down casting or narrowing conversion
	
	 But for Implicit type casting we dont have to do anything since its taken care by JVM
	
	 */
	 public static void main(String args[]) {
		 
		 // lets define some variables and try to insert other data type value
		 int x = 23;
		 double y ;
		 y = x ; // here we are storing int to double ie. smaller to larger . So no error
		 System.out.println(y);
		 System.out.println(x);
		  
		 double a = 25.28;
		 int b ;
		 //b = a; // Here we can see error since we are trying to store double to int i.e larger to smaller w/o casting
		 
		 // lets do casting and store 
		 b = (int) a;
		 System.out.println(b);
		 
		 boolean bool = true ;
		 int num = bool; // not possible as we know boolean data type cannot be typecast;
		 
		 //int to long
		 int value = 34;
		 long value1 ;
		 
		 value1 = value;
		 System.out.println(value1);
		 value = value1; // trying longer to smaller w/o casting which is not possible;
		 System.out.println(value);
		 
		 value = (int) value1;
		 
		 // long to float 
		 
		 long value2 = 678;
		 float value3; 
		 value3 = value2; // works fine since smaller to larger
		 System.out.println(value3);
		 value2 = value3 ; // trying longer to smaller w/o casting which is not possible;
		 
		 // so to assign value3 to value2 we need Explicitly type cast
		 value2 = (long) value3;
		 
		 // float to long and vice versa 
		 
		 float value4 = 567.78f;
		 double value5 ;
		 value5 = value4 ; // works fine since assigning smaller type to larger type
		 System.out.println(value5);
		 value4 = value5 ;  // trying longer to smaller w/o casting which is not possible;
		 
		 // Also we can explicit cast for storing larger (double) to long/int/short
		 double value6 = 3564.8;
		 int value7 ;
		 
		 value7 = (int) value6;
		 System.out.println(value7);
		 
		 
		 
		 
		 
	 }
	

}
