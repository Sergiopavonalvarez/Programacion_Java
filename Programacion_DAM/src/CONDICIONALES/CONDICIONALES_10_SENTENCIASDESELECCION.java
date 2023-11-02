package CONDICIONALES;

import java.util.Scanner;

public class CONDICIONALES_10_SENTENCIASDESELECCION {

	public static void main(String[] args) {

		int a;

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero");

		a = sc.nextInt();
		
		if (a %2 ==0) {
			
			System.out.println("es par");
			
			
		} else {
			
			System.out.println("es impar");
		}

	}

}
