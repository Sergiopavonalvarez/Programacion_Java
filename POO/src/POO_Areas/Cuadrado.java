package POO_Areas;

import java.util.Scanner;

public class Cuadrado {

	private int base;
	private int altura;
	private int area=7;
	Scanner sc = new Scanner(System.in);

	public void base_cuadrado() {

		System.out.println("Introduce la base del cuadrado");
		base = sc.nextInt();

	}

	public void altura_cuadrado() {

		System.out.println("Introduce la altura del cuadrado");
		altura = sc.nextInt();
	}

	public void area_cuadrado() {
		
		area = base * altura;
		System.out.print("El area del cuadrado es: " + area);

	}

	public Cuadrado(int base, int altura, int area, Scanner sc) {
		this.base = base;
		this.altura = altura;
		this.area = area;
		this.sc = sc;

		
	}

}
