package POO_Frecuencia;

import java.util.Scanner;

public class TestFrecuencia {

	public static void main(String[] args) {

		Frecuencia pl = new Frecuencia();

		Scanner sc = new Scanner(System.in);

		String pal;

		pal = sc.nextLine();
		pl.Frequency(pal);
		pl.GetFrecuency();

	}

}
