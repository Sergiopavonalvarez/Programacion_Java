package TAREA_POO_06_03;


/**
 * @author HUGO RISCO 
 * @revisor Daniel Guevara
 */

import java.io.IOException;
import java.util.Scanner;

public class MiString4_Test {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		MiString4 obj = new MiString4(sc);
		obj.colocarMayuscula('a', 'z', sc);
		System.out.println(obj.chain);

	}
}
