package ARRAYS;

public class ARRAYS_01 {

	public static void main(String[] args) {

		int[] ceros = { 1, 3, 3, 0, 4, 5, 0, 7 };

		ARRAYS_01 a = new ARRAYS_01();
		System.out.println(a.getCount(ceros));

	}

	public int getCount(int[] values) {
		int count = 0;
		for (int current : values) {

			if (current == 0) {
				count++;
			}

		}
		return count;

	}
}
