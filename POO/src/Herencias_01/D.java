package Herencias_01;


public class D extends B{


	protected int atributoD;
	
	public void metodoD () {
		System.out.println("Soy D");
	}

	
	public void disparar () {
		
		System.out.println("tirachinas");
	}
	public D(int atributoA) {
		super(atributoA);
		// TODO Auto-generated constructor stub
	}
}
