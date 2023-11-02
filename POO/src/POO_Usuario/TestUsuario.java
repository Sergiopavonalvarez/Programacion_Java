package POO_Usuario;

import java.util.Scanner;

public class TestUsuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("introduce un nombre con dos apellidos");

		String[] nombre = new String[3];

		nombre[0] = sc.nextLine();
		nombre[1] = sc.nextLine();
		nombre[2] = sc.nextLine();

		Usuario nom = new Usuario();

		System.out.println(nom.generarUsuario(nombre));

	}

}
