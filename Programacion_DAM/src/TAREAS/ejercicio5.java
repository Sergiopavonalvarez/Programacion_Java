package TAREAS;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		numero = sc.nextInt();

		if (numero > 0) {

			System.out.println("Numero positivo");
		}
		if (numero < 0) {

			System.out.println("Numero negativo");
		}
		if (numero == 0) {

			System.out.println("Numero Nulo");
		}

	}

}
