package TAREA_ARRAYS_03;

import java.util.Scanner;

public class TAREA_03_ARRAYS_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su texto");
		String texto = sc.next();
		int numeromayusculas = 0, numerominusculas = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) > 65 && texto.charAt(i) < 90) {
				numeromayusculas++;
			} else {
				if (texto.charAt(i) > 97 && texto.charAt(i) < 122) {
					numerominusculas++;
				}
			}

		}
		System.out.println("Cantidad de mayusculas del texto :" + texto + " es:" + numeromayusculas);
		System.out.println("Cantidad de minusculas del texto :" + texto + " es:" + numerominusculas);

	}

}
