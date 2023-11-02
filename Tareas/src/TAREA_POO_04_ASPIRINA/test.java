package TAREA_POO_04_ASPIRINA;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Humano farma = new Humano("Pepa, ", "50kg, ", "172cm.");
	Humano mama = new Humano("Josefa, ", "80kg, ", "160cm.");
	Humano hijo = new Humano("Pepito, ", "30kg, ", "131cm.");
	boolean continuar = true;
	int euro;
	System.out.println("Quieres saber los datos de los integrantes de la historia?  SI/NO ");
	String entrada = sc.nextLine();

	while (entrada.equalsIgnoreCase("SI") && continuar) {

	    System.out.println("De quien lo quieres saber? farmaceutica/hijo/madre ");
	    entrada = sc.nextLine();

	    switch (entrada) {

	    case "farmaceutica": {
		System.out.println(farma.getFarma());
		System.out.println("Quieres saber mas datos? Si/NO");
		entrada = sc.nextLine();
		if (entrada.equalsIgnoreCase("No")) {
		    continuar = false;
		}
		break;
	    }
	    case "hijo": {
		System.out.println(hijo.getHijo());
		System.out.println("Quieres saber mas datos? Si/NO");
		entrada = sc.nextLine();
		if (entrada.equalsIgnoreCase("No")) {
		    continuar = false;

		}
		break;
	    }

	    case "madre": {
		System.out.println(mama.getMama());
		System.out.println("Quieres saber mas datos? Si/NO");
		entrada = sc.nextLine();
		if (entrada.equalsIgnoreCase("No")) {
		    continuar = false;

		}
		break;
	    }

	    }

	}
	System.out
		.println("vale, empezamos la historia; un domingo por la tarde estoy en casa viendo la televisión, y");
	System.out.println(
		"de repente mi madre siente un fuerte dolor de cabeza; como es natural, lo primero que hago es ");
	System.out.println("tratar de encontrar una caja de aspirinas. ");
	System.out.println();

	System.out.println("Madre: UUf hijo como me duele la cabeza hay aspirinas? SI/NO");
	String txt = sc.nextLine();
	System.out.println(hijo.getAspirina(txt));
	System.out.println("Madre: Cuanto necesitas? ");
	System.out.print("(Mete el importe a pedir) ");
	System.out.println(hijo.getDinero(sc.nextInt()));
	System.out.println("El hijo se va al a farmacia y tras 20 minutos de camino por fin consigue llegar y ");
	System.out.println("establece conversacion con la farmacuetica ");
	System.out.println("Hijo: Hola, dame una caja de aspirinas por favor");
	System.out.println("Farmaceutica: Si, voy dame un segundito");
	System.out.println("Hijo: Cuanto cuestan? ");
	System.out.print("Farmaceutica: Pues serian (mete el importe) ");

	System.out.println("Hijo: vale, perfecto toma ");
	System.out.println(
		"El hijo se va a su casa le da las aspirinas a su madre y la madre se empieza a encontrar mejor");
	System.out.println();
	System.out.println("                                           FIN                ");

    }

}
