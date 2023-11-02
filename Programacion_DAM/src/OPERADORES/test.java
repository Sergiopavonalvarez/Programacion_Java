package OPERADORES;

/**
 * 
 *  Autor= Sergio Pavon Alvarez
 */

import java.util.Random;

public class test {

	public static void main(String[] args) {

		Random r = new Random();
		char c = (char) (r.nextInt(26) + 'a');

		System.out.println(c);

	}

}
