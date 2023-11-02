package HOLAMUNDO;
/**
 * #Sergio Pavon Alvarez
 */

import java.util.Scanner;

public class convertir {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter a temperature in Celsius: ");
		Scanner scanCelsius = new Scanner(System.in);
		double Celsius= scanCelsius.nextInt();
		double Fahrenheit = 1.8 * Celsius + 32;
		
		System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
		}
}
