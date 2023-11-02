package TAREA_POO_06_02;

/**
 * @author Sergio Pavon
 * @revisor Enrique Huerta
 */
public class MiString3 {

	String chain = "";

	public boolean palindrome() {

		StringBuilder palabra2 = new StringBuilder(chain);
		palabra2.reverse();
		String palabra3 = palabra2.toString();
		if (palabra3.equals(chain)) {
			return true;
		} else {
			return false;
		}
	}

	public MiString3(String chain) {
		this.chain = chain;
	}
}

