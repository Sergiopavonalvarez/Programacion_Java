package COLECCIONES;

import java.util.ArrayList;

public class ARRAYLIST_04 {
	private static Object get;

	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
// Para imprimir la lista tras la rotación, recuerda las operaciones remove y add
// El resultado debería ser: List, Set, SortedSet, Map y Collection

		String Aux = miColeccion.get(0);
		miColeccion.remove(0);
		miColeccion.add(miColeccion.size(),Aux);
		

		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}
