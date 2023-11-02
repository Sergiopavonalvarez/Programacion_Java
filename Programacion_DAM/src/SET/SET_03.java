package SET;

import java.util.HashSet;
import java.util.TreeSet;

public class SET_03 {
	public static void main(String[] args) {
		// HashSet<Integer> numeros = new HashSet<Integer>();
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.add(4);
		numeros.add(6);
		numeros.add(8);
		numeros.add(10);
		numeros.add(15);
		numeros.add(18);
		numeros.add(21);
		numeros.add(3);
		


		for (Integer elto : numeros.descendingSet()) {

			System.out.println(elto);
		}
	}
}
