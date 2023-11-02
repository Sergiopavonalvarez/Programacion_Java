package TAREA_POO_06_01;

import java.util.Scanner;
/**
 * 
 * @author Quique Huerta
 * @Revisor Hugo Risco
 *
 */

public class MiString2_Test {
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    


    MiString2 miString = new MiString2();

    System.out.println("Dime un carácter a buscar:");
    char caracter = in.nextLine().charAt(0);

    int resultado = miString.contarCaracter(caracter);
    System.out.println("El carácter '" + caracter + "' aparece " + resultado + " veces en la cadena '" + miString.chain + "'");
}

}
