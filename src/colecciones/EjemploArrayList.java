package colecciones;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
	
		
	ArrayList<String> array = new ArrayList<>();
		
	array.add("Luis");
	array.add("Marco");
	array.add("Luis");
	array.add("Marco");
	array.add("Luis");
	array.add("Marco");
	array.add("Luis");
	array.add("Marco");
	array.add("Luis");
	array.add("Marco");
	
	array.add(5, "Erick");
	System.out.println(array.size());
	System.out.println(array);
	
	}
}
