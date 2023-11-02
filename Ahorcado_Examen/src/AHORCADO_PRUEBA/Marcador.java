package AHORCADO_PRUEBA;

import java.util.ArrayList;

public class Marcador {
	private int numAciertos, numFallos, intentos, puntos;
	private ArrayList<Character> listaAciertos, listaFallos;

	/**
	 * Constructor que inicializa el juego del ahorcado
	 * 
	 * @param intentos n�mero de fallos permitidos para adivinar la palabra
	 */
	public Marcador(int intentos) {
		this.numAciertos = 0;
		this.numFallos = 0;
		this.intentos = intentos;
		this.puntos = 0;
		listaAciertos = new ArrayList<Character>();
		listaFallos = new ArrayList<Character>();
	}

	/**
	 * M�todo de tipo set que actualiza la puntuaci�n del marcador con la f�rmula: 5
	 * puntos por cada acierto y 1 punto menos por cada fallo
	 */
	private void actualizar() {
		// IMPLEMENTAR;
		this.numAciertos = this.numAciertos + 5;
		this.numFallos = this.numFallos - 1;
	}

	/**
	 * M�todo que sirve para indicarle al jugador qu� letras ha acertado y qu�
	 * letras ha fallado Cada una de ellas s�lo se imprime en caso de que haya
	 * elementos dentro. La sintaxis es la siguiente: -> Letras acertadas: A B C...
	 * en caso de que el jugador haya indicado esas letras y se encuentren en la
	 * palabra -> Letras falladas: X Y Z... en caso de que el jugador haya indicado
	 * esas letras y se NO encuentren en la palabra
	 */
	private void mostrarAciertoyFallos() {
		// IMPLEMENTAR
		if (!listaAciertos.isEmpty()) {
			System.out.print("LETRAS ACERTADAS--->");
			for (int i = 0; i < listaAciertos.size(); i++) {
				System.out.print(listaAciertos.get(i) + " ");
			}
			System.out.println();
		}

		if (!listaFallos.isEmpty()) {
			System.out.print("LETRAS FALLADAS--->");
			for (int i = 0; i < listaFallos.size(); i++) {
				System.out.print(listaFallos.get(i) + " ");
			}
			System.out.println();
		}

	}

	/**
	 * M�todo que dibuja el Marcador, que incluye los aciertos y fallos (en caso de
	 * que existan), el n�mero de intentos que quedan con la siguiente sintaxis: ->
	 * Intentos restantes = X, siendo X el n�mero de intentos (posibles fallos) que
	 * quedan y los puntos, con la siguiente sintaxis: -> PUNTOS = Y, siendo Y el
	 * n�mero total de puntos
	 */
	public void mostrarMarcador() {
		// IMPLEMENTAR

		int intentos_res = intentos - numFallos;
		mostrarAciertoyFallos();
		int marcador = numAciertos - numFallos;
		System.out.println("--->PUNTOS= " + marcador);
		System.out.println("--->Intentos= " + intentos_res);

	}

	/**
	 * M�todo que incrementa el n�mero de aciertos, actualiza los puntos y a�ade la
	 * letra a la lista de Aciertos
	 * 
	 * @param letra que ha introducido el jugador
	 * @see listaAciertos
	 * @see actualizar()
	 */
	public void acertar(char letra) {
		// IMPLEMENTAR

		numAciertos++;
		puntos++;
		listaAciertos.add(letra);

	}

	/**
	 * M�todo que incrementa el n�mero de fallos, disminuye el n�mero de intentos,
	 * actualiza los puntos y a�ade la letra a la lista de Fallos
	 * 
	 * @param letra que ha introducido el jugador
	 * @see listaFallos
	 * @see actualizar()
	 */
	public void fallar(char letra) {
		// IMPLEMENTAR

		numAciertos--;
		intentos--;
		puntos = puntos;
		listaFallos.add(letra);

	}

	/**
	 * M�todo que sirve para saber si el juego se ha terminado por haber agotado el
	 * n�mero de intentos disponibles
	 * 
	 * @return true cuando se han agotado el n�mero de intentos posibles (es igual a
	 *         cero)
	 */
	public boolean finJuego() {
		// IMPLEMENTAR
		boolean fin = false;
		if (intentos == 0) {
			fin = true;
		}

		return fin;
	}
}
