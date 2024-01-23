package Arrays;

import java.util.Arrays;

public class Arrays_04 {
    public static void main(String a[]) throws Exception {

        // Declaro un vector inicial
        int[] miVector = {11, 80, 66, 8, 9, 9};

        // Ordenación del vector
        Arrays.sort(miVector);

        // Busco un elemento en concreto en un vector ordenado
        System.out.println(Arrays.binarySearch(miVector, 66));

        // Darle la vuelta al Array (manualmente)
        for (int i = 0; i < miVector.length / 2; i++) {
            int temp = miVector[i];
            miVector[i] = miVector[miVector.length - 1 - i];
            miVector[miVector.length - 1 - i] = temp;
        }

        // Imprimir un vector
        System.out.println(Arrays.toString(miVector));
    }
}
