package TAREA_POO_06_04;

/**
 * 
 * @author Daniel
 * @corrector Sergio Pavon
 */

public class MiString5 {
	
	String chain;
	
	public String eliminarEspacios() {
		return chain.replace(" ","");
	}

	public MiString5(String chain) {
		this.chain = chain;
	}

	
}
