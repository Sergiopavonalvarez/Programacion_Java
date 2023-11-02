package TAREA_POO_02;

public class test {

	public class ProvocarExcepcion3 {
		private void metodoExcepcion(char[] ArrayDeChar) {

			ArrayDeChar[ArrayDeChar.length - 1] = '.';
		}

	}

	public static void main(String[] args) {

		Mayusculas ejemplo = new Mayusculas(null);

		// ejemplo.mayusculas(null);

		try {

			ejemplo.mayusculas(null);
		} catch (Exception e) {
			System.out.print(" Se ha producido un error, reproduce el programa de nuevo sin acabar la frase en '.' "
					+ e.getMessage());
		}

	}

}
