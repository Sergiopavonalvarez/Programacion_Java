package TAREA_POO_04_BICICLETA;

/*
 * @ Author: Sergio Pavon Alvarez
 */
import java.util.Scanner;

public class Amigos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Humano yo = new Humano(0, 0, null);
		Humano tu = new Humano(0, 0, null);
		System.out.print("Nombre del primer corredor:");
		yo.setNombre(sc.nextLine());
		System.out.print("Nombre del segundo corredor:");
		tu.setNombre(sc.nextLine());
		String montar = "si";
		String continuar = "si";
		Bicicleta mibicicleta = new Bicicleta(0, 0, 0, 0, null);
		Bicicleta tubicicleta = new Bicicleta(0, 0, 0, 0, null);
		System.out.println("Color de bicicleta de " + yo.getNombre() + "?");
		mibicicleta.color = sc.nextLine();
		System.out.println("Color de bicicleta del corredor " + tu.getNombre() + "?");
		tubicicleta.color = sc.nextLine();
		while (continuar.equalsIgnoreCase("si")) {
			System.out.println("Que marcha lleva la bicicleta de " + yo.getNombre());
			mibicicleta.CambiarMarcha(sc.nextInt());
			System.out.println("Que marcha lleva la bicicleta de " + tu.getNombre());
			tubicicleta.CambiarMarcha(sc.nextInt());
			System.out.println("cuanto frena la biciclta de " + yo.getNombre() + "?");
			mibicicleta.frenar = sc.nextInt();
			System.out.println("cuanto frena la bicicleta de " + tu.getNombre() + "?");
			tubicicleta.frenar = sc.nextInt();
			System.out.println("La velocidad actual del corredor de la bicicleta " + mibicicleta.color + " es "
					+ mibicicleta.Frenar() + " y la velocidad del corredor de la bicicleta " + tubicicleta.color
					+ " es " + tubicicleta.Frenar());
			if (mibicicleta.Frenar() > tubicicleta.Frenar()) {
				System.out.println("gana el jugador de la bicicleta " + mibicicleta.color);
			}
			if (tubicicleta.Frenar() > mibicicleta.Frenar()) {
				System.out.println("gana el jugador de la bicicleta " + tubicicleta.color);
			}
			if (tubicicleta.Frenar() == mibicicleta.Frenar()) {
				System.out.println("Vais empate");
			}
			System.out.println("Quereis seguir montando : si/no");
			montar = sc.nextLine();
			continuar = sc.nextLine();
		}
	}
}
