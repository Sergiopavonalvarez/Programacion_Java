package ARRAYS;

public class ARRAYS_06 {

	public static void main(String[] args) {

		int[] primes = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		int[] backup;

		// clonar con el metodo .clone()

		backup = primes.clone();
		backup[0] = 0;
		System.out.println("Primes: ");
		for (int i = 0; i < primes.length; i++)
			System.out.print(" " + primes[i]);
		System.out.println("\nbackup: With first Element Modified");
		for (int j = 0; j < backup.length; j++)
			System.out.print(" " + backup[j]);
	}
}
