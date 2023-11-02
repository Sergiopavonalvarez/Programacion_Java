package Vehiculo;

public class moto extends Vehiculo{
	
	boolean sidercar;
	

	public moto(int ruedas, String color) {
		super(ruedas, color);
		// TODO Auto-generated constructor stub
	}



	public boolean isSidercar() {
		return sidercar;
	}

	public void setSidercar(boolean sidercar) {
		this.sidercar = sidercar;
	}



	@Override
	public String toString() {
		return "moto [sidercar=" + sidercar + ", ruedas=" + ruedas + ", color=" + color + "]";
	}
	
	

}
