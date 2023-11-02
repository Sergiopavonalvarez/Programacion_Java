package STRING;

public class STRING_07_STRINGBUILDER {
	
	
	public void separarmiles (String numero) {
		
		StringBuilder cadena= new StringBuilder (numero);
		cadena.reverse();
		cadena.insert(3,".");
		
	
		cadena.reverse();
		System.out.println(cadena);
		
	}
	
	public static void main(String[] args) {
		
		STRING_07_STRINGBUILDER ejemplo = new STRING_07_STRINGBUILDER();
		String  numero= "1000";
		ejemplo.separarmiles(numero);
		
		
	}

}
