package TAREA_HERENCIA_04;
/*
 * @autor: Oscar.S
 * @Revisor Quique
 * 
 */
public interface Figura {
	// • Nombre () : String -> Devuelve el nombre de la figura
	String Nombre();

	// • Dibujar () : void -> Pinta en pantalla la figura
	void Dibujar();

	// • Area(): int -> Calcula su área
	int Area();

	// • setCaracter(char c): void-> Cambia el carácter de la figura
	void setCaracter(char c);

	// • getCaracter(): char -> Muestra el carácter de la figura
	char getCaracter();
}
