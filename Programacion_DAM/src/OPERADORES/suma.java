package OPERADORES;

public class suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=365;
		int sum=0;
		while (n>0) {
			
			
			int digit=n%10;
		
			sum=sum+digit;
			n=n/100;
			
		}
		
		System.out.println(sum);

	}

}
