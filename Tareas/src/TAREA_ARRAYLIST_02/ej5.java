package TAREA_ARRAYLIST_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * @Quique Huerta
 * Revisor: @Daniel Guevara
 */
public class ej5 {

	public static void main(String a[]) throws Exception {
		String strarr[]; // array which will hold splitted strings of the statement
		String st; // contains user input statement
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Statement:");
		st = br.readLine();
		System.out.println("The reverse is:");
		// Create Array of Strings
		strarr = st.split(" ");
		// Create ArrayList of String
		ArrayList<String> lista = new ArrayList<String>();
		/// {write your code here
		Collections.addAll(lista, strarr);
		Collections.reverse(lista);
		// En una linea
		st = lista.toString().replace(",", "").replace("[", "").replace("]", "");

		// Directamente en el syso:
		// System.out.println(st.replace(",", "").replace("[", "").replace("]", ""));
		System.out.println(st);
	}

}
