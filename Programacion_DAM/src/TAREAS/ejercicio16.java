package TAREAS;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 0;
		int contador2 = 0;
		int alturas = 0;
		System.out.println("introduce 3 alturas");

		while (contador < 3) {

			contador++;
			contador2 = sc.nextInt();
			alturas = alturas + contador2;
		}

		alturas = (alturas / 3);

		System.out.println("el promedio de alturas es: " + alturas);

	}

}
