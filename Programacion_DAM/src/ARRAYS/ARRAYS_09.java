package ARRAYS;

import java.util.Arrays;

public class ARRAYS_09 {

	public static void main(String[] args) {
		int aux = 0;
		int[] sueldos = { 1200, 750, 820, 550, 490 };
		
		
		System.out.println(Arrays.toString(sueldos));
		for (int f = 0; f < sueldos.length-1; f++) {
			
			for (int i = 0; i < (sueldos.length-1)-f; i++) {
				if (sueldos[i]>sueldos[i+1]) {
					aux = sueldos[i];
					sueldos[i] = sueldos[i + 1];
					sueldos[i + 1] = aux;
			}   
     
}
		}
		
		System.out.println("El array ordenado es: " + Arrays.toString(sueldos));
		System.out.println("El mayor sueldo de todos es: " + sueldos[sueldos.length - 1]);
	}

}
