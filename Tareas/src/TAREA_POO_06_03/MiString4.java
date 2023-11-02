package TAREA_POO_06_03;

/**
 * @author HUGO RISCO
 * @revisor Daniel Guevara
 */
import java.io.IOException;

public class MiString4 {
	public String chain;

	public String colocarMayuscula(char minuscula, char mayuscula, java.util.Scanner sc) throws IOException {
		String resultado = "";
		System.out.println("Ingrese un caracter:");
		char letra = (char) System.in.read();
		for (int i = 0; i < chain.length(); i++) {
			if (chain.charAt(i) == letra) {
				resultado += Character.toUpperCase(chain.charAt(i));
			} else {
				resultado += chain.charAt(i);
			}

		}

		chain = resultado;
		return chain;

	}

	public MiString4(java.util.Scanner sc) {
		System.out.println("Introduzca una cadena de caracteres");
		this.chain = sc.nextLine();
	}

}
