package repaso;

class Animal{
	//reutilizacion de codigo
	String nombre;
	public void respirar() {
		System.out.println("Soy un animal y puedo respirar "+nombre);
	}
}

class Perro extends Animal{
	
}

class Gatos extends Animal{
	
}

public class EjercicioHerencia {

	public static void main( String args[]) {
		Animal a = new Animal();
		
		Gatos g = new Gatos();
		g.nombre="Layla";
		g.respirar();
		
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Object);
		//System.out.println(a instanceof Gatos);
		System.out.println(g instanceof Animal);
		System.out.println(g instanceof Gatos);
	}
	
}
