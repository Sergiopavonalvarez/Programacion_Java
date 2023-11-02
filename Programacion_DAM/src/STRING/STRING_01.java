package STRING;

import java.util.Scanner;

public class STRING_01 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String input = sc.next();
		// Write your code here
		// End
		String administrador="administrador";
		
		
		if (input.equalsIgnoreCase(administrador)) {
			
			System.out.println("Username acepted");
		}else 
			System.out.println("Username no acepted");
		}

}
