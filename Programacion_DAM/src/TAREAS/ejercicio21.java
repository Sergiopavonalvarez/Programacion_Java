package TAREAS;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valores;
		int contador_pares = 0;
		int contador_impares = 0;

		int contador = 0;

		while (contador < 5) {

			System.out.println("introduce un valor");
			contador++;

			valores = sc.nextInt();

			if (valores % 2 == 0) {

				contador_pares++;
			} else {

				contador_impares++;
			}

		}

		System.out.println(contador_impares + " son impares y " + contador_pares + " son pares");

	}

}
