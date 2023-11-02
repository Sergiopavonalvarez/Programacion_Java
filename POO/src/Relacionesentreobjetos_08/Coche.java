package Relacionesentreobjetos_08;

public class Coche {

	@Override
	public String toString() {
		return "Coche [cilindrada=" + cilindrada + ", color=" + color + ", precio=" + precio + ", isArrancado="
				+ isArrancado + ", propietario=" + propietario + "]";
	}

	Integer cilindrada;
	String color;
	Double precio;
	boolean isArrancado;
	private Persona propietario;

	public void arrancar() {
		if (isArrancado != true) {
			isArrancado = true;
			System.out.println("¡¡Brrrrrrr!!! El coche acaba de arrancar.");
		} else {
			System.out.println("¡¡¡Kisch, kishch!!! El coche ya esta arrancado.");
		}
	}

	public Coche(Integer cilindrada, String color, Double precio, boolean isArrancado, Persona propietario) {
		this.cilindrada = cilindrada;
		this.color = color;
		this.precio = precio;
		this.isArrancado = isArrancado;
		this.propietario = propietario;
	}

	public void verCoche() {
		System.out.println("Este coche es de color " + color + " tiene una cilindrada de " + cilindrada + " y cuesta "
				+ precio + " euros.");
		if (isArrancado == true) {
			System.out.println("Ahora mismo esta arrancado.");
		} if (isArrancado==false){
			System.out.println("Ahora mismo esta parado.");
		}
	}


}