package TAREA_ASOCIACIONES_01_04;

public class Resultado {
	private Atleta atleta;
	private Carrera carrera;
	private int tiempo;
	private int resultado;

	public int getResultado() {
		return resultado;
	}

	public Resultado(Atleta atleta, Carrera carrera, int tiempo) {
		this.atleta = atleta;
		this.carrera = carrera;
		this.tiempo = tiempo;
	}

	public Atleta getAtleta() {
		return atleta;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public int getTiempo() {
		return tiempo;
	}
}
