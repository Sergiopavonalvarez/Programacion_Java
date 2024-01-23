package Arrays;

public class Arrays_05 {
    public static void main(String[] args) {
        double [][]prices=
                {
                        { 3.979, 4.099 },
                        { 4.199, 4.299 },
                        { 4.599, 4.499 },
                };
//		imprimir numero de filas:
//		System.out.println(prices.length);
//		imprimir numero de columnas:
//		System.out.println(prices[0].length);

        for (int i = 0; i < prices.length; i++) {


            for (int j = 0; j < prices[0].length; j++) {

                System.out.printf("%10.3f", prices[i][j]);
            }

            System.out.println();
        }


    }
}
