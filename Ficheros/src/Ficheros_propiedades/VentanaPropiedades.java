package Ficheros_propiedades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;
import java.util.Date;

import javax.swing.JCheckBox;
import java.awt.Font;

public class VentanaPropiedades extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre, lblRuta, lblPadre;
	private JTextField txtRutaFichero, txtNombre, txtRuta, txtPadre, txtPeso, txtModificado;
	private JCheckBox chckbxLectura, chckbxEscritura;

	public VentanaPropiedades() {
		setTitle("Propiedades de un fichero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		txtRutaFichero = new JTextField();
		txtRutaFichero.setToolTipText("Inserta la ruta del fichero");
		txtRutaFichero.setBounds(141, 11, 260, 20);
		contentPane.add(txtRutaFichero);
		txtRutaFichero.setColumns(10);

		JButton btnSeleccionar = new JButton("Selecciona");
		btnSeleccionar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSeleccionar.setBounds(20, 11, 111, 23);
		contentPane.add(btnSeleccionar);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 45, 59, 14);
		contentPane.add(lblNombre);
		
		lblRuta = new JLabel("Ruta:");
		lblRuta.setBounds(20, 70, 46, 14);
		contentPane.add(lblRuta);
		
		lblPadre = new JLabel("Padre:");
		lblPadre.setBounds(20, 97, 46, 14);
		contentPane.add(lblPadre);
		
		chckbxLectura = new JCheckBox("Lectura");
		chckbxLectura.setEnabled(false);
		chckbxLectura.setBounds(20, 172, 97, 23);
		contentPane.add(chckbxLectura);
		
		chckbxEscritura = new JCheckBox("Escritura");
		chckbxEscritura.setEnabled(false);
		chckbxEscritura.setBounds(20, 198, 97, 23);
		contentPane.add(chckbxEscritura);
		
		JLabel lblModificacion = new JLabel("Modificado:");
		lblModificacion.setBounds(20, 147, 105, 14);
		contentPane.add(lblModificacion);
		
		JLabel lblPeso = new JLabel("Tama\u00F1o:");
		lblPeso.setBounds(20, 122, 59, 14);
		contentPane.add(lblPeso);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setBounds(141, 42, 260, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtRuta = new JTextField();
		txtRuta.setEditable(false);
		txtRuta.setColumns(10);
		txtRuta.setBounds(141, 66, 260, 20);
		contentPane.add(txtRuta);
		
		txtPadre = new JTextField();
		txtPadre.setEditable(false);
		txtPadre.setColumns(10);
		txtPadre.setBounds(141, 93, 260, 20);
		contentPane.add(txtPadre);
		
		txtPeso = new JTextField();
		txtPeso.setEditable(false);
		txtPeso.setColumns(10);
		txtPeso.setBounds(141, 118, 260, 20);
		contentPane.add(txtPeso);
		
		txtModificado = new JTextField();
		txtModificado.setEditable(false);
		txtModificado.setColumns(10);
		txtModificado.setBounds(141, 143, 260, 20);
		contentPane.add(txtModificado);

		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionaFichero();
			}
		});
	}
	
	private void seleccionaFichero () {
		File rutaProyecto = new File (System.getProperty("user.dir") + "/src");
		JFileChooser fc=new JFileChooser(rutaProyecto);
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.java", "java");
		fc.setFileFilter(filtro);
		int seleccion=fc.showOpenDialog(contentPane);
		if(seleccion==JFileChooser.APPROVE_OPTION){
		    File fichero=fc.getSelectedFile();
		    txtRutaFichero.setText(fichero.getAbsolutePath());
		    txtNombre.setText(fichero.getName());
		    txtRuta.setText(fichero.getPath());
		    txtPadre.setText(fichero.getParent());
		    txtPeso.setText(fichero.length() + " bytes");
		    txtModificado.setText(String.valueOf(new Date(fichero.lastModified())));
		    chckbxLectura.setSelected(fichero.canRead());
		    chckbxEscritura.setSelected(fichero.canWrite());
		}
	}
}
