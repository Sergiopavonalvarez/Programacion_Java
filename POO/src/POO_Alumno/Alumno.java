package POO_Alumno;

import java.util.Scanner;

public class Alumno {

	private String nombre;
	private String curso;
	private int[] notas;

	public Alumno(String nombre, String curso, int asignaturas) {

		this.nombre = nombre;
		this.curso = curso;
		this.notas = new int[asignaturas];
	}

	public Alumno(String nombre, String curso) {

		this(nombre, curso, 5);
	}

	public Alumno(String nombre) {

		this(nombre, "dam");

	}

	public void mayusnombre() {

		nombre = nombre.toUpperCase();
		System.out.println(nombre);

	}

	public void pedirnotas() {
		
		int suma=0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce la nota");
			notas[i] = sc.nextInt();
			suma=suma+notas[i];

		}
		int media=suma/5;
		System.out.println("la media es " + media);
	}

	public void pedirapellido() {
		System.out.println("Introduce el apellido");
		Scanner sc = new Scanner(System.in);

		String apellido = sc.nextLine();
		System.out.println("el nombre completo es " + nombre + " " + apellido);

	}

}
