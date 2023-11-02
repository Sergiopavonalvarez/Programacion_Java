package TAREA_EXCEPCIONES_01_04;

/**
 * @author Daniel Guevara

 * @author Hugo Risco
 * @revisor Sergio Pavon
 */
import java.util.Scanner;

public class Suma {

	public static double suma() {
		// creamos un contador que nos va a servir para salir del while
		int i = 0;
		// creamos una variable para al almacenar la operacion que haremos mas adelante
		double operacion = 0;
		// creamos el Scanner para pedir los 5 numeros
		Scanner entrada = new Scanner(System.in);
		// creamos un bucle que mientras i sea menor que 5 se repita
		while (i < 5) {
			// empezamos con el try and catch, que nos va a servir por si en caso de meter
			// un numero el usuario mete un caracter
			try {
				System.out.println("Introduzca un numero:");
				// creo la variable aux para guardar la cadena (en este caso los numeros que
				// introduzca el usuario)
				String aux = entrada.next();
				// paso la variable aux a double y la llamamos numero
				double numero = Double.parseDouble(aux);
				// realizamos la operacion: operacion+numero y la almacenamos en operacion
				operacion += numero;
				// en caso de que la cadena introducida sea un numero pues el contador suma 1
				i++;
				// y procedemos al catch es decir si no introduce un numero nos saldra este
				// mensaje
			} catch (Exception e) {
				System.out.println("No introdujiste un numero, vuelve a intentarlo");
			}
		}
		// por ultimo devolvemos operacion que dentro de esta variable esta la suma de
		// los 5 numeros
		return operacion;
	}
}
