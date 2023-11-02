package Examen_final;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

public class Fiesta_en_casa {

	int total = 5;

	public static void main(String[] args) {

		Fiesta_en_casa aux = new Fiesta_en_casa();

		System.out.println("Hola Juan, introduce la lista:");

		Scanner sc = new Scanner(System.in);

		String lista_juan = sc.nextLine();

		String[] lista;
		String palabra = sc.nextLine();

		lista = lista_juan.split(" ");
		TreeSet<String> lista_marta = new TreeSet<String>();

		for (int i = 0; i < lista.length - 1; i++) {

			lista[i] = lista[i].toLowerCase();

			char primera = lista[i].charAt(0);
			primera = Character.toUpperCase(primera);

			StringBuilder builder = new StringBuilder(lista[i]);
			builder = builder.delete(0, 1);
			builder = builder.insert(0, primera);

			lista[i] = builder.toString();
			lista_marta.add(lista[i]);

			if (i == lista.length - 2) {

				System.out.print(lista[i]);
			} else {

				System.out.print(lista[i] + ", ");
			}

		}
		System.out.println();
		System.out.println("Listado de Marta: ");

		for (String elto : lista_marta) {

			if (elto.equalsIgnoreCase(lista_marta.last())) {

				System.out.print(elto);
			} else {

				System.out.print(elto + ", ");
			}

		}
		int total = 0;
		System.out.println();
		System.out.println("Rosa pasa los articulos por su caja");

		HashMap<String, Integer> ticket = new HashMap<>();
		for (String producto : lista_marta) {
			int precio = 0;
			System.out.print(producto + "--------->");
			precio = sc.nextInt();
			total = total + precio;
			ticket.put(producto, precio);

		}

		System.out.println("             TICKET                ");
		int suma = 0;
		for (Entry<String, Integer> entry : ticket.entrySet()) {
			String producto = entry.getKey();
			int precio = entry.getValue();
			System.out.println(producto + " --> " + precio + " Euros");
			suma += entry.getValue();
		}
		System.out.println("total ---------------->" + total + " Euros");
		int totalr = 5;
		aux.total(total);

	}

	public void total(int total) {
		this.total = total;
	}

}
