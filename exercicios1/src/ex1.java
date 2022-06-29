import java.util.Scanner;
import java.util.Locale;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a, b;
		
		a = sc.nextInt();
		sc.nextLine();
		b = sc.nextInt();
		
		int c = a + b;
	
		System.out.println("SOMA = " + c);
		
		sc.close();

	}

}
