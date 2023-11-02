package FOR;

import java.util.Iterator;
import java.util.Scanner;

public class FOR_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int sumatorio = 0;

		for (int contador = 0; contador < 10; contador++) {
			numero = sc.nextInt();

			if (contador >= 5) {

				sumatorio = sumatorio + numero;
			}

		}
		System.out.println(sumatorio);
	}

}
