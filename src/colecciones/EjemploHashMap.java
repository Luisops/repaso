package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EjemploHashMap {

	public static void main(String[] args) {
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("luchito", "usuario de instagram");
		diccionario.put("java", "lenguaje de programación");
		diccionario.put(null, "Representa la ausencia de un objeto");
		diccionario.put("java", "es un lenaguje de programación para desarrollar aplicaciones web y movil");
		
		System.out.println(diccionario);
		
		for(String llave : diccionario.keySet()){
			System.out.println(llave + " = " + diccionario.get(llave));
		}
		
		for( Entry<String, String> entry: diccionario.entrySet()){
			System.out.println(entry.getKey()+" = "+ entry.getValue());
		}
	}
}
