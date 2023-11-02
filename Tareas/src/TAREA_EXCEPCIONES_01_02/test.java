package TAREA_EXCEPCIONES_01_02;

/**
 * 
 * @author Sergio Pavon
 * @Revisor Daniel y Hugo
 */
public class test {
	// El error salta si la frase acaba en un punto
	public class ProvocarExcepcion3 {
		private void metodoExcepcion(char[] ArrayDeChar) {
			ArrayDeChar[ArrayDeChar.length - 1] = '.';
		}
	}

	public static void main(String[] args) {
		Ejercicio2 ejemplo = new Ejercicio2(null);
		// ejemplo.mayusculas(null);
		try {
			ejemplo.mayusculas(null);
		} catch (Exception e) {
			System.out.print(" Se ha producido un error, reproduce el programa de nuevo sin acabar la frase en '.' "
					+ e.getMessage());
		}
	}
}
