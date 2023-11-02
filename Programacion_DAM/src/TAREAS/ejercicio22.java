package TAREAS;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valores = 0;
		int sumatorio;

		do {
			System.out.println("introduce un valor");
			sumatorio = valores + valores;
			valores = sc.nextInt();

		} while (valores != 9999);

		System.out.println("el total de valores es " + sumatorio);

	}

}
