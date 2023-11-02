package TAREA_ASOCIACIONES_02;
/**
 * 
 * @author Sergio Pavon Alvarez
 *
 */

public class Test {
	public static void main(String[] args) {
		CPU micpu = new CPU(5000, "i5");
		Pantalla mipantalla = new Pantalla(4, "Medio");
		Teclado miteclado = new Teclado("Grande", "Inhalambrico");
		Raton miraton = new Raton("Negro", 2);
		Ordenador miordenador = new Ordenador("ASUS", "3 Kilos", micpu, mipantalla, miteclado, miraton);
		System.out.println(miordenador.toString());
	}
}
