package TAREA_ARRAYLIST_01;

/*
 * Autor= Sergio Pavon Alvarez
 * Revisores= Enrique y Oscar
 */

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ej3 {
	public static void main(String a[]) throws Exception {
		double MaxTemp = Double.MIN_VALUE, MinTemp = Double.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
// Create a LinkedHashSet of String
		LinkedHashSet<Double> sortSet = new LinkedHashSet<Double>();
		while (sc.hasNext()) {
			sortSet.add(sc.nextDouble());
		}

		for (double number : sortSet) {

			if (number < MinTemp) {

				MinTemp = number;
			}
			if (number > MaxTemp) {

				MaxTemp = number;
			}

		}
		System.out.println(MaxTemp);
		System.out.println(MinTemp);
// Note: Try to test your code without run it
	}
}
