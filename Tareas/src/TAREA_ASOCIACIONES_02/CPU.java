package TAREA_ASOCIACIONES_02;

/**
 * 
 * @author Sergio Pavon Alvarez
 *
 */

public class CPU {
	
	private int ram;
	private String procesador;
	public String toString() {
		return "CPU [RAM= " + ram + " GB" + ", Procesador= " + procesador + "]";
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	

	public CPU(int ram, String procesador) {
		this.ram = ram;
		this.procesador = procesador;
	}

}
