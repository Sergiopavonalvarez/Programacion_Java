package TAREA_ARRAYS_01;

import java.util.Arrays;

public class TAREA_01ARRAYS_02 {

	public static void main(String[] args) {
		int[] numeros = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };
		int primeros = 0;

		// int ultimos=0;
		// Utiliza este for para realizar el intercambio tal y como muestra el gráfico

		for (int count = 0; count < 5; count++) {

			for (int i = 0; i < numeros.length - 1; i++) {

				//System.out.print(numeros[i]);

				primeros = numeros[1 + i];
				numeros[1 + i] = numeros[0];
				numeros[0] = primeros;
			}
		}

		System.out.println(Arrays.toString(numeros));
	}
}
