package CONDICIONALES;

import java.util.Scanner;

public class CONDICIONALES_08_NUMEROMAYOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		
		Scanner sc1= new Scanner (System.in);
		Scanner sc2=new Scanner (System.in);
		System.out.println("introduce un numero");
		a=sc1.nextInt();
		
		System.out.println("introduce otro numero");
		b=sc2.nextInt();
		
		if (a<b) {
			
			System.out.println(a + " es mayor que " + b);
		}else {
			System.out.println(b + "es mayor que " + a);
		}
		

	}

}
