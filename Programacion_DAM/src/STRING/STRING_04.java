package STRING;

import java.util.Scanner;

public class STRING_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the URL :");
		String s = sc.nextLine();
		STRING_04 obj = new STRING_04();
		s = obj.decodeURL(s);
		System.out.print("Decoded URL is :" + s);
	}

	private String decodeURL(String s) {

		s = s.replace(" ", "%20");
		s = s.replace("¿", "%3A");
		s = s.replace(".", "%3D");

		return s;

	}
}
