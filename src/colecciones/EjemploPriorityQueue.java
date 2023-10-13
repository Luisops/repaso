package colecciones;

import java.util.PriorityQueue;

class Humano{
	
	//metodo static comparte la variable
	static int edad=18;
	//variable saca una copia
	String nombre;
}

public class EjemploPriorityQueue {

	public static void main(String[] args) {
		//Humano humano= new Humano();
	//	System.out.println(Humano.edad);
		//System.out.println(humano.nombre);
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
//		queue.add(10);
//		queue.add(20);
//		queue.add(5);
//		queue.add(15);
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(5);
		queue.offer(15);
		
		System.out.println(queue);
		//System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
	}
	
}
