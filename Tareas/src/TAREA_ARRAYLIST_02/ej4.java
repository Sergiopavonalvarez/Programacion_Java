package TAREA_ARRAYLIST_02;

/*
 * Autor= Sergio Pavon Alvarez
 * Revisado= Hugo Risco
 */

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class ej4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		int rnum = 0;
		String miStr = Integer.toString(num);
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < miStr.length(); i++)
			st.push(miStr.charAt(i));

		String reves = "";

		while (!st.isEmpty()) {

			reves = reves + st.pop().toString();

		}
		rnum = Integer.parseInt(reves);
		System.out.println("El numero del reves es: " + rnum);
	}
}
