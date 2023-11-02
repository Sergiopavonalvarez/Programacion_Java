package ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class ARRAYS_04 {

	public static void main(String a[]) throws Exception {

		// Declaro un vector inicial
		int[] miVector = { 11, 80, 66, 8, 9,9 };

		// Ordenación del vector
		Arrays.sort(miVector);

		// Busco un elemento en concreto en un vector ordenado
		System.out.println(Arrays.binarySearch(miVector, 66));
		
		//Darle la vuelta al Array
		System.out.println(Collections.reverseOrder());

		// Imprimir un vector
		System.out.println(Arrays.toString(miVector));
	}

}
