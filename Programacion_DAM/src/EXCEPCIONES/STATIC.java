package EXCEPCIONES;

public class STATIC {
	private int dato = 0;
	private static int datoStatic = 0;

	public void metodo() {
		STATIC.datoStatic++;
	}

	public static void metodoStatic() {
		//this.datoStatic++; // Esto da error al compilar (regla 1, los metodos static no tienen referencia this.)
		datoStatic++; // Esta es correcta
	}

	public static void main(String[] args) {
		//dato++; // Esto da error al compilar (regla 2, da error al no ser static)
		datoStatic++; // Esto es correcta
		//metodo(); // Esto da error al compilar (regla 2, metodo no es static)
		metodoStatic(); // Esto es correcta
	}
}
