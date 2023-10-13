package practica;

public class Cuadrado extends Figura{

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}
	
	@Override
	public String toString() {
		return "Circulo [color=" + super.toString() + ", lado=" + lado + "]";
	}
	
}
