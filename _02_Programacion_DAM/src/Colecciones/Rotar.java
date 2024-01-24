package Colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Rotar {
    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<String>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");
        System.out.println("Lista inicial: ");
        for (String elto : miColeccion) {
            System.out.print(elto + " ");
        }
        System.out.println();
        // Pon tu código aquí
        System.out.println("Lista Final: ");
        for (String elto : miColeccion) {

            Collections.rotate(miColeccion, 3);

            System.out.print(elto + " ");
        }

    }
}
