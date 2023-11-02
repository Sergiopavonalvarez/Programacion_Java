package TAREA_AHORCADO;

public class pruebas {

	public static void main(String[] args) {
		
		String p_oculta;
		// Para almacenar la parte que se ha adivinado de la palabra
		char[] p_visible;
		
		
		String[] palabras = { "BATMAN", "SUPERMAN", "HULK", "CENICIENTA", "SPIDERMAN", "PINOCHO", "LOBEZNO" };
		int n = (int) Math.floor(Math.random() * palabras.length);
		p_oculta = palabras[n];
		p_visible = new char[p_oculta.length()];
		for (int i = 0; i < p_visible.length; i++) {
			p_visible[i] = '_';
		}
		
		
		for (int i = 0; i < p_visible.length - 1; i++) {

			System.out.print(p_visible[i] + " ");

		}
		System.out.println();
		
		
		int aciertos = 0;

		for (int i = 0; i < p_oculta.length()-1; i++) {

			if (p_oculta.charAt(i) == p_oculta.charAt(i + 1)) {
				aciertos++;

			}
		}

		System.out.println(aciertos);
	}
}


