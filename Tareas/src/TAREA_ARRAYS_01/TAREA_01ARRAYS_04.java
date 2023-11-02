package TAREA_ARRAYS_01;

import java.util.Arrays;
import java.util.Scanner;

public class TAREA_01ARRAYS_04 {

	public static boolean casoDePrueba(Scanner in) {

		boolean continuar = true;

		int cantidad = in.nextInt();

		if (cantidad == 0)

			continuar = false;

		else {

			int[] puzzle = new int[cantidad - 1];

			for (int i = 0; i < puzzle.length; i++) {

				puzzle[i] = in.nextInt();

			}

			Arrays.sort(puzzle);

			int pieza = 0;
			int cont = 0;

			for (int a = 0; a < puzzle.length; a++) {

				cont++;

				if (cont != puzzle[a]) {

					pieza = cont;
					cont++;

				}
				if (puzzle[puzzle.length - 1] != cantidad) {

					pieza = cantidad;
				}

			}

			System.out.println(pieza);
		}
		return continuar;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		while (casoDePrueba(in));
	}

}
