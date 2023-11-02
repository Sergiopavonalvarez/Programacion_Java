package TAREA_ASOCIACIONES_01_04;

import java.util.ArrayList;

public class Carrera {
	private String nombre;
	private ArrayList<Resultado> resultados;

	public Carrera(String nombre) {
		this.nombre = nombre;
		this.resultados = new ArrayList<>();
	}

	public void agregarResultado(Atleta atleta, int tiempo) {
		Resultado resultado = new Resultado(atleta, this, tiempo);
		resultados.add(resultado);
	}

	public ArrayList<Resultado> getResultados() {
		return resultados;
	}

	public String getNombre() {
		return nombre;
	}

	public static void main(String[] args) {
		// crear objetos de prueba
		Atleta atleta1 = new Atleta("Juan", 25);
		Atleta atleta2 = new Atleta("Pedro", 30);
		Carrera carrera1 = new Carrera("Maratón");
		Carrera carrera2 = new Carrera("Carrera de 10km");

		// registrar resultados
		atleta1.agregarResultado(carrera1, 120); // Juan tardó 120 minutos en la maratón
		atleta2.agregarResultado(carrera1, 130); // Pedro tardó 130 minutos en la maratón
		atleta1.agregarResultado(carrera2, 40); // Juan tardó 40 minutos en la carrera de 10km
		atleta2.agregarResultado(carrera2, 45); // Pedro tardó 45 minutos en la carrera de 10km

		System.out.println("Información de los resultados del atleta Juan:");
		ArrayList<Resultado> resultadosJuan = atleta1.getResultados();
		for (Resultado resultado : resultadosJuan) {
			System.out.println("Carrera: " + resultado.getCarrera().getNombre() + ", Tiempo: " + resultado.getTiempo());
		}

		System.out.println("Información de los resultados de la carrera Maratón:");
		ArrayList<Resultado> resultadosMaraton = carrera1.getResultados();
		for (Resultado resultado : resultadosMaraton) {
			System.out.println("Atleta: " + resultado.getAtleta().getNombre() + ", Tiempo: " + resultado.getTiempo());
		}
	}
}
