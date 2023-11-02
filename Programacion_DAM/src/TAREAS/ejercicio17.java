package TAREAS;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int empleado;

		int contador = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		System.out.println("Introduce tres sueldos entre 100 y 500");

		while (contador < 3) {

			empleado = sc.nextInt();

			contador++;

			contador4 = contador4 + empleado;

			if (empleado >= 100 && empleado < 300) {

				contador2++;
			}
			if (empleado > 300) {

				contador3++;

			}

		}
		System.out.println("entre 100 y 300: " + contador2);
		System.out.println("mas 300: " + contador3);
		System.out.println("El sueldo total es: " + contador4);
	}

}
