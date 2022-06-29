import java.util.Scanner;
import java.util.Locale;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C, a, b, c, d, e, pi;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		a = (A * C)/ 2.0;
		
		pi = 3.14159;
		b = Math.pow(C, 2.0);
		b = b * pi;
		
		c = ((A + B) * C) / 2;
		
		d = B * 4;
		
		e = A * B;
		
		System.out.printf("TRIANGULO: %.3f %n", a);
		System.out.printf("CIRCULO: %.3f %n", b);
		System.out.printf("TRAPEZIO: %.3f %n", c);
		System.out.printf("QUADRADO: %.3f %n", d);
		System.out.printf("RETANGULO: %.3f %n", e);
		
		sc.close();

	}

}
