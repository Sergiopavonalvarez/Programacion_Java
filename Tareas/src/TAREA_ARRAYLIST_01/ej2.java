package TAREA_ARRAYLIST_01;

/**
 * @author Daniel Guevara
 * @Revision Hugo Risco
 */
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ej2 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		// Create a TreeSet of Integer
		TreeSet<Integer> conjuntoOrdenado = new TreeSet<Integer>();
		/// {Enter your code here
		conjuntoOrdenado.add(a);
		conjuntoOrdenado.add(b);
		conjuntoOrdenado.add(c);
		/// }
		Iterator<Integer> it = conjuntoOrdenado.iterator();
		System.out.println("Sorted numbers:");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}