package Ficheros_serializable;
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JCheckBox;
import java.awt.Font;

public class VentanaUsuario extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre, lblApellido, lblFNacimiento;
	private JTextField txtNombre, txtApellido, txtFNacimiento, txtPuntos;
	private JButton btnGuardar;
	private JButton btnCargar;

	public VentanaUsuario() {
		setTitle("Serializaci\u00F3n de objetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 45, 111, 14);
		contentPane.add(lblNombre);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(20, 70, 111, 14);
		contentPane.add(lblApellido);
		
		lblFNacimiento = new JLabel("Fecha Nacimiento:");
		lblFNacimiento.setBounds(20, 97, 111, 14);
		contentPane.add(lblFNacimiento);
		
		JLabel lblPuntos = new JLabel("Puntos:");
		lblPuntos.setBounds(20, 122, 111, 14);
		contentPane.add(lblPuntos);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(141, 42, 260, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(141, 66, 260, 20);
		contentPane.add(txtApellido);
		
		txtFNacimiento = new JTextField();
		txtFNacimiento.setColumns(10);
		txtFNacimiento.setBounds(141, 93, 260, 20);
		contentPane.add(txtFNacimiento);
		
		txtPuntos = new JTextField();
		txtPuntos.setColumns(10);
		txtPuntos.setBounds(141, 118, 260, 20);
		contentPane.add(txtPuntos);
		
		btnGuardar = new JButton("Guardar Fichero");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardarObjeto ();
			}
		});
		btnGuardar.setBounds(20, 170, 189, 23);
		contentPane.add(btnGuardar);
		
		btnCargar = new JButton("Cargar Fichero");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cargarObjeto();		
			}
		});
		btnCargar.setBounds(230, 170, 171, 23);
		contentPane.add(btnCargar);
		
	}
	
	private void guardarObjeto() {
		File rutaProyecto = new File(System.getProperty("user.dir"));
		JFileChooser fc = new JFileChooser(rutaProyecto);
		int seleccion = fc.showSaveDialog(contentPane);
		if (seleccion == JFileChooser.APPROVE_OPTION) {
			File fichero = fc.getSelectedFile();
			try {
				FileOutputStream fos = new FileOutputStream(fichero);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				Usuario miUsuario  = new Usuario (txtNombre.getText(),txtApellido.getText(), new SimpleDateFormat("dd/MM/yyyy").parse(txtFNacimiento.getText()),Integer.parseInt(txtPuntos.getText()));
				oos.writeObject(miUsuario);
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void cargarObjeto() {
		File rutaProyecto = new File(System.getProperty("user.dir"));
		JFileChooser fc = new JFileChooser(rutaProyecto);
		int seleccion = fc.showOpenDialog(contentPane);
		if (seleccion == JFileChooser.APPROVE_OPTION) {
			try {
				File fichero = fc.getSelectedFile();
				FileInputStream fis = new FileInputStream(fichero);
				ObjectInputStream ois = new ObjectInputStream(fis);
				Usuario miUsuario  = (Usuario) ois.readObject();
				txtNombre.setText(miUsuario.getNombre());
				txtApellido.setText(miUsuario.getApellido());
				DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		        String dia = formatter.format(miUsuario.getFechaNacimiento());
				txtFNacimiento.setText(dia);
				txtPuntos.setText(String.valueOf(miUsuario.getPuntos()));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
