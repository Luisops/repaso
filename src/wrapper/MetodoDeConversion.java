package wrapper;

public class MetodoDeConversion {

 public static void main(String[] args) {
	 //wraper
	 Integer x= 10;
	 
	 //primitivo
	 double y = x.doubleValue();
	 float f = x.floatValue();
	 long l = x.longValue();
 
	 //converion de un wrapper a primitivo
	 String valor = "10";
	 int val = Integer.parseInt(valor);
	 System.out.println(val);
	 
	 //Conversion de un primitivo a wrapper ctrl + shift + T
	 Double valueOf = Double.valueOf("55");
	 System.out.println(valueOf);
 }
	
}
