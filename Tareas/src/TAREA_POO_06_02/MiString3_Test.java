package TAREA_POO_06_02;

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
		MiString3 ejemplo = new MiString3(palabra1);
		if(ejemplo.palindrome()) {
		System.out.println("La cadena es Palindromo");
		}else {
			System.out.println("La cadena NO es Palindromo");
		}//asi queda mas bonito
	}
}
