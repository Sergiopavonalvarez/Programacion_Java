package FOR;

public class FOR_01_NUMEROPAR {

	public static void main(String[] args) {

		int cont;
		for (cont = 1; cont <= 6; cont++) {

			if (cont % 2 == 0) {

				System.out.println(cont + " sleep");
			} else {

				System.out.println(cont + " eat");

			}
		}

	}

}