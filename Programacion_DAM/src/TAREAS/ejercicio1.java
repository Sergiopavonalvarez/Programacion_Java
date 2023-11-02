package TAREAS;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int ref;
		Scanner sc = new Scanner(System.in);

		numero1 = sc.nextInt();
		numero2 = sc.nextInt();

		if (numero1 >= numero2) {

			System.out.println("suma: " + numero1 + numero2);
			System.out.println("Diferencia: " + (numero1 - numero2));

		} else {

			System.out.println("Division: " + numero2 / numero1);
			System.out.println("multiplicacion: " + (numero1 * numero2));

		}

	}

}
