package POO_Areas;

import java.util.Scanner;

public class test_areas {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcion;
		System.out.println("elige una opcion para calcular el area: ");
		System.out.println("1. cuadrado");
		System.out.println("2. rectangulo");
		System.out.println("3. circulo");
		System.out.println("3. triangulo");
		opcion = scanner.nextInt();

		if (opcion == 2) {

			Rectangulo in = new Rectangulo(0, 0);
			in.getAlto();
			in.getAncho();
			System.out.println(in.getRectangulo());

		}
		if (opcion == 1) {

			Cuadrado area_cuadrado = new Cuadrado(0, 0, 0, scanner);

			area_cuadrado.altura_cuadrado();
			area_cuadrado.base_cuadrado();
			area_cuadrado.area_cuadrado();
		}

	}

}
