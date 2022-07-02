import java.util.Scanner;
import java.util.Locale;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double m = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf("%.1f%n", m);
		}
		
		sc.close();

	}

}
