package TAREAS;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numerointroducido;

		numerointroducido = sc.nextInt();

		if (numerointroducido >= 10) {

			System.out.println("El numero tiene dos digitos");
		} else {

			System.out.println("El numero tiene un digito");
		}

	}

}
