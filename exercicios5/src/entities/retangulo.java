package entities;

public class retangulo {

	public double a;
	public double b;
	
	public double area() {
		return a * b;
	}
	
	public double perimetro() {
		return (a + b) * 2;
	}
	
	public double diagonal() {
		double A = Math.pow(a, 2.0);
		double B = Math.pow(b, 2.0);
		double r = Math.sqrt(A + B);
		return r;
	}
}
