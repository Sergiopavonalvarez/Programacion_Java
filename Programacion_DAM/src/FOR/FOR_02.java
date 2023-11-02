package FOR;

public class FOR_02 {

	public static void main(String[] args) {

		int n = 10;
		int n2 = 0;
		int n3 = 1;

		for (int i = 1; i <= n; i++) {

			n2 = n2 + i;
			n3 = n3 * i;

		}

		System.out.println(n2);
		System.out.println(n3);

	}

}
