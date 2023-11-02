package TAREA_ASOCIACIONES_01_02;

class Asignatura {
    private String denominacion;
    private double nota;
    private int curso;

    public Asignatura(String denominacion, double nota, int curso) {
        this.denominacion = denominacion;
        this.nota = nota;
        this.curso = curso;
    }

    public String getDenominacion() {
        return this.denominacion;
    }

    public double getNota() {
        return this.nota;
    }

    public int getCurso() {
        return this.curso;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
}
