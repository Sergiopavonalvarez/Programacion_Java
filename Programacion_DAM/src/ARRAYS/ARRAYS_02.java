package ARRAYS;

public class ARRAYS_02 {

	public static void main(String[] args) {

		ARRAYS_01 a = new ARRAYS_01();
		System.out.println(a.getCount(new int[] { 0, 3, 3, 0, 4, 5, 6, 7 }));

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
