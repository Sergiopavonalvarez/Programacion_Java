package gui;

public interface Modelo {
	public void setVista(Vista vista);
	public void setDatos(double cantidad, int tiempo, double interes);
	public double getCuota();
}
