package STRING;

public class STRING_06_STRINGBUILDER {

	public static void main(String[] args) {

		String cadena = "hola clase";
		StringBuilder cadenadinamica = new StringBuilder(cadena);
		cadenadinamica.append(", que tal estais?");
		System.out.println(cadenadinamica);
		
		cadenadinamica.insert(4, "->");
		System.out.println(cadenadinamica);
		
		cadenadinamica.setCharAt(4, '?');
		System.out.println(cadenadinamica);
		
		cadenadinamica.delete(4,6);
		System.out.println(cadenadinamica);
		
		cadenadinamica.reverse();
		System.out.println(cadenadinamica);
		

		
		

		

	}
}
