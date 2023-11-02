package TAREA_HERENCIA_02;

/**
 * 
 * @author Sergio Pavon
 * @revisor Miguel Pavon
 *
 */
public class Asalariado {
	private String nombre;
	private long dni;
	private int dias_vacaciones;

	public Asalariado(String nombre, long dni, int dias_vacaciones) {
		this.nombre = nombre;
		this.dni = dni;
		this.dias_vacaciones = dias_vacaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public int getDias_vacaciones() {
		return 30 - dias_vacaciones;
	}

	public void setDias_vacaciones(int dias_vacaciones) {
		this.dias_vacaciones = dias_vacaciones;
	}
}
