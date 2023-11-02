package TAREA_HERENCIA_01;

import java.util.Scanner;

public class Rectangulo implements Figura {

	private int base;
	private int altura;
	private char caracter;

	
	
	
	public void base() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base del rectangulo");
		base=sc.nextInt();
	}
	
	public void altura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura del rectangulo");
		altura=sc.nextInt();
	}

	public int area() {

		return base * altura;
	}

	public void dibujar() {

		if (caracter == 'A') {
			System.out.println("***");
			System.out.println("***");
			System.out.println("***");
		}
		if (caracter == 'B') {
			System.out.println("**");
			System.out.println("**");
			System.out.println("**");
			System.out.println("**");

		}

	}

	public String nombre() {

		return "Cuadrado";
	}

	public void setCaracter(char c) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el caracter del rectangulo");
		caracter = sc.next().charAt(c);

	}

	public char getCaracter() {

		return caracter;
	}

}
