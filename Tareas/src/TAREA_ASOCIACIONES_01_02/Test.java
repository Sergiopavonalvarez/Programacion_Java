package TAREA_ASOCIACIONES_01_02;
/**
 * @author Daniel Guevara
 * @revisor Hugo Risco
 */
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nombre del estudiande: ");
		String nombre = sc.nextLine();

		System.out.print("Apellidos del estudiante: ");
		String apellidos = sc.nextLine();

		 String fechaNacimiento = "";
	        boolean fechaValida = false;
	        while (!fechaValida) {
	            System.out.print("Fecha de nacimiento del estudiante (con formato: dd/mm/aaaa): ");
	            fechaNacimiento = sc.nextLine();
	            try {
	                // Verificar si la fecha contiene sólo números
	                Long.parseLong(fechaNacimiento.replace("/", ""));
	                fechaValida = true;
	            } catch (NumberFormatException e) {
	                System.out.println("Error: Solo se pueden introducir números con este formato dd/mm/aaaa");
	            }
	        }

		Estudiante estudiante = new Estudiante(nombre, apellidos, fechaNacimiento);

		System.out.print("Cuantas asignaturas va a matricular: ");
		int cantidadAsignaturas = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= cantidadAsignaturas; i++) {
			System.out.print("Nombre de la asignatura " + i + ": ");
			String denominacion = sc.nextLine();

			double nota = 0;
			boolean notaValida = false;
			while (!notaValida) {
				try {
					System.out.print("Nota de la asignatura " + i + ": ");
					nota = Double.parseDouble(sc.nextLine());
					notaValida = true;
				} catch (NumberFormatException e) {
					System.out.println("No ha introducido un número, por favor inténtelo de nuevo.");
				}
			}

			estudiante.mostrarDatos();
		}
	}
}