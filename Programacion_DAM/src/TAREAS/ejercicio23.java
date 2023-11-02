package TAREAS;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero_cuenta = 123456789;
		int saldo = 100;
		int dato = 0;
		String estado_cuenta = "";

		while (dato >= 0) {

			System.out.println("Ingresa el dato de la cuenta");

			dato = sc.nextInt();
			saldo = saldo + dato;

		}
		if (saldo > 0) {

			estado_cuenta = "ACREEDOR";
		}
		if (saldo < 0) {

			estado_cuenta = "DEUDOR";
		}
		if (saldo == 0) {

			estado_cuenta = "NULO";
		}

		System.out.println(
				"el saldo total es " + saldo + " el estado es " + estado_cuenta + " y la cuenta es " + numero_cuenta);

	}

}
