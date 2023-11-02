package SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SET_04 {
	public static void main(String[] args) {
		//LinkedHashSet<String> numeros = new LinkedHashSet<String>();
		//HashSet<String> numeros = new HashSet<String>();
		TreeSet<String> numeros = new TreeSet<String>();
		numeros.addAll(Arrays.asList("Uno", "Dos", "Tres", "Cuatro"));

		for (String elto : numeros) {
			System.out.println(elto);
		}
	}
}
