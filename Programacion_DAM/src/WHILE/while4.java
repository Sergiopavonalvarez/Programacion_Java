package WHILE;

import java.util.Scanner;

public class while4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count=0;
		int countpar=0;
		int countimpar=0;
		int n;
		
	do {
		n = scan.nextInt();
		count++;
		if (n%2==0) {
			
			countpar++;
		} else 
			countimpar++;
		
	} while (count<5);
System.out.println("hay " + countpar + " numeros pares y " + countimpar + " numeros impares");
	}

}
