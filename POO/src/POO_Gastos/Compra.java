package POO_Gastos;

public class Compra {

	int fecha;
	String Supermercado;
	Articulos articulos;
	
	

	public Compra() {
		super();
	}

	public Compra(int fecha, String supermercado) {
		super();
		this.fecha = fecha;
		Supermercado = supermercado;
	}

	public int calcularticket() {
		int ticket = 0;
		Articulos a = new Articulos();

		a.total();

		ticket = a.getPrecio();

		System.out.print("ticket: ");
		return ticket;
	}

	@Override
	public String toString() {
		return "Compra [fecha=" + fecha + ", Supermercado=" + Supermercado + ", articulos=" + articulos + "]";
	}
	
	

}
