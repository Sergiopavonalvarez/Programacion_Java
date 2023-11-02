package TAREA_HERENCIA_04;
import java.util.Iterator;

/**
 * 
 * @author HUGO RISCO
 *@revisor Daniel Guevara
 */

public class Rectangulo implements Figura{
	protected int base;
	protected int altura;
	protected char caracter='*';

	public Rectangulo(int base, int altura, char caracter) {
		this.altura= altura;
		this.base= base;
		this.caracter= caracter;
		
	}
	public String Nombre() {
		return "soy un rectangulo";
	}

	public void Dibujar() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base-1; j++) {
				System.out.print(caracter);
			}
			System.out.println(caracter);
		}
		}
	

	public int Area() {
		return base*altura;
	}

	public void setCaracter(char c) {
		this.caracter=c;
	}

	public char getCaracter() {
		return caracter;
	}
}
