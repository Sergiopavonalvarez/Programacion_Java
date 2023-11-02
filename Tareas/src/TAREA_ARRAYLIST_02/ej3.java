package TAREA_ARRAYLIST_02;
import java.io.*;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
/*
 * autor:@Hugo Risco
 * revision:@Sergio Pavón
 */

public class ej3 {



	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		char ch1, ch2;
		System.out.println("Enter a string:");
		String str = br.readLine();
// Create ArrayDeque of Character
		ArrayDeque<Character> dobleCola = new ArrayDeque<Character>();
		for (int i = 0; i < str.length(); i++)
			dobleCola.add(str.charAt(i)) ; 
		System.out.println(str.substring(2) + str.charAt(0) + str.charAt(1));
			

	}

}
