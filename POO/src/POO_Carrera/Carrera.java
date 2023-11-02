package POO_Carrera;

import java.util.Arrays;

public class Carrera {
	
	int distancia;
	int ronda;
	long fecha;
	Calle calles;
	
	
	


	public Carrera(int distancia, int ronda, long fecha, Calle calles) {
		super();
		this.distancia = distancia;
		this.ronda = ronda;
		this.fecha = fecha;
		this.calles = calles;
	}


	public int getDistancia() {
		return distancia;
	}


	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}


	public int getRonda() {
		return ronda;
	}


	public void setRonda(int ronda) {
		this.ronda = ronda;
	}


	public long getFecha() {
		return fecha;
	}


	public void setFecha(long fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Carrera [distancia=" + distancia + ", ronda=" + ronda + ", fecha=" + fecha + ", calles=" + calles + "]";
	}









	
	

}
