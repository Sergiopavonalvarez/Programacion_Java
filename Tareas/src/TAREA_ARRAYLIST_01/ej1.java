package TAREA_ARRAYLIST_01;

/**
 * @author HUGO RISCO
 * @Revision Daniel Guevara
 */
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class ej1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a sentence:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String longestWord = "";

		HashSet<String> words = new HashSet<String>();
		words.addAll(Arrays.asList(s1.split(" ")));
		/// {Enter your code here
		for (String elto : words) {
			if (longestWord.length() <= elto.length()) {
				longestWord = elto;

			}
		}
		/// }
		System.out.println("The longest word in the sentence is:" + longestWord);
	}

}
