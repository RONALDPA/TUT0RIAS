
public class SimuladorGeometrico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p = new Punto(5,8);
		double x = p.getX();
		p.imprimir();
		
		Circulo c = new Circulo(p, 5);
		Double area = c.calcularArea();
		Double perimetro = c.calcularCircunferencia();
		
		System.out.println("El area del circulo es: "+ area + " y su circunferencia es: "+ perimetro);
	}

}
