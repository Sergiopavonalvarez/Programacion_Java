package TAREA_ASOCIACIONES_02;

/**
 * 
 * @author Sergio Pavon Alvarez
 *
 */

public class Teclado {
	private String tamaño_teclado;
	private String tipo;

	@Override
	public String toString() {
		return "Teclado [Tamaño del teclado= " + tamaño_teclado + ", Tipo de conexion= " + tipo + "]";
	}

	public void setTamaño_teclado(String tamaño_teclado) {
		this.tamaño_teclado = tamaño_teclado;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Teclado(String tamaño_teclado, String tipo) {
		this.tamaño_teclado = tamaño_teclado;
		this.tipo = tipo;
	}



}
