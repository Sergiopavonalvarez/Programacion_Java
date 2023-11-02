package TAREA_ASOCIACIONES_01_04;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// crear objetos Atleta y Carrera
		Atleta atleta1 = new Atleta("Juan", 25);
		Atleta atleta2 = new Atleta("Pedro", 30);
		Carrera carrera1 = new Carrera("Maratón");
		Carrera carrera2 = new Carrera("Carrera de 10km");
		atleta1.agregarResultado(carrera1, 120); // Juan tardó 120 minutos en la maratón
		atleta2.agregarResultado(carrera1, 130); // Pedro tardó 130 minutos en la maratón
		atleta1.agregarResultado(carrera2, 40); // Juan tardó 40 minutos en la carrera de 10km
		atleta2.agregarResultado(carrera2, 45); // Pedro tardó 45 minutos en la carrera de 10km

		// obtener información de las asociaciones
		System.out.println("Información de las asociaciones del atleta Juan:");
		ArrayList<Resultado> resultadosJuan = atleta1.getResultados();
		for (Resultado resultado : resultadosJuan) {
			System.out.println(
					"Carrera: " + resultado.getCarrera().getNombre() + ", Resultado: " + resultado.getResultado());
		}

		System.out.println("Información de las asociaciones de la carrera Maratón:");
		ArrayList<Resultado> resultadoMaraton = carrera1.getResultados();
		for (Resultado resultado : resultadoMaraton) {
			System.out.println(
					"Atleta: " + resultado.getAtleta().getNombre() + ", Resultado: " + resultado.getResultado());
		}

	}

}
