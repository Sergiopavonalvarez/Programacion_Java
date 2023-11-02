package TAREA_HERENCIA_02;

/**
 * 
 * @author Sergio Pavon
 * @revisor Miguel Pavon
 *
 */
public class EmpleadoDistribucion extends Asalariado {

	private String zona;

	public EmpleadoDistribucion(String nombre, long dni, int dias_vacaciones, String zona) {
		super(nombre, dni, dias_vacaciones);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String toString() {
		return "Empleado de produccion [zona=" + zona + ", Nombre=" + getNombre() + ", Dni=" + getDni()
				+ ", dias restantes de vacaciones (en caso negativo se restaran del sueldo)= " + getDias_vacaciones()
				+ "]";
	}

}
