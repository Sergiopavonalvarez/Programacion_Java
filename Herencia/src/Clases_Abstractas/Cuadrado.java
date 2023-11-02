package Clases_Abstractas;

public class Cuadrado extends Figura{
	
	private int base;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*base;
	}

	public Cuadrado(int base) {
		this.base = base;
	}

	@Override
	public void damenombre() {
		// TODO Auto-generated method stub
		System.out.println("Cuadrado");
	}

}
