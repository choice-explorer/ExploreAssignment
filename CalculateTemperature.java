
/**
 * @author rajeshwar
 * @created_date Sep 20, 2017
 */

package com.javabasics.assignment;

/*Create a class CalculateTemperature {} and within that create two methods with name celciusToFarenheit () 
 * and farenheitToCelcius (). In celciusToFarenheit () method try to convert temperature from 
 * degree celcius to Farenheit and farenheitToCelcius () method try to convert temperature
 *  from degree Farenheit to degree celcius. 
 *  Finally call both the methods in main () method in another class CalculateTemperatureWithParameterTest {} 
 *  and execute
 *  To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 (or 9/5) and add 32
To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and multiply by .5556   

 */

public class CalculateTemperature {

	double celcius;
	double farenheit;

	public void celciusToFarenheit() {

		// this method will convert temperature from degree celcius to Farenheit
		// To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 (or 9/5) and add 32
		
        Scanner sc = new Scanner(System.in);
        celcius = sc.nextDouble;
		//celcius = 467.68;
		farenheit = (celcius * 1.8) + 32;

		System.out.println("The Farenheit conversion for celcius is : " + farenheit);

	}

	public void farenheitToCelcius() {
		// this method will convert temperature from Farenheit to degree celcius
		// To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and multiply by .5556
		
        Scanner sc = new Scanner(System.in);
        farenheit = sc.nextDouble;
		//farenheit = 546.78;
		celcius = (farenheit - 32) * 0.5556;

		System.out.println("The celcius temperature for farenheit is : " + celcius);

	}

	public static void main(String[] args) {

		CalculateTemperature ct = new CalculateTemperature();
		// calling celciusToFarenheit()
		ct.celciusToFarenheit();
		// calling celciusToFarenheit()
		ct.farenheitToCelcius();

	}

}
