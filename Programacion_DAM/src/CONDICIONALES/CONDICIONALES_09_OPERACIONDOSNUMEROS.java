package CONDICIONALES;

import java.util.Scanner;

public class CONDICIONALES_09_OPERACIONDOSNUMEROS {

	public static void main(String[] args) {
		int a;
		int b;
		int resultado = 0;

		Scanner sc = new Scanner(System.in);
		

		System.out.println("introduce un numero");
		a = sc.nextInt();
		System.out.println("introduce otro numero");
		b = sc.nextInt();

		System.out.println("introduce la operacion +, -, *, /");
		String operacion = sc.next();

		if (operacion.equals("+")) {

			resultado = a + b;
			System.out.println(resultado);
		}
		else if (operacion.equals("-")) {

			System.out.println(a - b);
		}
		else if (operacion.equals("*")) {

			System.out.println(a * b);
		}
		else {

			System.out.println(a / b);
		}

	}

}
