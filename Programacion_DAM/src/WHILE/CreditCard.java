package WHILE;

//TODO: Implement the sumCertainDigits method. 
public class CreditCard {
	private long cardNumber;

	public CreditCard(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public boolean sumCertainDigits() {
		long n = cardNumber;
		int sum = 0;
		int posicion = 0;
		while (n > 0) {
			int digit = (int) (n % 10);
			
			
			if (posicion % 2 == 1) {
				sum = sum + digit;
			}
			
			n = n / 10;
			posicion++;
		}
		//System.out.println(sum);
		return (sum % 10==0);
	}
	
	public static void main(String[] args) {
		CreditCard ejemplo = new CreditCard(1234567812345670L);
		System.out.println(ejemplo.sumCertainDigits());
	}

}