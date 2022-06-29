import java.util.Scanner;
import java.util.Locale;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num;
		double HT, VH, S;
		
		num = sc.nextInt();
		sc.nextLine();
		HT = sc.nextDouble();
		sc.nextLine();
		VH = sc.nextDouble();
		
		S = HT * VH;
		
		System.out.printf("NUMBER = %s %nSALARY = U$ %.2f  %n", num, S);
		
		sc.close();

	}

}
