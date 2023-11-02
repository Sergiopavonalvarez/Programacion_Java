package TAREA_POO_06_01;

import java.util.Scanner;
/**
 * 
 * @author Quique Huerta
 * @Revisor Hugo Risco
 *
 */
public class MiString2 {

    public String chain;

    public int contarCaracter(char caracter) {

        int contador = 0;
        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;

    }

    public MiString2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime una frase");
        chain = in.nextLine();
    }

}
