package COLECCIONES;

import java.util.Iterator;
import java.util.LinkedList;

public class LINKEDLIST_01 {

	public static void main(String[] args) {
		LinkedList<String> miColeccion = new LinkedList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		miColeccion.add("List");
		String elto;

		// Borrar "List"

		Iterator<String> paseador = miColeccion.iterator();
		while (paseador.hasNext()) {
			elto = paseador.next();
			if (elto.equals("List"))
				paseador.remove();
			else
				System.out.println(elto);
		}
	}
}
