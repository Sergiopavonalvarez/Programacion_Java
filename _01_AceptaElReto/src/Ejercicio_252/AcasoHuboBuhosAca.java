package Ejercicio_252;

import java.util.Scanner;

public class AcasoHuboBuhosAca {
    public static boolean ingresos(Scanner in) {
        boolean continuar = true;
        String letras = in.nextLine();
        String fin = "XXX";
        if (letras.equals(fin))
            continuar = false;
        else {
            String contador = "NO";
            String sinEspacios = letras.replaceAll("\\s", "");
            StringBuilder cadena = new StringBuilder(letras);
            cadena.reverse();
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == ' ') {
                    cadena.deleteCharAt(i);
                    i--;
                }
            }
            String cadena2 = cadena.toString();
            if (cadena2.equalsIgnoreCase(sinEspacios)) {
                contador = "SI";
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
