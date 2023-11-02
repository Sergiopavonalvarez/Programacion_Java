
/**

@author Oscar.S
*/

// La línea de arriba es un comentario de documentación de Java que indica el autor del código.

package TAREA_ARRAYS_03;

import java.util.Scanner;
// Esta línea importa la clase Scanner del paquete java.util para permitir al usuario ingresar datos.

public class TAREA_03_ARRAYS_01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
// Crea un nuevo objeto Scanner llamado "entrada" para recibir datos del usuario.
		System.out.println("introduzca el parrafo en el que quiere buscar la cantidad de veces en las que sale su letra");
// Imprime un mensaje en consola pidiendo al usuario que ingrese un párrafo.
		String cadena = entrada.nextLine();
// El objeto "entrada" recibe el párrafo ingresado por el usuario y lo almacena en una variable llamada "cadena".
		System.out.println("introduzca la letra que quiere buscar");
// Imprime un mensaje en consola pidiendo al usuario que ingrese una letra para buscar.
		char letra = entrada.next().charAt(0);
// El objeto "entrada" recibe la letra ingresada por el usuario y la almacena en una variable de tipo char llamada "letra".
		int i = 0;
// Crea una variable entera llamada "i" y la inicializa en 0.
		char[] b = { letra };
// Crea un arreglo de caracteres llamado "b" con un solo elemento, la letra ingresada por el usuario.
		for (char x : cadena.toCharArray()) {
// Itera sobre cada caracter del arreglo de caracteres de "cadena"
			if (x == b[0]) {
				i++;
			}
// Si el caracter actual "x" es igual al primer caracter del arreglo "b", entonces incrementa la variable "i" en 1.
		}
		System.out.println("La cantidad de veces que aparece la letra " + b[0] + " es de: " + i);
// Imprime en consola la cantidad de veces que aparece la letra buscada en el párrafo.
	}
}
