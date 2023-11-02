package TAREAS;

import java.util.Scanner;

public class ejercicio11 {

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

		if ((valor1 < 10) || (valor2 < 10) || (valor3 < 10)) {

			System.out.println("todos o al menos uno de los numeros son menores de diez");
		}

	}

}
