package CONDICIONALES;

public class CONDICIONALES_07_NUMEROSMENORESYMAYORES {
	
	private static int comparar (int x, int y) {
		return Integer.compare(x, y);
		}

	public static void main(String[] args) {
		
		int a=100, b=50, c=4, d=90, e=3;
		int maximo=a;
		
		if (comparar(maximo,b)<0)
			maximo=b;
			if (comparar(maximo,c)<0)
			maximo=c;
			if (comparar(maximo,d)<0)
			maximo=d;
			if (comparar(maximo,e)<0)
			maximo=e;
			System.out.println("El mayor numero de la serie es: " + maximo);

	}

}
