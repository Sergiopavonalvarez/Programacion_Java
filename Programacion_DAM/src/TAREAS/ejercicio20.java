package TAREAS;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int valores1 = 0;
		int valores2 = 0;

		while (contador < 15) {

			contador++;
			valores1 = sc.nextInt();
			valores2 = sc.nextInt();
			valores1 = valores1 + valores1;
			valores2 = valores2 + valores2;

		}
		if (valores1 > valores2) {
			System.out.println("La primera lista de valores es mayor");

		}
		if (valores2 > valores1) {

			System.out.println("La segunda lista de valores es mayor");
		}
		if (valores1 == valores2) {

			System.out.println("la listas de valores son iguales");
		}

	}

}
