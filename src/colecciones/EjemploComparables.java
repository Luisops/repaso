package colecciones;

import java.util.TreeSet;

class Perro implements Comparable<Perro>{
	private String nombre;

	public Perro(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Perro o) {
		
		//return nombre.compareTo(o.getNombre()); 
		return o.getNombre().compareTo(nombre);
	}
}

public class EjemploComparables {

	public static void main(String[] args) {
		
		TreeSet<Perro> set = new TreeSet<>();
			set.add(new Perro("Lucho"));
			set.add(new Perro("Marco"));
			set.add(new Perro("Sasha"));
		
			System.out.println(set);
			//System.out.println(new Perro("Sasha"));
	}
	
}
