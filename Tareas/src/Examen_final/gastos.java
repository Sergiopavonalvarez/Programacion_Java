package Examen_final;

public class gastos {

//	Fiesta_en_casa k=new Fiesta_en_casa();
	String mes;
	int año;
	Compra r;

	public gastos(String mes, int año, Compra r) {
		super();
		this.mes = mes;
		this.año = año;
		this.r = r;
	}

	public double calcularGastos() {

		double gastos = 100;

		Compra w = new Compra(2023, "Febrero", null);

		gastos = gastos + w.calcularTicker();

		return gastos;

	}

	@Override
	public String toString() {
		return "gastos [mes=" + mes + ", año=" + año + ", r=" + r + "]";
	}

//	public void a(){
//		System.out.println(k.total);
//	}

//	public static void main(String[] args) {
//		
//		gastos h =new gastos();
//		h.a();
//		
//	}

}
