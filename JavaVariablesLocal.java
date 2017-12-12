package com.javabasics.variables;

public class JavaVariablesLocal {

	// Lets discuss about local variables ; Local variables are always define within
	// method ;
	// Firstly we will see by declaring and initializing the variables

	 public static void localvariables() {

		String name = "Hare Krishna";
		int chantRound = 108;
		boolean chantCompleted = true;

		System.out.println("Prabhuji, " + name);
		System.out.println("How many round you chant? " + chantRound);
		System.out.println("Have you completed your chanting? " + chantCompleted);

	} 

	public static void main(String args[]) {

		String name;
		int chantRound;
		boolean chantCompleted;

		System.out.println("Prabhuji, " + name);
		System.out.println("How many round you chant? " + chantRound);
		System.out.println("Have you completed your chanting? " + chantCompleted);

		// Here we can see its not possible to use local variable w/o initializing since it don't get default value

	}

}
