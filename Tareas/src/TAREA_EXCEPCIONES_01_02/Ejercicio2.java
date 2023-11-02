package TAREA_EXCEPCIONES_01_02;

/**
 * 
 * @author Sergio Pavon
 * @Revisor Daniel y Hugo
 */
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {
	String frase;
	char[] ArrayDeChar;

	public Ejercicio2(Object object) {
		// TODO Auto-generated constructor stub
	}

	public void mayusculas(String frase) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce la frase con puntos");
		frase = sc.nextLine();
		// frase=frase.toUpperCase();
		// System.out.println(frase);
		char[] ArrayDeChar = frase.toCharArray();
//		for (int i = 0; i < ArrayDeChar.length; i++) {
//			System.out.print(ArrayDeChar[i]);
//		}
		char a = ArrayDeChar[0];
		a = Character.toUpperCase(a);
		System.out.print(a);
		for (int i = 1; i < ArrayDeChar.length; i++) {
			char c;
			if (ArrayDeChar[i] == '.') {
				if ((ArrayDeChar[i] == '.') && (ArrayDeChar[i + 1] == ' ')) {
					System.out.print(ArrayDeChar[i]);
					System.out.print(ArrayDeChar[i + 1]);
					c = ArrayDeChar[i + 2];
					c = Character.toUpperCase(c);
					System.out.print(c);
					i = i + 3;
				} else {
					System.out.print(ArrayDeChar[i]);
					c = ArrayDeChar[i + 1];
					c = Character.toUpperCase(c);
					System.out.print(c);
					i = i + 2;
				}
			}
			System.out.print(ArrayDeChar[i]);
		}
	}
}