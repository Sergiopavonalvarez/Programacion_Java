package TAREA_ARRAYS_04;

/*
 * @ Sergio Pavon Alvarez
 * 
 * https://www.aceptaelreto.com/problem/statement.php?id=173&cat=15
 */

import java.util.Scanner;

public class SQUAS_02 {

	public static boolean puntuacion(Scanner in) {

		boolean continuar = true;

		// String fin = "F";
		int puntuacionA = 0;
		int puntuacionB = 0;
		char saque;
		boolean empate=true;

		while (true) {
			char[] puntuacion = in.next().toCharArray();

			if (puntuacion[0] == 'F') {
				System.out.println(puntuacionA + "-" + puntuacionB);
				continuar = false;
			} else {
				saque = 'A';
				for (int i = 0; i < puntuacion.length; i++) {

					if (puntuacion[i] == 'A') {

						if (saque == 'A') {
							puntuacionA++;
						} else {
							saque = 'A';
						}

					}
					if (puntuacion[i] == 'B') {

						if (saque == 'B') {
							puntuacionB++;
						} else
							saque = 'B';

					}


					if ((puntuacionA > 8 || puntuacionB > 8) && (Math.abs(puntuacionA - puntuacionB) > 1)) {
						
						System.out.print(puntuacionA + "-" + puntuacionB);
						System.out.print(" ");
						empate=false;
						puntuacionA = 0; 
					    puntuacionB = 0;

					}
				}

			}

			return continuar;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (puntuacion(in))
			;

	}

}
