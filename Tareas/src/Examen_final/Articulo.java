package Examen_final;

import java.util.Arrays;
import java.util.Scanner;

public class Articulo {

	String nombre;
	int[] precio = new int[5];

	public Articulo(String nombre) {

		this.nombre = nombre;

	}

	public Articulo() {
		// TODO Auto-generated constructor stub
	}

	public void añadirprecio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("añade cinco precios");
		for (int i = 0; i < 5; i++) {

			this.precio[i] = sc.nextInt();

		}

	}

	public int getPrecio() {

		int precios = 0;
		for (int i = 0; i < this.precio.length; i++) {
			precios = precios + this.precio[i];

		}
		return precios;
	}

	public void setPrecio(int[] precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", precio=" + Arrays.toString(precio) + "]";
	}

}
