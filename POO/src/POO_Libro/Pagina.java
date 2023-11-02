package POO_Libro;

import java.util.Arrays;
import java.util.Scanner;

public class Pagina {
	int num;
	String contenido;

	Scanner sc = new Scanner(System.in);
	
	

	public Pagina(String contenido) {
		super();
		this.contenido = contenido;
	}

	public Pagina(int num) {
		super();
		this.num = 3;
		
	}

	public Pagina() {
		
		

	}

	public String getContenido() {
		return contenido;
	}





	public int getNum() {
		return num;
	}

	public void setNum() {

		System.out.println("CUANTAS PAGINAS?");
		this.num = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Pagina [num=" + num + ", contenido=" + contenido + "]";
	}


}
