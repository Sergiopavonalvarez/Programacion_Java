package POO_Password;

import java.util.Scanner;

public class Acceso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Password ejemplo = new Password("pass");

		String Cnt = "";

		boolean iscorrect;

		do {

			System.out.print("introduce la contraseña: ");

			Cnt = sc.nextLine();
			iscorrect = ejemplo.login(Cnt);

			if (iscorrect) {

				System.out.println("enhorabuena");
			} else {

				System.out.printf("contraseña incorrecta. Llevas %d fallos \n", ejemplo.getFallos());
			}

		} while (ejemplo.getFallos() < 3 && !iscorrect);

		if (!iscorrect) {

			System.out.println("no se puede acceder");
		}

	}

}
