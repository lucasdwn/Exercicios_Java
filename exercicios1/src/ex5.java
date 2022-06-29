import java.util.Scanner;
import java.util.Locale;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int p1, n1, p2, n2;
		double v1, v2, vt;
		
		p1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		sc.nextLine();
		p2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		vt = (v1 * n1) + (v2 * n2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f %n", vt);
		
		sc.close();

	}

}
