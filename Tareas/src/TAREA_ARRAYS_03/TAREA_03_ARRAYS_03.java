package TAREA_ARRAYS_03;

/*
 * @ Sergio Pavon
 */

import java.util.Scanner;

public class TAREA_03_ARRAYS_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una palabra o una frase");
		String palabra = in.nextLine();
		String cadena1 = palabra.replaceAll("\\s", "");
		StringBuilder cadena = new StringBuilder(palabra);
		cadena.reverse();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				cadena.deleteCharAt(i);
				i--;
			}
		}
		String cadena2 = cadena.toString();
		if (cadena2.equalsIgnoreCase(cadena1)) {
			System.out.println("La palabra/frase es palindromo");
		} else {
			System.out.println("La palabra/frase no es palindromo");
		}
	}
}
