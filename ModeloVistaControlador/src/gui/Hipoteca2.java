package gui;

import javax.swing.JFrame;

public final class Hipoteca2 {
	private Hipoteca2(){
		super();
	}
	private void ejecuta(){
		Vista vista = new VistaImpl();
		Modelo modelo = new ModeloImpl();
		Controlador controlador = new ControladorImpl();
		modelo.setVista(vista);
		vista.setControlador(controlador);
		vista.setModelo(modelo);
		controlador.setModelo(modelo);
		controlador.setVista(vista);
		
		JFrame ventana = new JFrame("Calculo de la cuota mensual de una hipoteca");
		ventana.setContentPane(vista.getContenedor());
		ventana.pack();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
	public static void main(String[]args){
		new Hipoteca2().ejecuta();
	}
}
