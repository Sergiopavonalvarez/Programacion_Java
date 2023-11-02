package TAREA_ASOCIACIONES_01_01;

/**
 * @author Sergio Pavon Alvarez
 */
public class Casa {

	@Override
	public String toString() {
		return "Superficie de la casa= " + superficie + " metros , la direccion es " + direccion + salonCasa
				+ tipoCocina;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setSalonCasa(Salon salonCasa) {
		this.salonCasa = salonCasa;
	}

	public void setTipoCocina(Cocina tipoCocina) {
		this.tipoCocina = tipoCocina;
	}

	private double superficie;
	private String direccion;
	private Salon salonCasa;
	private Cocina tipoCocina;

	public Casa(double superficie, String direccion, Salon salonCasa, Cocina tipoCocina) {

	}

}
