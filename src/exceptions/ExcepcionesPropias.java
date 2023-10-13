package exceptions;

class TituloIncorrectoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	  
	public TituloIncorrectoException(String error) {
		// TODO Auto-generated constructor stub
		super(error);
	}
 }

public class ExcepcionesPropias {
   
	
	//Si el nombre del curso no esta en mayusculas es incorecto
	
	static void crearCurso(String titulo) throws TituloIncorrectoException {
		if(!titulo.toUpperCase().equals(titulo)) {
			throw new TituloIncorrectoException("El titulo debe estar en mayusuculas");
		}
		System.out.println("Titulo correcto");
	}
	
	public static void main(String[] args) {
		
		try {
			crearCurso("JAVA DESDE CEROo");
		} catch (TituloIncorrectoException e) {
			// TODO Auto-generated catch block
			System.out.println("Error "+e.getMessage());
		}
		
	}
	
}
