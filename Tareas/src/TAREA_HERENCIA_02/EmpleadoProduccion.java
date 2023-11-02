package TAREA_HERENCIA_02;

/**
 * 
 * @author Sergio Pavon
 * @revisor Miguel Pavon
 *
 */
public class EmpleadoProduccion extends Asalariado {
	private String turno;

	public EmpleadoProduccion(String nombre, long dni, int dias_vacaciones, String turno) {
		super(nombre, dni, dias_vacaciones);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String toString() {
		return "Empleado de Distribucion [turno=" + turno + ", Nombre=" + getNombre() + ", Dni=" + getDni()
				+ ", Dias de vacaciones restantes (en caso negativo se restaran del sueldo)= " + getDias_vacaciones()
				+ "]";
	}
}
