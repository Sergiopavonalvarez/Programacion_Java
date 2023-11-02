package WHILE;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 100;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("mete un numero entre cero y cien incluidos");
			value = sc.nextInt();
		} while (value > 100 || value <0);
		
		System.out.println("thanks for nada");

	}

}
