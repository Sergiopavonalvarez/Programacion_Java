package ARRAYS;

import java.util.Arrays;

public class ARRAYS_10 {

	public static void main(String[] args) {
		int arrays[] = { 90,4, 68, 2, 1, 10, 34, 8, 21 };

		System.out.println("El arreglo es: " + Arrays.toString(arrays));
		int aux=0;

		for (int i = 0; i < arrays.length - 1; i++) {

			for (int f = 0; f < (arrays.length - 1)-i; f++) {
				
				if (arrays[f] > arrays[f + 1]) {
					aux = arrays[f];
					arrays[f] = arrays[f + 1];
					arrays[f + 1] = aux;

				}

			}
		}
		
		System.out.println("El arreglo ordenado es: " + Arrays.toString(arrays));
	}
}