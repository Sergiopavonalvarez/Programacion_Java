package TAREA_POO_04_ASPIRINA;

public class Humano {

    private String nom;
    private String peso;
    private String est;
    private boolean aspirina;
    private String txt;
    int euro;
    int coste;
    int devolver;

    public Humano(String nom, String peso, String est) {

	this.nom = nom;
	this.peso = peso;
	this.est = est;

    }

    public String getFarma() {

	return nom + peso + est;
    }

    public String getHijo() {

	return nom + peso + est;
    }

    public String getMama() {

	return nom + peso + est;
    }

    public String getAspirina(String txt) {

	this.txt = txt;

	if (txt.equalsIgnoreCase("SI")) {
	    return "Vale hijo, acercamela por favor";

	} else {
	    return "Voy a ir a por ella a la farmacia, dame dinero";
	}
    }

    public String getDinero(int euro) {

	return "Pues no se, dame " + euro + "€";

    }

}
