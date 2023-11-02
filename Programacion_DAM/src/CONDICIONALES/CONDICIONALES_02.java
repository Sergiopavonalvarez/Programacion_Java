package CONDICIONALES;

import java.util.Scanner;

public class CONDICIONALES_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Floor: ");
		int floor = in.nextInt();
		int actualFloor;
		if (floor > 13) {
			actualFloor = floor - 2;
		} else {
			actualFloor = floor;
		}
		System.out.println("Actual floor: " + actualFloor);
	}
}
