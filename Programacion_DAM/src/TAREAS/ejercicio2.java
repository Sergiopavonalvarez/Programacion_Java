package TAREAS;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nota1;
		int nota2;
		int nota3;
		int notamedia = 0;

		nota1 = sc.nextInt();
		nota2 = sc.nextInt();
		nota3 = sc.nextInt();

		notamedia = (nota1 + nota2 + nota3) / 3;

		if (notamedia >= 7) {

			System.out.println("Promociona");

		} else {

			System.out.println("No promociona");

		}

	}

}
