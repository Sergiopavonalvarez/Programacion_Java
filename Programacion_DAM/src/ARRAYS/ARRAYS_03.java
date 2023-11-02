package ARRAYS;

public class ARRAYS_03 {

	public static void main(String[] args) {

		ARRAYS_03 a = new ARRAYS_03();
		System.out.println(a.inReverse(new int[] { 1, 2, 3, 4, }));
	}

	public String inReverse(int[] values) {

		String message = "";

		for (int count = values.length - 1; count >= 0; count--) {

			if (count == values.length - 1) {

				message = message + values[count];

			} else
				message = message + "" + values[count];

		}

		return message;
	}
}
