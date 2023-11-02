package COLECCIONES;

import java.util.ArrayList;

public class ARRAYLIST_03 {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");

		String Aux = miColeccion.get(1);
		String Aux1 = miColeccion.get(2);
		miColeccion.set(2, Aux);
		miColeccion.set(1, Aux1);

		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}
