package Clases_Abstractas;

public class Triangulo extends Figura {
	
	private int base;
	private int altura;
	
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}
	@Override
	public void damenombre() {
		// TODO Auto-generated method stub
		System.out.println("Triangulo");
	}
	
	

}
