package Colecciones;

import java.util.ArrayList;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<String>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        for (String i : miColeccion) {
            System.out.println(i);
        }
    }
}
