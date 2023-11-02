package TAREAS;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nota;

		nota = sc.nextInt();

		if (nota >= 90) {

			System.out.println("nivel maximo");
		}
		if (nota >= 75 && nota <= 89) {

			System.out.println("nivel medio");
		}
		if (nota > 50 && nota <= 74) {

			System.out.println("nivel regular");
		}
		if (nota < 50) {

			System.out.println("fuera de nivel");
		}

	}

}
