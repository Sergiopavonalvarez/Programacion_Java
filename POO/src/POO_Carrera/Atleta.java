package POO_Carrera;

public class Atleta {
	
	String nombre;
	long nacimiento;
	Resultado resultado;
	
	
	
	


	public Atleta(String nombre, long nacimiento, Resultado resultado) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.resultado = resultado;
	
	}
	public String getNombre() {
		return nombre;
	}
	public long getNacimiento() {
		return nacimiento;
	}
	
	public Resultado getresultad() {
		
		return resultado;
		
	}
	

	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", nacimiento=" + nacimiento + ", resultado=" + resultado + 
				 "]";
	}

}
