package TAREA_POO_04_BICICLETA;

/*
 * @ Author: Sergio Pavon Alvarez
 */
public class Humano {
	int peso;
	int altura;
	String Nombre;

	public Humano(int peso, int altura, String nombre) {
		this.peso = peso;
		this.altura = altura;
		Nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
