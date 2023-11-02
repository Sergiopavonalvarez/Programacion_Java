package TAREA_HERENCIA_03;

/**
 * 
 * @author Miguel Pavon
 * @revisor Sergio Pavon
 *
 */

public class Vehiculo {

	private int ruedas;
	private int velocidad;

	public Vehiculo() {
		this(0, 0);

	}

	public Vehiculo(int ruedas, int velocidad) {
		this.ruedas = 4;
		this.velocidad = 0;
	}

	public void acelerar(int mas) {
		velocidad += mas;
		if (velocidad < 120) {

			System.out.println(
					"se acelero desde la clase padre a " + mas + "Km/h la velocidad actual es: " + velocidad + "Km/h");
		} else if (velocidad > 120) {

			System.out.println("vas a mas de 120Km/h vamos a freanr a 120Km/h");
			velocidad = 120;
		}
	}

	public void frenar(int menos) {
		velocidad -= menos;
		if (velocidad > 0) {

			System.out.println(
					"Se freno de la clase padre " + menos + "Km/h, la velocidad actual es: " + velocidad + "Km/h");
		} else if (velocidad <= 0) {
			System.out.println("Estas parado desde la clase padre");
		}
	}

	public int getRuedas() {
		System.out.println("Clase padre =====>");
		return ruedas;

	}

	public int getVelocidad() {
		System.out.println("Clase padre =====>");
		return velocidad;
	}

}
