package Arrays;
import java.util.Arrays;
public class Arrays_07 {
    public static void main(String[] args) {

//		copiar un array

        int[] primes = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
        int[] c = new int[primes.length];

        // System.arraycopy(lo que se copia, epieza desde el 1, copia al c, desde la
        // posicion 3 de c, y seis posiciones)
        System.arraycopy(primes, 1, c, 3, 6);
        System.out.println(Arrays.toString(c));

    }
}
