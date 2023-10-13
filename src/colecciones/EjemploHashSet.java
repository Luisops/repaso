package colecciones;

import java.util.HashSet;

public class EjemploHashSet {

	public static void main(String[] args) {
		HashSet<String> nombre = new HashSet<>();
		nombre.add("raidentrance");
		nombre.add("raidentrance");
		nombre.add("devs4js");
		nombre.add(null);
		nombre.add(null);
		System.out.println(nombre );
	}
	
}
