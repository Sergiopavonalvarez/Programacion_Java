package TAREA_ASOCIACIONES_01_01;

/**
 * @author Sergio Pavon Alvarez
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Salon miSalon = new Salon(0, null);

		System.out.println("numero de televisores: ");

		miSalon.setNumeroDeTelevisores(sc.nextInt());

		System.out.println("Salon vanguardista o diafano?");

		miSalon.setTipoSalon(sc.next());

		Cocina miCocina = new Cocina(true, 0);

		System.out.println("La cocina es independiente: true o false?");

		miCocina.setEsIndependiente(sc.nextBoolean());

		System.out.println("Dime el numero de fuegos");
		miCocina.setNumeroDeFuegos(sc.nextInt());

		Casa miCasa = new Casa(20.5, "Calle Orquidea. Numero 14. Villaviciosa de Odon ", miSalon, miCocina);

		System.out.println(miCasa.toString());

	}

}
