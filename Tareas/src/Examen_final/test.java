package Examen_final;

public class test {

	public static void main(String[] args) {

		Articulo f = new Articulo("colacao");

		Compra d = new Compra(2023, "Mercadona", f);

		gastos h = new gastos("dsds", 2023, d);
		System.out.println(h.calcularGastos());
		System.out.println(h.toString());

	}

}
