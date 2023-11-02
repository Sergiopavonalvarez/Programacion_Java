package Examen_final;

import java.util.Scanner;

public class Compra {

	int fecha;
	String Supermercado;
	Articulo l;

	public Compra(int fecha, String supermercado, Articulo l) {
		super();
		this.fecha = fecha;
		Supermercado = supermercado;
		this.l = l;
	}

	public int calcularTicker() {

		Articulo t = new Articulo("Mercadona");
		t.añadirprecio();
		int ticket = 0 + t.getPrecio();
		System.out.print("precio total: ");
		return ticket;

	}

	@Override
	public String toString() {
		return "Compra [fecha=" + fecha + ", Supermercado=" + Supermercado + ", l=" + l + "]";
	}

}
