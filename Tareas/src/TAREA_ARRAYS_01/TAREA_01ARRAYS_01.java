package TAREA_ARRAYS_01;

import java.util.Iterator;
import java.util.Scanner;

public class TAREA_01ARRAYS_01 {
	int[] notas;
	Scanner sc;

	public void pedirNotas(int cantidad) {
		sc = new Scanner(System.in);
		notas = new int[2];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Introduzca la nota del alumno %d: ", i + 1);
			notas[i] = sc.nextInt();
		}
	}

	public void calcularDiferencia() {

		int diferencia = 0;

		if (notas[0] < notas[1]) {

			diferencia = notas[1] - notas[0];
		} else {
			diferencia = notas[0] - notas[1];
		}

		System.out.println("La diferencia es: " + diferencia);
	}

	public static void main(String[] args) {
		TAREA_01ARRAYS_01 ejemplo = new TAREA_01ARRAYS_01();

		int elementos = Integer.parseInt(args[0]);
		ejemplo.pedirNotas(elementos);
		ejemplo.calcularDiferencia();
	}
}
