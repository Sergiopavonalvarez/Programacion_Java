package METODOS;

public class METODOS_01 {
	public static void main(String[] args) {

		numeros sumatorio = new numeros();

		System.out.println(sumatorio.suma());

	}

}

class numeros {

	public int suma() {
		int num1 = 5;
		int num2 = 3;

		return num2 + num1;

	}
}
