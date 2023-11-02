package POO_Frecuencia;

import java.util.HashMap;

public class Frecuencia {

	private HashMap<Character, Integer> freq = new HashMap<>();

	public Frecuencia() {

		for (char c = 'A'; c <= 'Z'; c++) {
			this.freq.put(c, 0);

		}

	}

	public void GetFrecuency() {

		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println("Letra -> " + c + ", Valor -> " + freq.get(c));
		}

	}

	public void Frequency(String palabra) {

		for (int i = 0; i < palabra.length(); i++) {
			char c = Character.toUpperCase(palabra.charAt(i));

			freq.put(c, freq.get(c) + 1);

		}

	}

}
