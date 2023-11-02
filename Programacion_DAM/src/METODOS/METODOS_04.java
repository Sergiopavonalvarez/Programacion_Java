package METODOS;

public class METODOS_04 {

	private int ruedas;
	private String color;
	private double cilindrada;
	private boolean asientos_cuero;

	public METODOS_04() {

		ruedas = 4;
		color = "verde";
		cilindrada = 1.600;
		asientos_cuero = true;

	}

	public void establece_ruedas(int ruedas_coche) {

		this.ruedas = ruedas_coche;

	}

	public String dime_ruedas() {

		return "las ruedas son " + ruedas;
	}

	public void establece_color(String color_coche) {

		this.color = color_coche;
	}

	public String dime_color() {

		return "el color es " + color;
	}

	public void establece_cilindrada(double cilidrada_coche) {

		this.cilindrada = cilidrada_coche;
	}

	public void establece_asientos(String asientos_coche) {

		if (asientos_coche == "si") {

			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public String dime_cilindrada() {

		return "la cilindrada es " + cilindrada;
	}

	public String dime_asientos() {

		if (asientos_cuero == true) {

			return "tiene asientos de cuero";
		} else {
			return "no tiene asientos de cuero";
		}

	}

	public static void main(String[] args) {

		METODOS_04 renault = new METODOS_04();

		renault.establece_ruedas(10);
		renault.establece_color("marron");
		renault.establece_cilindrada(10.90);
		renault.establece_asientos("no");

		System.out.println(renault.dime_ruedas());
		System.out.println(renault.dime_color());
		System.out.println(renault.dime_cilindrada());
		System.out.println(renault.dime_asientos());

	}

}
