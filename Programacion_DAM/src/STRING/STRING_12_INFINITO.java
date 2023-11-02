package STRING;

public class STRING_12_INFINITO {
	
	public static void main(String[] args) {
		double pInfiniteDouble = Double.POSITIVE_INFINITY;
		double nInfiniteDouble = Double.NEGATIVE_INFINITY;
		float pInfiniteFloat = Float.POSITIVE_INFINITY;
		float nInfiniteFloat = Float.NEGATIVE_INFINITY;
		if (Double.MAX_VALUE<pInfiniteDouble)
		System.out.println("Hay un numero mayor");
		if (Double.isInfinite(pInfiniteDouble))
		System.out.println("Es infinito");
		}

}
