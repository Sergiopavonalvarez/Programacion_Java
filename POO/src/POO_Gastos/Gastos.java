package POO_Gastos;

public class Gastos {
	
	String mes;
	int anno;
	
	Compra compra;
	public Gastos(String mes, int anno, Compra compra) {
		super();
		this.mes = mes;
		this.anno = anno;
		this.compra = compra;
	}
	
	public int calculargastos(){
		
		int gastos=500;
		
		Compra c=new Compra();
		
		int ultimos_gastos=c.calcularticket();
		gastos=gastos+ultimos_gastos;
		
		
		return gastos;
		
		
	}

	@Override
	public String toString() {
		return "Gastos [mes=" + mes + ", anno=" + anno + ", compra=" + compra + "]";
	}
	
	
	

}
