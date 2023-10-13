package exceptions;

import java.io.PrintWriter;

class Recursos implements AutoCloseable{

	void food() {
		System.out.println("FOOD");
	}
	
	@Override
	public void close(){
		// TODO Auto-generated method stub
		System.out.println("LIBERANDO RECURSOS");
	}
	
}

public class EjemploTryWithResources {

	public static void main(String[] args) {
		
		try(Recursos rec = new Recursos()){
			rec.food();;
		}
		
	}
}
