package POO_Calculator;

import java.util.Scanner;

class Calculator {

	Scanner sc = new Scanner(System.in);

	int numero1 = sc.nextInt();

	int numero2 = sc.nextInt();

	public int getsuma() {

		int suma = numero1 + numero2;
		return suma;

	}

	public int getmultiplicacion() {

		int mult = numero1 * numero2;

		return mult;
	}

	public int getdivision() {
		int div = numero1 / numero2;
		return div;
	}

	public int getresta() {
		int resta = numero1 - numero2;
		return resta;
	}

}
