package practica;

public class Figura {

	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Figura(String color) {
		this.color = color;
	}

	public double calcularArea() {
		return 0;
	}
	
	public double calcularPerimetro() {
		return 0;
	}

	@Override
	public String toString() {
		return  color ;
	}
	
}
