package TAREA_POO_01;
/**
 * @author Sergio Pavon
 * @revisor Enrique Huerta
 */
public class MiString {

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

	public MiString(String chain) {
		this.chain = chain;
	}
}
