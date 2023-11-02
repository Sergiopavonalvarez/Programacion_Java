package EXCEPCIONES;

public class Prueba {

	private void Excepcion() {
		RuntimeException miError = new RuntimeException("Error inventado por mi");
		throw miError;
	}

	public static void main(String[] args) {
		Prueba miPrograma = new Prueba();
		try {
			miPrograma.Excepcion();
		} catch (Exception e) {
			System.out.println("El programa fall� con el mensaje: " + e.getMessage());
		}
		System.out.println("A pesar del error anterior, la ejecuci�n continua");

	}

}

class MiExcepcion extends Prueba {
	public MiExcepcion() { // Constructor por defecto
		super();
	}

	public MiExcepcion(String s) { // Constructor con mensaje
		super();
	}
}