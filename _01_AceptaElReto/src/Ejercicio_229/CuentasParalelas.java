package Ejercicio_229;

import java.util.Scanner;

public class CuentasParalelas {

    public static boolean ingresos(Scanner in) {
        boolean continuar = true;
        int cantidad = in.nextInt();
        if (cantidad == 0)
            continuar = false;
        else {
            int resultado = 0;
            int resultado1 = 0;
            int contador = 0;
            int[] ingresos = new int[cantidad];
            for (int i = 0; i < ingresos.length; i++) {
                ingresos[i] = in.nextInt();
                resultado = resultado + ingresos[i];
            }
            resultado1 = contador = 0;
            if (resultado == resultado1) {
                contador++;
            }
            for (int i = 0; i < ingresos.length; i++) {
                resultado = resultado - ingresos[i];
                resultado1 = resultado1 + ingresos[i];
                if (resultado == resultado1) {
                    contador++;
                }
            }
            System.out.println(contador);
        }
        return continuar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (ingresos(in));
    }
}
