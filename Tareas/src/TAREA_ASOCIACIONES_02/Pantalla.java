package TAREA_ASOCIACIONES_02;

/**
 * 
 * @author Sergio Pavon Alvarez
 *
 */
public class Pantalla {
	private int pixeles;
	private String tamaño;
	public String toString() {
		return "Pantalla [Pixeles= " + pixeles + ", Tamaño= " + tamaño + "]";
	}

	public void setPixeles(int pixeles) {
		this.pixeles = pixeles;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public Pantalla(int pixeles, String tamaño) {
		this.pixeles = pixeles;
		this.tamaño = tamaño;
	}


}
