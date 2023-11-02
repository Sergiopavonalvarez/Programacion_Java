package TAREA_HERENCIA_01;

import java.util.Scanner;

public class PruebaPantalla {
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo tr=new Triangulo(0, "SAS", 'C');
		
		char caracter='D';
		int lado=4;
		
		
		for (int i = lado; i >= 0; i--) {
		    for (int j = 0; j <= i; j++) {
		        if (j < i) {
		            System.out.print(" ");
		        } else {
		        	for (int k = 0; k < lado-j; k++) {
		        		System.out.print("*");
					}
		        }
		    }
		    System.out.println();
		}


	}

}
