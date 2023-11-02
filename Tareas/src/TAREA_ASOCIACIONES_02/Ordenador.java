package TAREA_ASOCIACIONES_02;

/**
 * 
 * @author Sergio Pavon Alvarez
 *
 */

public class Ordenador {
	
	private String marca;
	private String peso;
	private CPU ordenador_CPU;
	private Pantalla pantalla_ordenador;
	private Teclado teclado_ordenador;
	private Raton raton_ordenador;

	public Ordenador(String marca, String peso, CPU ordenador_CPU, Pantalla pantalla_ordenador,
			Teclado teclado_ordenador, Raton raton_ordenador) {
		this.marca = marca;
		this.peso = peso;
		this.ordenador_CPU = ordenador_CPU;
		this.pantalla_ordenador = pantalla_ordenador;
		this.teclado_ordenador = teclado_ordenador;
		this.raton_ordenador = raton_ordenador;
	}
	public String toString() {
		return "Ordenador [Marca= " + marca + ", Peso= " + peso + "]" + "\n" + ordenador_CPU + "\n" + pantalla_ordenador
				+ "\n" + teclado_ordenador + "\n" + raton_ordenador;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public void setCPU_ordenador(CPU ordenador_CPU) {
		this.ordenador_CPU = ordenador_CPU;
	}

	public void setCPU_pantalla(Pantalla pantalla_ordenador) {
		this.pantalla_ordenador = pantalla_ordenador;
	}

	public void setCPU_teclado(Teclado teclado_ordenador) {
		this.teclado_ordenador = teclado_ordenador;
	}

	public void setCPU_raton(Raton raton_ordenador) {
		this.raton_ordenador = raton_ordenador;
	}


}
