//@author Daniel  

package TAREA_ARRAYS_02;

import java.util.Arrays;
import java.util.Scanner;

public class TAREA_02_ARRAYS_01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String carta1 = entrada.nextLine();
		String carta2 = entrada.nextLine();
		String carta3 = entrada.nextLine();
		String carta4 = entrada.nextLine();
		// se introducen las 4 cartas
		String[] part1 = carta1.split(" ");
		String revision1 = part1[0];
		String pinta1 = part1[1];
		String[] part2 = carta2.split(" ");
		String revision2 = part2[0];
		String pinta2 = part2[1];
		String[] part3 = carta3.split(" ");
		String revision3 = part3[0];
		String pinta3 = part3[1];
		String[] part4 = carta4.split(" ");
		String revision4 = part4[0];
		String pinta4 = part4[1];
		// se separan los palos de los numeros

		// Procedemos a cambiar las letras por numeros
		if (revision1.equalsIgnoreCase("J")) {
			revision1 = revision1.replace("J", "11");
		} else if (revision2.equalsIgnoreCase("J")) {
			revision2 = revision2.replace("J", "11");
		} else if (revision3.equalsIgnoreCase("J")) {
			revision3 = revision3.replace("J", "11");
		} else if (revision4.equalsIgnoreCase("J")) {
			revision4 = revision4.replace("J", "11");
		}
		if (revision1.equalsIgnoreCase("Q")) {
			revision1 = revision1.replace("Q", "12");
		} else if (revision2.equalsIgnoreCase("Q")) {
			revision2 = revision2.replace("Q", "12");
		} else if (revision3.equalsIgnoreCase("Q")) {
			revision3 = revision3.replace("Q", "12");
		} else if (revision4.equalsIgnoreCase("Q")) {
			revision4 = revision4.replace("Q", "12");
		}
		if (revision1.equalsIgnoreCase("K")) {
			revision1 = revision1.replace("K", "13");
		} else if (revision2.equalsIgnoreCase("K")) {
			revision2 = revision2.replace("K", "13");
		} else if (revision3.equalsIgnoreCase("K")) {
			revision3 = revision3.replace("K", "13");
		} else if (revision4.equalsIgnoreCase("K")) {
			revision4 = revision4.replace("K", "13");
		}
		if (revision1.equalsIgnoreCase("A")) {
			revision1 = revision1.replace("A", "14");
		} else if (revision2.equalsIgnoreCase("A")) {
			revision2 = revision2.replace("A", "14");
		} else if (revision3.equalsIgnoreCase("A")) {
			revision3 = revision3.replace("A", "14");
		} else if (revision4.equalsIgnoreCase("A")) {
			revision4 = revision4.replace("A", "14");
		}
		int num1;
		int num2;
		int num3;
		int num4;
		num1 = Integer.parseInt(revision1);
		num2 = Integer.parseInt(revision2);
		num3 = Integer.parseInt(revision3);
		num4 = Integer.parseInt(revision4);
		// una vez cambiados los almacenamos en una variable
		// luego de tenerlos almacenados los introducimos en un Arrays para poder
		// ordenarlos de una forma facil
		int[] cartas = { num1, num2, num3, num4 };
		Arrays.sort(cartas);
		int cartaFaltante;
		if (cartas[3]==14) {
			cartaFaltante=10;
		}else 
			cartaFaltante = cartas[3] + 1;
		// emepzamos con los ifs para luego ponerle los palos
		if (pinta1.equalsIgnoreCase("c") && pinta2.equalsIgnoreCase("c") && pinta3.equalsIgnoreCase("c")
				&& pinta4.equalsIgnoreCase("c")) {

			if ((cartas[0] + 1) == cartas[1] && (cartas[1] + 1) == cartas[2] && (cartas[2] + 1) == cartas[3]) {
				// si todas las cartas estan seguidas y la siguiente carta seria una letra
				// creamos un if por si la cartaFaltante es una letra para cambiarla de numero a
				// letra
				if (cartaFaltante == 11) {
					System.out.println("J c");
				} else if (cartaFaltante == 12) {
					System.out.println("Q c");
				} else if (cartaFaltante == 13) {
					System.out.println("K c");
				} else if (cartaFaltante == 14) {
					System.out.println("A c");
				} else
					System.out.println(cartaFaltante + " c");
			} else if (pinta1.equalsIgnoreCase("d") && pinta2.equalsIgnoreCase("d") && pinta3.equalsIgnoreCase("d")
					&& pinta4.equalsIgnoreCase("d")) {
				if ((cartas[0] + 1) == cartas[1] && (cartas[1] + 1) == cartas[2] && (cartas[2] + 1) == cartas[3]) {
					// si todas las cartas estan seguidas y la siguiente carta seria una letra
					// creamos un if por si la cartaFaltante es una letra para cambiarla de numero a
					// letra
					if (cartaFaltante == 11) {
						System.out.println("J d");
					} else if (cartaFaltante == 12) {
						System.out.println("Q d");
					} else if (cartaFaltante == 13) {
						System.out.println("K d");
					} else if (cartaFaltante == 14) {
						System.out.println("A d");
					} else
						System.out.println(cartaFaltante + " d");
				}
			} else if (pinta1.equalsIgnoreCase("p") && pinta2.equalsIgnoreCase("p") && pinta3.equalsIgnoreCase("p")
					&& pinta4.equalsIgnoreCase("p")) {
				if ((cartas[0] + 1) == cartas[1] && (cartas[1] + 1) == cartas[2] && (cartas[2] + 1) == cartas[3]) {
					// si todas las cartas estan seguidas y la siguiente carta seria una letra
					// creamos un if por si la cartaFaltante es una letra para cambiarla de numero a
					// letra
					if (cartaFaltante == 11) {
						System.out.println("J p");
					} else if (cartaFaltante == 12) {
						System.out.println("Q p");
					} else if (cartaFaltante == 13) {
						System.out.println("K p");
					} else if (cartaFaltante == 14) {
						System.out.println("A p");
					} else
						System.out.println(cartaFaltante + " p");
				}

			} else if (pinta1.equalsIgnoreCase("t") && pinta2.equalsIgnoreCase("t") && pinta3.equalsIgnoreCase("t")
					&& pinta4.equalsIgnoreCase("t")) {
				if ((cartas[0] + 1) == cartas[1] && (cartas[1] + 1) == cartas[2] && (cartas[2] + 1) == cartas[3]) {
					// si todas las cartas estan seguidas y la siguiente carta seria una letra
					// creamos un if por si la cartaFaltante es una letra para cambiarla de numero a
					// letra
					if (cartaFaltante == 11) {
						System.out.println("J t");
					} else if (cartaFaltante == 12) {
						System.out.println("Q t");
					} else if (cartaFaltante == 13) {
						System.out.println("K t");
					} else if (cartaFaltante == 14) {
						System.out.println("A t");
					} else
						System.out.println(cartaFaltante + " t");
				}
			}

		} else
			System.out.println("NADA");

	}
}
