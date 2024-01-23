package Arrays;
import java.util.Arrays;
public class Arrays_08 {
    public static void main(String[] args) {
        int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
        int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };

        boolean isSort = false;
        // Implementa una forma de saber si el array está ordenado o no

        int aux = listado1[0];

        System.out.println(Arrays.toString(listado1));

        /*
         * ordenar arrays burbuja
         *
         *
         * for (int i = 0; i < listado1.length - 1; i++) {
         *
         *
         * for (int j = 0; j < listado1.length - 1; j++) { if (listado1[j] > listado1[j
         * + 1]) {
         *
         * aux = listado1[j]; listado1[j] = listado1[j + 1]; listado1[j + 1] = aux; }
         *
         * } }isSort = (listado1 != listado2);
         */

        for (int i = 0; i < listado1.length - 1; i++) {
            isSort = listado1[i] < listado1[i + 1];

            if (!isSort) {
                i = listado1.length;
            }
        }

        if (isSort)
            System.out.println("El vector esta ordenado");
        else
            System.out.println("El vector NO esta ordenado");
    }
}
