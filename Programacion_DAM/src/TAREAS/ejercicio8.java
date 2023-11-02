package TAREAS;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dia;
		int mes;
		int año;

		System.out.println("introduce un numero de dia");
		dia = sc.nextInt();
		System.out.println("introduce un numero de mes");
		mes = sc.nextInt();
		System.out.println("introduce un numero de año");
		año = sc.nextInt();

		if (dia == 25 && mes == 12) {

			System.out.println("Es navidad");
		} else {

			System.out.println("No es navidad");
		}

	}

}
