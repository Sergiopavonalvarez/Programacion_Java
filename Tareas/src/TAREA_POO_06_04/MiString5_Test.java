package TAREA_POO_06_04;
import java.util.Scanner;
public class MiString5_Test {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		MiString5 scan= new MiString5(entrada.nextLine());
		System.out.println(scan.eliminarEspacios());
	}

}
