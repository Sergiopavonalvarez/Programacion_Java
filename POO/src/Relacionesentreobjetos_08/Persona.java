package Relacionesentreobjetos_08;

import java.util.Scanner;

public class Persona {

	private String nombre;
	private String apellidos;
	private Boolean carnet;
	Scanner sc = new Scanner(System.in);

	public void Nombre() {

		System.out.println("Introduce el nombre");

		nombre = sc.nextLine();
	}

	public void Apellidos() {

		System.out.println("Intoduce los apellidos");

		apellidos = sc.nextLine();
	}

	public void Carnet() {

		String tiene_carnet = "";
		System.out.println("Tienes carnet?");
		tiene_carnet = sc.nextLine();

		if (tiene_carnet.equals("si")) {

			carnet = true;
			
		} else {
			carnet = false;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", carnet=" + carnet + "]";
	}

}
