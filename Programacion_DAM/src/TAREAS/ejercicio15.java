package TAREAS;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int notas;
		int mejoresnotas = 0;
		int peoresnotas = 0;
		int contador = 0;
		System.out.println("introduce 10 notas");
		notas = sc.nextInt();

		while (contador < 10) {

			contador++;

			notas = sc.nextInt();

			if (notas >= 7) {

				mejoresnotas++;
			} else {

				peoresnotas++;
			}
		}

		System.out.println(mejoresnotas + " Almunos superan el siete");
		System.out.println(peoresnotas + " Almunos no superan el siete");

	}

}
