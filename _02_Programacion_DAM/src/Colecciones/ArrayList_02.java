package Colecciones;

import java.util.ArrayList;

public class ArrayList_02 {
    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<String>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        String ultimoElto = miColeccion.get(miColeccion.size() - 1);

        System.out.println("El ultimo elemento es: " + ultimoElto);
    }
}
