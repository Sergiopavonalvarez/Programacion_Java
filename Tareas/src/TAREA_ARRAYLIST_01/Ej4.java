package TAREA_ARRAYLIST_01;

import java.util.*;

/*
 * @Autores: Quique Huerta, Oscar Sanchez-Tornero
 * Revisor: Sergio Pavon
 */
public class Ej4 {

	public static void main(String a[]) throws Exception {
		int[] arr = new int[8];
		int countOccurrence = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter Number [" + i + "]:");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter a number which exist in the array:");
		int number = scan.nextInt();
		// Create a HashMap where Key is the number and
		// Value is the number of occurrence of this number
		HashMap<Integer, Integer> miTabla = new HashMap<Integer, Integer>();
		/// {write your code here
		for (int i = 0; i < arr.length; i++) {
			if (miTabla.containsKey(arr[i])) {
				miTabla.put(arr[i], miTabla.get(arr[i]) + 1);
			} else {
				miTabla.put(arr[i], 1);
			}

		}
		if (miTabla.containsKey(number)) {
			countOccurrence = miTabla.get(number);
		}

		/// }
		System.out.println("Occurrence of " + number + " :");
		System.out.println(countOccurrence);
	}
}
