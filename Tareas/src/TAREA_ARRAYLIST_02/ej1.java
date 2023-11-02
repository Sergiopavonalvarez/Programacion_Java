package TAREA_ARRAYLIST_02;

import java.io.*;
/*
 * @autor: Oscar.S
 * 
 */
class ej1 {

	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String newstr = "";
		char ch = ' ';

		System.out.println("Enter the Word:");
		String str = br.readLine();

		/// {write your code here
		String palabras = "aeiouAEIOU";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (!palabras.contains(String.valueOf(ch))) {
				newstr += ch;

			}
		}
		/// }

		System.out.println("Edited Word:" + newstr);
	}

}

//Explicacion:

// inicimos el codigo almacenando las vocaleas, tanto en mayuscula como en minuscula
// el bucle lo usamos para recorrer la longitud de la cadena

//----------------------------------------------------------------------------|
// valueOf lo dimos en (UF 3.1.3 - Strings.pdf Pag-9)                         |
// lo uso para buscar un carácter específico dentro de una cadena, en este    |
// caso es para verificar si es una vocal o no.                               |
//----------------------------------------------------------------------------|