package COLECCIONES;

import java.util.LinkedList;

public class PRIORITYQUEUE_01 {
	public static void main(String[] args) {

		// El primer elemento pase a ser el ultimo
		LinkedList<String> miColeccion = new LinkedList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		
		miColeccion.add(miColeccion.poll());
		
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}
