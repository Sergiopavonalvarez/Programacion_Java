package STRING;

import java.util.StringTokenizer;

public class STRING_08_STRINGTOKENIZER {

	public static void main(String[] args) {

		StringTokenizer str;
		str = new StringTokenizer("Uno dos tres perico de los palotes", "e|");
	
		System.out.println("la cadena str tiene " + str.countTokens() + " elementos");
		while (str.hasMoreTokens())
			System.out.println(str.nextToken());
	}
}
