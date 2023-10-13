package exceptions;

public class EjemploTryCatch {

	public static void main(String[] args) {
		
		try {
			int x = 10;
			int y = 10/x;
		    System.out.println("Valor de la division " +y);
			String nombre = null;
			System.out.println(nombre.toString());
			String array[] = {"hola","mundo"};
			System.out.println(array[3]);
		}catch(ArithmeticException | NullPointerException e) {
			//e.printStackTrace();
			System.err.printf("Arithmethic y NullPointer exception %s \n",e.getMessage());
		}
		catch(Exception e3){
			System.err.printf("Exception %s \n",e3.getMessage());
		}finally{
			System.out.println("Siempre se ejecuta");
		}
		
	}
	
}
