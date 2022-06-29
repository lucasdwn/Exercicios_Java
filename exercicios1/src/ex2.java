import java.util.Scanner;
import java.util.Locale;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		double eraio;
		
		eraio = sc.nextDouble();
		
		double raio = Math.pow(eraio, 2.0);
		double area = pi * raio;
		
		System.out.printf("A= %.4f", area);
		
		sc.close();

	}

}
