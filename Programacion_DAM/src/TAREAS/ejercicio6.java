package TAREAS;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		numero = sc.nextInt();

		if (numero >= 100 && numero <= 999) {

			System.out.println("El numero tiene tres cifras");
		}
		if (numero >= 10 && numero <= 99) {

			System.out.println("El numero tiene dos cifras");
		}
		if (numero >= 0 || numero <= 9) {

			System.out.println("El numero tiene una cifra");
		}
		if (numero >= 1000 || numero < 0) {

			System.out.println("Numero Invalido");
		}

	}

}
