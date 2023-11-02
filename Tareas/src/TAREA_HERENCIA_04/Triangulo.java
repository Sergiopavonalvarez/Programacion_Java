package TAREA_HERENCIA_04;

import java.util.Scanner;
/**
 * @author Sergiopavon
 * 
 */

import java.util.Iterator;
import java.util.Scanner;

public class Triangulo implements Figura {

	private int lado;
	private String tipo;
	private char caracter = '*';

	public String tipo() {

		if (caracter == 'A') {

			tipo = "Tipo A";

		}
		if (caracter == 'B') {

			tipo = "Tipo B";

		}
		if (caracter == 'C') {

			tipo = "Tipo C";

		} else if (caracter == 'D') {

			tipo = "Tipo D";

		}
		return tipo;

	}

	public void lado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el lado del triangulo");
		lado = sc.nextInt();
	}

	public int area() {

		return (lado * lado) / 2;
	}

	public void dibujar() {

		if (caracter == 'A') {

			for (int i = lado; i >= 0; i--) {
				for (int j = i; j > 0; j--) {
					System.out.print(caracter);
				}
				System.out.println();

			}

		}
		if (caracter == 'B') {
			for (int i = 0; i < lado; i++) {
				for (int j = 1; j < i + 1; j++) {
					System.out.print(" ");
				}
				for (int f = 0; f < lado - i; f++) {
					System.out.print(caracter);
				}
				System.out.println();
			}
		}

		if (caracter == 'C') {
			if (caracter == 'C') {
				for (int i = 1; i <= lado; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(caracter);
					}
					System.out.println();
				}

			}
		}

		if (caracter == 'D') {
			for (int i = lado - 1; i >= 0; i--) {
				for (int j = 0; j <= i; j++) {
					if (j < i) {
						System.out.print(" ");
					} else {
						for (int k = 0; k < lado - j; k++) {
							System.out.print(caracter);
						}
					}
				}
				System.out.println();
			}

		}

	}

	public String nombre() {

		return "Triangulo";
	}

	public void setCaracter(char c) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el caracter con el que quieres que se imprima");
		caracter = sc.next().charAt(c);
	}

	public char getCaracter() {
		return caracter;
	}

	public Triangulo(int lado, String tipo, char caracter) {
		this.lado = lado;
		this.tipo = tipo;
		this.caracter = caracter;

	}

	@Override
	public String Nombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Dibujar() {
		// TODO Auto-generated method stub

	}

	@Override
	public int Area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
