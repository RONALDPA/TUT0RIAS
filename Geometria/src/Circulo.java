//Esta clase crea un cirvulo a traves de un punto

public class Circulo {
	//Atributos /propiedades
	private double radio = 1; 
	public static final double pi = 3.1415926535897932384626433832795;
	 private Punto p;
	 
	 //Constructor
	 public Circulo(Punto centro, double r)
	 {
		 p = centro;
		 radio = r;
	 }
	 /**
	  * Este metodo Calcula el area de un circulo
	  * @return
	  */
	 public double calcularArea()
	 {
		 return pi * Math.pow(radio, 2);
		
	 }
	 /**
	  * Este Metodo Calcula el perimetro del circulo
	  * @return
	  */
	 public double calcularCircunferencia()
	 {
		 return 2* pi *radio;
		
	 }

}
