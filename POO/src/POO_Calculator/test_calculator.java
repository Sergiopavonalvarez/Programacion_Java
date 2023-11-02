package POO_Calculator;

import java.util.Scanner;

public class test_calculator {

	public static void main(String[] args) {
		Calculator test = new Calculator();

		System.out.println("elige una opcion: ");
		System.out.println("1- Suma");
		System.out.println("2- Resta");
		System.out.println("3- Multiplicacion");
		System.out.println("4- Division");

		int opcion;

		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();

		if (opcion == 1) {
			System.out.println("la suma es: " + test.getsuma());
		} else if (opcion == 2) {

			System.out.println("La resta es: " + test.getresta());
		} else if (opcion == 3) {

			System.out.println("La multiplicacion es: " + test.getmultiplicacion());
		} else if (opcion == 4) {
			System.out.println("la division es: " + test.getdivision());
		}

	}

}
