package TAREAS;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1;
		int valor2;
		int valor3;

		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		valor3 = sc.nextInt();

		if (valor1 > valor2 && valor1 > valor3) {

			System.out.println("el numero mayor es " + valor1);
		}
		if (valor2 > valor1 && valor2 > valor3) {

			System.out.println("el numero mayor es " + valor2);
		}
		if (valor3 > valor1 && valor3 > valor2) {

			System.out.println("el numero mayor es " + valor3);
		}

	}

}
