package POO_Areas;

import java.util.Scanner;

class Rectangulo {
	private int ancho = 0;
	private int alto = 0;

	Rectangulo(int an, int alto) {
		ancho = an; // atributo ancho sin referencia
		this.alto = alto; // atributo alto con referencia para evitar ambigüedad
	}

	public int getAncho() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base");
		ancho = sc.nextInt();
		return this.ancho;// devuelvo el atrituto con this
	}

	public int getAlto() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura");
		alto = sc.nextInt();
		return alto;// se puede hacer sin this
	}

	public void setRectangulo(int ancho, int alto) {
		// Se necesita para diferenciar entre atrubuto y parámetro
		this.ancho = ancho;
		this.alto = alto;
	}

	public int getRectangulo() {

		int rect = (ancho * alto / 2);
		System.out.print("El area del triangulo es: ");
		return rect; // Devuelve una referencia al objeto completo
	}
}


