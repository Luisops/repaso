package colecciones;

import java.util.TreeMap;

public class EjemploTreeMap {
	
	public static void main(String[] args) {
		TreeMap<String, String> map= new TreeMap<>();
		map.put("Luis", "futbolista profesional");
		map.put("Juan", "Programador Profesional");
		map.put("Carlos", "analista de negocios");
		
		System.out.println(map);
	}
}
