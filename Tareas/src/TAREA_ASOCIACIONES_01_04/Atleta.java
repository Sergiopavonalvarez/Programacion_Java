package TAREA_ASOCIACIONES_01_04;

import java.util.ArrayList;
/**
 * 
 * @author HUGO RISCOOO
 * @revisor Daniel Guevara 
 *
 */
public class Atleta {
	private String nombre;
	private ArrayList<Resultado> resultados;

	public Atleta(String nombre, int i) {
		this.nombre = nombre;
		this.resultados = new ArrayList<>();
	}

	public void agregarResultado(Carrera carrera, int tiempo) {
		Resultado resultado = new Resultado(this, carrera, tiempo);
		resultados.add(resultado);
	}

	public ArrayList<Resultado> getResultados() {
		return resultados;
	}

	public String getNombre() {
		return nombre;
	}
}
