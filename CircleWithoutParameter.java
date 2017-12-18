/**
 * @author gaurnitai
 * @created_date Sep 20, 2017
 */

package com.javabasics.assignment;

/*	(Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle 
 * that has a radius of 5.5 using the following formula: 
 * perimeter = 2 * radius * pi   ---- where pi=3.14
 * area = radius * radius * pi ------where pi=3.14

 */
public class CircleWithoutParameter {

	double radius = 5.5;
	final static float pi = 3.14f; // its universal constant hence defined as final keyword

	public void calculateArea() {

		double area = radius * radius * pi;
		System.out.printf("The area of circle having radius %.2f is %.2f\n", radius, area);

		// other way to print the same

		System.out.println("The area of circle having radius " + radius + " is " + area);

	}

	public void calculatePerimeter() {

		double perimeter = 2 * radius * pi;
		System.out.printf("The perimeter of circle having radius %.2f is %.2f\n", radius, perimeter);

		// other way to print the same

		System.out.println("The perimeter of circle having radius " + radius + " is " + perimeter);

	}

	public static void main(String[] args) {

		CircleWithoutParameter c = new CircleWithoutParameter();
		System.out.println("Area of circle using method with parameter");

		System.out.println("\n");
		System.out.println("Area of circle using method without parameter");
		c.calculateArea();
		System.out.println("\n");
		System.out.println("Perimeter of circle using method with parameter");

		System.out.println("\n");
		System.out.println("Perimeter of circle using method without parameter");
		c.calculatePerimeter();

	}

}
