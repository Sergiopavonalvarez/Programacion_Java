package POO_Gastos;

import java.util.ArrayList;
import java.util.Scanner;

public class Articulos {
	
	String nombre;
	int precio=0;
	Scanner sc=new Scanner(System.in);
	
	
	public Articulos() {
		super();
	}
	
	public ArrayList<String> getarticulos(){
		ArrayList <String> articulos=new ArrayList<>();
		System.out.println("introduce cinco articulos");
		for (int i = 0; i < 5; i++) {
			
			articulos.add(sc.nextLine());
		}
		
		return articulos;
		
	}
	
	public void total(){
		ArrayList<Integer>precio=new ArrayList<>();
		int total=0;
		System.out.println("introduce cinco precios");
		for (int i = 0; i < 5; i++) {
			precio.add(sc.nextInt());
			int aux=precio.get(i);
			
			total=total+aux;
		}
		this.precio=total;
		
		
	}

	public int getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Articulos [nombre=" + nombre + "]";
	}

	
	
	
	
	

}
