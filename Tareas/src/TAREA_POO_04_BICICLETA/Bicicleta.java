package TAREA_POO_04_BICICLETA;

/*
 * @ Author: Sergio Pavon Alvarez
 */
public class Bicicleta {
	int velocidad = 0;
	int cadencia = 0;
	int marcha = 0;
	int frenar = 0;
	String color;

	public void CambiarMarcha(int marcha) {
		if (marcha == 1) {
			velocidad = 5;
		}
		if (marcha == 2) {
			velocidad = 10;
		}
		if (marcha == 3) {
			velocidad = 15;
		}
		if (marcha == 4) {
			velocidad = 20;
		}
		if (marcha == 5) {
			this.velocidad = 25;
		}
		System.out.println("la velocidad es " + velocidad);
	}

	public int Frenar() {
		this.velocidad = this.velocidad - frenar;
		return velocidad;
	}

	public Bicicleta(int velocidad, int cadencia, int marcha, int frenar, String color) {
		this.velocidad = velocidad;
		this.cadencia = cadencia;
		this.marcha = marcha;
		this.frenar = frenar;
		this.color = color;
	}

}
