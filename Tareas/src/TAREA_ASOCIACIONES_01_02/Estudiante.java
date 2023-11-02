package TAREA_ASOCIACIONES_01_02;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private double notaMedia;
    private ArrayList<Asignatura> asignaturas;

    public Estudiante(String nombre, String apellidos, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.notaMedia = 0.0;
        this.asignaturas = new ArrayList<Asignatura>();
    }

    public void matricular(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
        this.actualizarNotaMedia();
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + " " + this.apellidos);
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
        System.out.println("Nota Media: " + this.notaMedia);
    }

    private void actualizarNotaMedia() {
        double sumaNotas = 0.0;
        for (Asignatura asignatura : this.asignaturas) {
            sumaNotas += asignatura.getNota();
        }
        this.notaMedia = sumaNotas / this.asignaturas.size();
    }
}