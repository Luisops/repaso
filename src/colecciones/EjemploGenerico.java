package colecciones;

//Limitar genericos a traves de herencias
class Transporte{}

class Coche extends Transporte{}

class Deportivo extends Coche{}

//Sirve para poder definir tipos los beans genericos
class BeanGeneric<T extends Transporte>{
	private T valor;
	
	public BeanGeneric(T valor) {
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
}

public class EjemploGenerico {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		BeanGeneric<Deportivo> bean = new BeanGeneric<>(new Deportivo());	
	}
	
}
