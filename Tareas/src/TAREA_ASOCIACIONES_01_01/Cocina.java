package TAREA_ASOCIACIONES_01_01;

/**
 * @author Sergio Pavon Alvarez
 */

import java.util.Scanner;

public class Cocina {
	private boolean esIndependiente;
	private int numeroDeFuegos;
	Scanner sc = new Scanner(System.in);

	public boolean isEsIndependiente() {
		return esIndependiente;

	}

	public void setEsIndependiente(boolean esIndependiente) {
		this.esIndependiente = esIndependiente;
	}

	public void setNumeroDeFuegos(int numeroDeFuegos) {
		this.numeroDeFuegos = numeroDeFuegos;
	}

	@Override
	public String toString() {
		return "\nCocina=  Independiente " + esIndependiente + ", el numero de fuegos es " + numeroDeFuegos;
	}



	public Cocina(boolean esIndependiente, int numeroDeFuegos) {

		esIndependiente = false;
		numeroDeFuegos = 0;


	}

}
