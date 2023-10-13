package exceptions;

public class EjemploThrow {

	static double dividir(int a, int b) {
		if(b!= 0) {
			return a/b;
		}else {
			 throw new IllegalArgumentException("No se puede dividir entre 0");
		}
	}
	
	public static void main(String[] args) {

		double resultado = EjemploThrow.dividir(10, 0);
			System.out.println("Resultado" + resultado);
		
	}
	
}
