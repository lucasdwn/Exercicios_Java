import java.util.Scanner;
import java.util.Locale;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int DIFERENCA = A * B - C * D;
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();

	}

}
