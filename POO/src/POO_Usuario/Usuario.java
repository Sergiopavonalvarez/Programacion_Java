package POO_Usuario;

public class Usuario {

	private String Primeras3(String texto) {

		if (texto.length() > 3) {

			return texto.substring(0, 3);
		} else {

			return texto;
		}

	}

	private String aMayusculas(String texto) {

		return texto.toUpperCase();
	}
	
	public String generarUsuario (String [] datos) {
		
	
		
		
		
		datos[1]=aMayusculas(Primeras3(datos[1]));
		datos[2]=aMayusculas(Primeras3(datos[2]));
		datos[0]=aMayusculas(Primeras3(datos[0]));
		
		return datos[1]+datos[2]+datos[0];
				
				

		
		
		
	}

}
