package METODOS;

import java.util.Iterator;
import java.util.Scanner;

public class METODOS_02 {

	public boolean longitud(String validacion) {

		if (validacion.length() > 8) {

			return true;

		} else {
			System.out.println("Tienen que ser 8 caracteres");

			return false;

		}
	}

	public boolean mayusculas(String validacion) {

		if ("ABCDEFGHIJKLMNÑOPQRSTUWXYZ".contains(validacion) && "abcdefghijklmnñopqrsetuwxyz".contains(validacion)) {

			return true;
		} else {
			System.out.println("Debe contener mayusculas y minusculas");
			return false;
		}

	}

	public static void main(String[] args) {

		String validacion = "";

		Scanner sc = new Scanner(System.in);
		METODOS_02 ct = new METODOS_02();

		do {
			System.out.println("introduce la contraseña");
			validacion = sc.next();

			ct.mayusculas(validacion);
			ct.longitud(validacion);

		} while (ct.longitud(validacion) == false && ct.mayusculas(validacion) == false);

		System.out.println("contraseña correcta");

	}

}
