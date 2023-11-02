package POO_Gastos;

public class Test {

	public static void main(String[] args) {
		
		
		Articulos h=new Articulos();
		h.getarticulos();
		Compra l=new Compra(2023, "Mercadona");
	
	
		Gastos g=new Gastos("Febrero", 2023, l);
		System.out.println("Gastos totales= "+g.calculargastos());
		System.out.println(g.toString());
		

	}

}
