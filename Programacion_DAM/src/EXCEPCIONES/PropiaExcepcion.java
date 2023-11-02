package EXCEPCIONES;

public class PropiaExcepcion {

	static int calcular(String str1, String str2)
			throws ExcepcionIntervalo, NumberFormatException, ArithmeticException {
		int num = Integer.parseInt(str1);
		int den = Integer.parseInt(str2);
		if ((num > 100 || num < -5) || (den > 100 || den < -5)  ) {
			throw new ExcepcionIntervalo("N�meros fuera del intervalo");
		}
		return (num / den);
	}

	public static void main(String[] args) {
		/*
		 *  Hay tres tipos de error: 
		 *  a) Divisi�n entre 0
		 *  b) Caracter no v�lido
		 *  c) N�mero fuera de rango [-5,100]
		 */
		String str1 = "100";
		String str2 = "0";
		String respuesta;
		int cociente;
		try {
			cociente = calcular(str1, str2);
			respuesta = String.valueOf(cociente);
		} catch (NumberFormatException ex) {
			respuesta = "Se han introducido caracteres no num�ricos";
		} catch (ArithmeticException ex) {
			respuesta = "Divisi�n entre cero";
		} catch (ExcepcionIntervalo ex) {
			respuesta = ex.getMessage();
		}
		System.out.println("La respuesta es: " + respuesta);
	}
}

 class ExcepcionIntervalo extends Exception {
	public ExcepcionIntervalo(String msg) {
		super(msg);
	}

}
