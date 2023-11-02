package MAP;

import java.util.HashMap;
import java.util.Map.Entry;

public class MAP_01 {
	public static void main(String[] args) {
		HashMap<String, Integer> notas = new HashMap<String, Integer>();
		notas.put("Antonio", 7);
		notas.put("Pedro", 9);
		notas.put("Luis", 10);
		notas.put("Marco", 7);
		notas.put("María", 4);
		notas.put("Ana", 10);
// Obtener la nota de Pedro con get
		System.out.println(notas.get("Antonio"));
// Preguntar si el alumno María está en lista
		System.out.println(notas.containsKey("María"));
// Sacar la nota media de la clase
		Double media = 0.0;
		for (Entry<String, Integer> entry : notas.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			media = media + val;
		}
		System.out.println(media / notas.size());
// Listado de todos los alumnos -> Alumno: Nota
		for (Entry<String, Integer> entry : notas.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " : " + val);
		}
	}
}
