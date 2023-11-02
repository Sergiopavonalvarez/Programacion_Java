package HOLAMUNDO;

/**
 * 
 * Autor= Sergio Pavon Alvarez
 */
public class ejercicio_4 {

	public static void main(String[] args) {

		int edad = 4;
		int nivel_de_estudios = 30;
		int ingresos = 60;
		boolean jasp = edad <= 28 | nivel_de_estudios > 3 | (ingresos > 28.000);
		System.out.println(jasp);

	}

}
