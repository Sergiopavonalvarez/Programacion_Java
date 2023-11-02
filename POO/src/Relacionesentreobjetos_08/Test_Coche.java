package Relacionesentreobjetos_08;

public class Test_Coche {
	
	public static void main(String[] args) {
		
		Persona yo= new Persona();
		
		yo.Nombre();
		yo.Apellidos();
		yo.Carnet();
		
		System.out.println(yo.toString());
		
		Coche bmw=new Coche(5000, "rojo", 5.000, false, yo);
		Coche mercedes=new Coche (100, "verde", 6.00, true, yo);
		
		bmw.arrancar();
		mercedes.arrancar();
		bmw.verCoche();
		mercedes.arrancar();
		mercedes.verCoche();
		
	}

}
