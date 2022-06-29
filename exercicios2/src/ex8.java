import java.util.Scanner;
import java.util.Locale;

public class ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double v = sc.nextDouble();
		double i = 0;
		
		if (v >= 0 && v <= 2000) {
			i = 0;
		}
		else if(v <= 3000) {
			i = (v - 2000) * 0.08;
		}
		else if(v <= 4500) {
			i = (v - 3000) * 0.18 + 1000 * 0.08;
		}
		else if(v > 4500) {
			i = (v - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		else {
			System.out.println("Digite um valor válido");
		}
		
		if(i == 0 ) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f %n", i);
		}
		
		
		sc.close();

	}

}
