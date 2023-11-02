package COLECCIONES;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PRUEBAS {

	public static void main(String[] args) {
		ArrayList<String> LISTA = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		/*
		 * LISTA.add(sc.next()); LISTA.add("Jose"); LISTA.add("Pepe");
		 * LISTA.add("Paco"); LISTA.add("Otis");
		 * 
		 * LISTA.set(4, "Pablo");
		 * 
		 * String ultimo= LISTA.get(2); LISTA.set(2, "Pablo"); LISTA.set(0, ultimo);
		 * System.out.println(LISTA.size()-1);
		 */

		for (int i = 0; i < 3; i++) {

			System.out.println("Introduce un nombre");
			LISTA.add(sc.next());

		}
		
		for (String string : LISTA) {
			System.out.println(string);
		}

	}

}
