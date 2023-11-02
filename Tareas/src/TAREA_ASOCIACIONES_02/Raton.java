package TAREA_ASOCIACIONES_02;

/**
 * 
 * @author Sergio Pavon Alvarez
 *
 */

public class Raton {
	private String color;
	private int numero_botones;

	public String toString() {
		return "Raton [Color= " + color + ", Numero de botones= " + numero_botones + "]";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNumero_botones(int numero_botones) {
		this.numero_botones = numero_botones;
	}

	public Raton(String color, int numero_botones) {
		this.color = color;
		this.numero_botones = numero_botones;
	}


}
