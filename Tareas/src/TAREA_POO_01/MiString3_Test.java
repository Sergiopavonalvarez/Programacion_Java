package TAREA_POO_01;

/**
 * @author Sergio Pavon
 * @revisor Enrique Huerta
 */
import java.util.Scanner;

public class MiString3_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra1;
		palabra1 = sc.nextLine();
		MiString ejemplo = new MiString(palabra1);
		System.out.println(ejemplo.palindrome());
	}
}
