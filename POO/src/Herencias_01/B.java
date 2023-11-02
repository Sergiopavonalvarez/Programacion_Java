package Herencias_01;

public class B extends A {
	



	protected int atributoB;
	
	
	public void nuevometodo() {
		
		super.metodoA();
	}
	
	public void metodoB () {
		System.out.println("Soy B");
	}
	
	public void disparar () {
		
		System.out.println("pistola");
	}
	public B(int atributoA) {
		super(atributoA);
		// TODO Auto-generated constructor stub
	}

}
