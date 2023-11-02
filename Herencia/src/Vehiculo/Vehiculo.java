package Vehiculo;

public class Vehiculo {
	
	protected int ruedas;
	protected String color;
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Vehiculo(int ruedas, String color) {
		super();
		this.ruedas = ruedas;
		this.color = color;
	}
	
	

}
