package STRING;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class STRING_10_EMAIL {
	 
	    public static void main(String[] args) {
	 
	        // Patrón para validar el email
	        Pattern pattern = Pattern
	                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	 
	        // El email a validar
	        String email = "info@programacionextrema.com";
	 
	        Matcher mather = pattern.matcher(email);
	 
	        if (mather.find() == true) {
	            System.out.println("El email ingresado es valido.");
	        } else {
	            System.out.println("El email ingresado es invalido.");
	        }
	    
	 
	}

}
