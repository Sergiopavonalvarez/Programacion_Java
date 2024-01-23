package Ejercicio_123;

import java.util.Scanner;

public class ConjugaVerbos {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String verbo;
        String Conjugacion;
        boolean continuar=true;

        while (continuar) {

            verbo = in.next();
            Conjugacion = in.next();

            if (Conjugacion.equals("T")) {

                continuar=false;
            }

            if (Conjugacion.equalsIgnoreCase("A")) {

                int ultimas = verbo.length();
                String terminacion = verbo.substring(ultimas - 2, ultimas);

                if (terminacion.equalsIgnoreCase("er")) {

                    System.out.println("yo " + verbo.substring(0, ultimas - 2) + "o");
                    System.out.println("tu " + verbo.substring(0, ultimas - 2) + "es");
                    System.out.println("el " + verbo.substring(0, ultimas - 2) + "e");
                    System.out.println("nosotros " + verbo.substring(0, ultimas - 2) + "emos");
                    System.out.println("vosotros " + verbo.substring(0, ultimas - 1) + "is");
                    System.out.println("ellos " + verbo.substring(0, ultimas - 1) + "n");
                } else if (terminacion.equalsIgnoreCase("ar")) {

                    System.out.println("yo " + verbo.substring(0, ultimas - 2) + "o");
                    System.out.println("tu " + verbo.substring(0, ultimas - 2) + "as");
                    System.out.println("el " + verbo.substring(0, ultimas - 2) + "a");
                    System.out.println("nosotros " + verbo.substring(0, ultimas - 2) + "amos");
                    System.out.println("vosotros " + verbo.substring(0, ultimas - 1) + "is");
                    System.out.println("ellos " + verbo.substring(0, ultimas - 1) + "n");

                } else if (terminacion.equalsIgnoreCase("ir")) {

                    System.out.println("yo " + verbo.substring(0, ultimas - 2) + "o");
                    System.out.println("tu " + verbo.substring(0, ultimas - 2) + "es");
                    System.out.println("el " + verbo.substring(0, ultimas - 2) + "e");
                    System.out.println("nosotros " + verbo.substring(0, ultimas - 1) + "mos");
                    System.out.println("vosotros " + verbo.substring(0, ultimas - 1) + "s");
                    System.out.println("ellos " + verbo.substring(0, ultimas - 2) + "en");

                }

            }
            if (Conjugacion.equalsIgnoreCase("P")) {

                int ultimas = verbo.length();
                String terminacion = verbo.substring(ultimas - 2, ultimas);

                if (terminacion.equalsIgnoreCase("er")) {

                    System.out.println("yo " + verbo.substring(0, ultimas - 2) + "i");
                    System.out.println("tu " + verbo.substring(0, ultimas - 2) + "iste");
                    System.out.println("el " + verbo.substring(0, ultimas - 2) + "io");
                    System.out.println("nosotros " + verbo.substring(0, ultimas - 2) + "imos");
                    System.out.println("vosotros " + verbo.substring(0, ultimas - 2) + "isteis");
                    System.out.println("ellos " + verbo.substring(0, ultimas - 2) + "ieron");
                } else if (terminacion.equalsIgnoreCase("ar")) {

                    System.out.println("yo " + verbo.substring(0, ultimas - 2) + "e");
                    System.out.println("tu " + verbo.substring(0, ultimas - 1) + "ste");
                    System.out.println("el " + verbo.substring(0, ultimas - 2) + "o");
                    System.out.println("nosotros " + verbo.substring(0, ultimas - 1) + "mos");
                    System.out.println("vosotros " + verbo.substring(0, ultimas - 1) + "steis");
                    System.out.println("ellos " + verbo + "on");

                } else if (terminacion.equalsIgnoreCase("ir")) {

                    System.out.println("yo " + verbo.substring(0, ultimas - 2) + "i");
                    System.out.println("tu " + verbo.substring(0, ultimas - 1) + "ste");
                    System.out.println("el " + verbo.substring(0, ultimas - 1) + "o");
                    System.out.println("nosotros " + verbo.substring(0, ultimas - 1) + "mos");
                    System.out.println("vosotros " + verbo.substring(0, ultimas - 1) + "steis");
                    System.out.println("ellos " + verbo.substring(0, ultimas - 1) + "eron");

                }

            }
            if (Conjugacion.equalsIgnoreCase("F")) {


                int ultimas = verbo.length();
                String terminacion = verbo.substring(ultimas - 2, ultimas);

                if (terminacion.equalsIgnoreCase("er")) {

                    System.out.println("yo " + verbo + "e");
                    System.out.println("tu " + verbo + "as");
                    System.out.println("el " + verbo + "a");
                    System.out.println("nosotros " + verbo + "emos");
                    System.out.println("vosotros " + verbo + "eis");
                    System.out.println("ellos " + verbo + "an");
                }
                if (terminacion.equalsIgnoreCase("ar")) {

                    System.out.println("yo " + verbo + "e");
                    System.out.println("tu " + verbo + "as");
                    System.out.println("el " + verbo + "a");
                    System.out.println("nosotros " + verbo + "emos");
                    System.out.println("vosotros " + verbo + "eis");
                    System.out.println("ellos " + verbo + "an");

                }
                if (terminacion.equalsIgnoreCase("ir")) {

                    System.out.println("yo " + verbo + "e");
                    System.out.println("tu " + verbo + "as");
                    System.out.println("el " + verbo + "a");
                    System.out.println("nosotros " + verbo + "emos");
                    System.out.println("vosotros " + verbo + "eis");
                    System.out.println("ellos " + verbo + "an");

                }

            }
        }

    }




}
