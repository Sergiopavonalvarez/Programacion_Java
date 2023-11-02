/**
 * @author Daniel E. Guevara
 */
package TAREA_ARRAYS_03;

import java.util.Scanner;


public class TAREA_03_ARRAYS_05 {



	 public static void main(String[] args) {
	  // creamos un escaner para pedir el texto
	  Scanner entrada = new Scanner(System.in);
	  String cadena = entrada.nextLine();
	  // en caso de que la primera letra fuera una T mayuscula no me la leeria al
	  // pasarla a caracter debido a que ya no es lo mismo "t" que "T", por ende y por
	  // si acaso pongo todas las letras en minusculas y me olvido de ese problema
	  cadena = cadena.toLowerCase();
	  // creamos el arrays donde se van a guardar los caracteres que buscamos
	  char[] texto = { 't', 'e', 'o', 'd', 'i', 'o' };
	  // luego voy a crear un booleno de cada letra para que una vez la encuentre en
	  // el if, pase a ser true, para de este modo pasar a la siguiente letra
	  boolean hayT = false;
	  boolean hayE = false;
	  boolean hayO = false;
	  boolean hayD = false;
	  boolean hayI = false;
	  boolean hayOxigeno = false;
	  // oxigeno porque o2 es oxigeno y de ahi salio el nombre
	  // la cabeza empezamos con el codigo para repasar la cadena de caracteres
	  // primero pasamos de string a carcateres
	  for (char letra : cadena.toCharArray()) {
	   for (int i = 0; i < texto.length; i++) {
	    if (letra == texto[0]) {
	     hayT = true;
	    }
	    if (hayT && letra == texto[1]) {
	     hayE = true;
	    }
	    if (hayE && letra == texto[2]) {
	     hayO = true;
	    }
	    if (hayO && letra == texto[3]) {
	     hayD = true;
	    }
	    if (hayD && letra == texto[4]) {
	     hayI = true;
	    }
	    if (hayI && letra == texto[5]) {
	     hayOxigeno = true;
	    }
	   }
	  }
	  if (hayOxigeno) {
	   System.out.println("SI");
	  } else
	   System.out.println("NO");
	 }
	}