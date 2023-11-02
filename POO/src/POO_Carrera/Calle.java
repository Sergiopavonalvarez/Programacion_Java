package POO_Carrera;

public class Calle {
	
	int numero;
	Atleta atleta;
	double tiempo;
	public Calle(int numero) {
		super();
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public Atleta getAtleta() {
		return atleta;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	@Override
	public String toString() {
		return "Calle [numero=" + numero + ", atleta=" + atleta + ", tiempo=" + tiempo + "]";
	}
	
	
	
	
	
	
	
	

}
