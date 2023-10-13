package practica;

public class Circulo extends Figura{

	private double radio;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [color=" + super.toString() + ", radio=" + radio + "]";
	}

	
	
}
