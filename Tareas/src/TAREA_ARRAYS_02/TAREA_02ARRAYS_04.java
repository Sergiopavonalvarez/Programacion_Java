package TAREA_ARRAYS_02;

/*
 * @author: Oscar.S
 * Ejercicio4 - Tarea2
 */

import java.util.Scanner;

class TAREA_02ARRAYS_04 {
	public static int countClumps(int[] nums) {
/// {Write you code here
/// }   

		// la variable grupo se encarga de contar el número de grupos encontrados en la
		// matriz, un ejemplo del resultado esta en las ultimas lineas del codigo.
		int grupo = 0;
		boolean clups = false;
		int i = 0;
		while (i < nums.length - 1) {
			if (nums[i] == nums[i + 1] && clups == false) {
				grupo++;
				clups = true;
			} else if (nums[i] == nums[i + 1]) {
				clups = true;
			} else {
				clups = false;
			}
			i++;
		}
		return grupo;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("Enter values into the array:");
		for (int i = 0; i < nums.length; i++)
			nums[i] = scanner.nextInt();
		System.out.println("Clumps:" + countClumps(nums));
	}
}

// 	EJEMPLO:

//	Enter values into the array:
//	1
//	1
//	2
//	2
//	3
//	Clumps:2

// Podemos ver que los grupos 1,1 y 2,2 , el 3 no tiene grupo 
