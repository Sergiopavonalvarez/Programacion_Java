package POO_Carrera;

public class Resultado {
	
	double tiempo;
	int posicion;
	
	public Resultado(double tiempo, int posicion) {
		super();
		this.tiempo = tiempo;
		this.posicion = posicion;
	}
	public double getTiempo() {
		return tiempo;
	}
	public int getPosicion() {
		return posicion;
	}
	@Override
	public String toString() {
		return "Resultado [tiempo=" + tiempo + ", posicion=" + posicion + "]";
	}
	
	

}
