package OPERADORES;

/**
 * 
 * Autor= Sergio Pavon Alvarez
 */
public class ejercicio5 {

	public static void main(String[] args) {
		int num = 5;
		num += num - 1 * 4 + 1;
		System.out.println(num);
		num = 4;
		num %= 7 * num % 3 * 7 >> 1;
		System.out.println(num);

		// El primer numero muestra un 7. El num es 5 que se le sumara el resutado de 5
		// por 4 +1 y -1
		// El segundo numero es 1.

	}

}
