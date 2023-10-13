package wrapper;

class Persona{
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Persona) {
			Persona per = (Persona)obj; 
			if(per.getNombre().equals(nombre)){
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
}

public class OperadoresVsEquals {

	public static void main(String[] args) {
		
		Persona p = new Persona("Luis");
		Persona p2 = new Persona("Luis");
		
		System.out.println(p.equals(p2));
		
		Integer x = 10;
		Integer y = 10;
		System.out.println(x.equals(y));
		System.out.println(x==y);
	}
}
