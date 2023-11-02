package TAREA_HERENCIA_03;



/**
 * 
 * @author Miguel Pavon
 * @revisor Sergio Pavon
 *
 */

public class Coche extends Vehiculo {
	int combustible;

	public Coche() {
		this(0, 0, 0);

	}

	public Coche(int combustible, int ruedas, int velocidad) {
		super(ruedas, velocidad);
		this.combustible = 60;
	}

	public void repostar(int mas) {
		combustible += mas;
		if (combustible < 60) {
			System.out.println("se reposto desde la clase hijo " + mas + "L, el deposito tiene " + combustible + "L");
		} else {
			System.out.println("Desde la clase hijo el deposito esta lleno aun");
		}
	}

	public void consumir(int menos) {
		combustible -= menos;
		if (combustible > 0) {
			System.out
					.println("Se consumio desde la clase hijo " + menos + "L" + " y el total es " + combustible + "L");
		} else if (combustible < 0) {
			System.out.println("Te has quedado sin gasolina desde la clase hijo");
			combustible = 0;
		}
	}

	public int getCombustible() {
		System.out.println("clase hijo ========>");
		return combustible;
	}

}
