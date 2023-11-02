package Clases_Abstractas;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo tr=new Triangulo(4, 8);
		Cuadrado cr=new Cuadrado(2);
		
		
		System.out.println(cr.area());
		
		cr.damenombre();
	
		tr.damenombre();
		tr.area();		
		

	}

}
