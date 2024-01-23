package Ejercicio_157;

import java.util.Scanner;

public class CuantosDiasFaltan {
    public static void casoDePrueba(Scanner in) {
        int DaysMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int day = in.nextInt();
        int month = 0;
        month = in.nextInt();
        int total = 0;
        for (int i = month; month < DaysMonth.length; month++) {
            total = total + DaysMonth[month];
        }
        total = total - day;
        System.out.println(total);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numCasos = Integer.parseInt(in.nextLine());
        for (int i = 0; i < numCasos; i++)
            casoDePrueba(in);
    }
}
