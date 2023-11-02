package POO_Libro;

import java.util.ArrayList;

public class Libro {
	
	String titulo;
	long isbn;
	String autor;
	int añoPublicacion;
	ArrayList<Pagina>h=new ArrayList<>();
	public Libro(String titulo, long isbn, String autor, int añoPublicacion) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		;
	}

	
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", añoPublicacion=" + añoPublicacion
				+ ", h=" + h + "]";
	}



	public void añadirpaginas(String contenido) {
		for (Pagina pagina : h) {
			h.add(new Pagina(contenido));
		}
		
	}

	
	
	

}
