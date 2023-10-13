package repaso;

public class Persona {

	String nombre;
	int edad;
	char genero;
	
	//INVOCACION DE CONSTRUCTORES
	Persona(){
		this("defecto nombre", 18, 'M');
		//System.out.println("Constructor vacio");
	}
	
	Persona(String nombre, int edad, char genero){
		//this();
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
	}
	
	//metodos
	void imprimirInformacion() {
		System.out.println("Nombre:"+nombre);
		System.out.println("Edad:"+edad);
		System.out.println("Genero:"+genero);
	}
	
	public static void main(String args[]) {
		Persona p = new Persona("Luis",24,'M');
		p.imprimirInformacion();
		
		Persona p1 = new Persona("Erick",27,'M');
		p1.imprimirInformacion();
		
		new Persona().imprimirInformacion();
	}
	
	
}
