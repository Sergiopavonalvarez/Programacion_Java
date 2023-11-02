package TAREA_HERENCIA_03;

/**
 * 
 * @author Miguel Pavon
 * @revisor Sergio Pavon
 *
 */

public class test {

	public static void main(String[] args) {
		Coche damcar = new Coche(60, 4, 0);
		damcar.acelerar(100);
		damcar.consumir(20);
		damcar.frenar(40);
		System.out.println("El combustible actual es: " + damcar.getCombustible());
		damcar.acelerar(50);
		damcar.consumir(10);
		damcar.frenar(110);
		damcar.repostar(20);
		System.out.println("el combustible actual es: " + damcar.getCombustible());

	}

}
