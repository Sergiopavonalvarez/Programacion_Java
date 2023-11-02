package POO_Libro;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pagina s=new Pagina();
		s.setNum();
		Libro l=new Libro("sddsd", 33232320, "dsdsd", 3443);
		int cantidad=0;
		
		while(cantidad<3){
			cantidad++;
			String texto=sc.nextLine();
			l.añadirpaginas(texto);
			
		}
		
		System.out.println(l);
	

	}

}
