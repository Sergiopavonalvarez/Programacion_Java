package SWITCH;

import java.util.Scanner;

// @Quique Huerta

public class ej4 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String palabras = in.nextLine();
	    String[] arrayPalabras = palabras.split(" ");
	    String cad1 = "";
	    String cad2 = "";
	    boolean cadena = true;

	    for (int i = 0; i < arrayPalabras.length-1; i++) {

	        cad1 = arrayPalabras[i].substring(arrayPalabras[i].length() - 2);
	        cad2 = arrayPalabras[i + 1].substring(0, 2);
	        if (!cad1.equals(cad2)) {
	            cadena = false;
	            break;
	        } 
	    }
	    if (cadena)
	        System.out.println("SI");
	    else
	        System.out.println("NO");
	    in.close();
	}
	}