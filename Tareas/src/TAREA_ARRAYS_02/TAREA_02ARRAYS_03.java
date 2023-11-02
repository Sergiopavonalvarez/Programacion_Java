package TAREA_ARRAYS_02;

/**
 * 
 * @author Sergio Pavon
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class TAREA_02ARRAYS_03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] arrays = new int[5];

		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = in.nextInt();
		}

		System.out.println("El arreglo es: " + Arrays.toString(arrays));
		int aux = 0;

		for (int i = 0; i < arrays.length - 1; i++) {

			for (int f = 0; f < (arrays.length - 1) - i; f++) {

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
