package TAREAS;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coordenada_x;
		int coordenada_y;
		System.out.println("introduce la coordenada X distinto a cero");
		coordenada_x = sc.nextInt();
		System.out.println("introduce la coordenada Y distinto a cero");
		coordenada_y = sc.nextInt();

		if (coordenada_x > 0 && coordenada_y > 0) {

			System.out.println("Primer cuadrante");
		}
		if (coordenada_x < 0 && coordenada_y < 0) {
			System.out.println("Segundo cuadrante");

		} else {

			System.out.println("Coordenadas erroneas");
		}

	}

}
