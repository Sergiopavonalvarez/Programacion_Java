package TAREAS;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor1;
		int valor2;
		int valor3;

		System.out.println("introduce el primer valor");
		valor1 = sc.nextInt();
		System.out.println("introduce el segundo valor");
		valor2 = sc.nextInt();
		System.out.println("introduce un tercer valor");
		valor3 = sc.nextInt();

		if (valor1 == valor2 && valor1 == valor3) {

			System.out.println((valor1 + valor2) * valor3);

		}

	}

}
