package SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SET_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<String> numero = new HashSet<String>();

		numero.addAll(Arrays.asList(sc.nextLine().split("")));

		System.out.println("el numero de digitos diferentes es: " + numero.size());
	}

}
