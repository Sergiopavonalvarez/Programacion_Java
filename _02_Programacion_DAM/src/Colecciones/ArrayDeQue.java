package Colecciones;

import java.util.ArrayDeque;

public class ArrayDeQue {
    public static void main(String[] args) {
        int[] ListadoInicial = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayDeque<Integer> ListadoFinal = new ArrayDeque<Integer>();
        for (Integer elto : ListadoInicial) {
            if (elto  %2!=0) {

                ListadoFinal.addLast(elto);

            }else {
                ListadoFinal.addFirst(elto);
            }



        }
        System.out.println("Resultado Final:");
        for (Integer elto : ListadoFinal) {
            System.out.print(elto + " ");
        }
    }
}
