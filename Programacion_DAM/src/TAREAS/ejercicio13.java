package TAREAS;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sueldo;
		int años;
		System.out.println("introduce el sueldo");
		sueldo = sc.nextInt();
		System.out.println("introduce los años en la empresa");
		años = sc.nextInt();

		if (sueldo < 500 && años >= 10) {

			System.out.println("Subida del 20%: " + (500 * 0.20)+sueldo);
		}
		if (sueldo < 500 && años < 10) {

			System.out.println("Subida del 5%: " + (500 * 0.5)+sueldo);
		}
		if (sueldo >= 500) {

			System.out.println("no hay subida, el sueldo es: " + sueldo);
		}

	}

}
