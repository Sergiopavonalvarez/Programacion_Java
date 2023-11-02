package TAREA_ASOCIACIONES_01_01;

/**
 * @author Sergio Pavon Alvarez
 */
import java.util.Scanner;

public class Salon {

	public void setNumeroDeTelevisores(int numeroDeTelevisores) {
		this.numeroDeTelevisores = numeroDeTelevisores;
	}

	public void setTipoSalon(String tipoSalon) {
		this.tipoSalon = tipoSalon;
	}

	public String toString() {
		return "\nSalon= tiene " + numeroDeTelevisores + " televisiones, el tipo de salon es " + tipoSalon;
	}

	private int numeroDeTelevisores;
	private String tipoSalon;
	Scanner sc = new Scanner(System.in);

	public Salon(int numeroDeTelevisores, String tipoSalon) {

		numeroDeTelevisores = 0;
		tipoSalon = "desconocido";

		this.numeroDeTelevisores = numeroDeTelevisores;
		this.tipoSalon = tipoSalon;
	}

}
