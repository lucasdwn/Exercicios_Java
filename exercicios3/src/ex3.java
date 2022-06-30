import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = 0;
		int G = 0;
		int D = 0;

		int n = sc.nextInt();

		while (n != 4) {
			if (n == 1) {
				A += 1;
				n = sc.nextInt();
			} else if (n == 2) {
				G += 1;
				n = sc.nextInt();
			} else if(n == 3) {
				D += 1;
				n = sc.nextInt();
			} else {
				n = sc.nextInt();
			}
		}

		System.out.printf("MUITO OBRIGADO %nAlcool: %s %nGasolina: %s %nDiesel: %s %n", A, G, D);
		sc.close();

	}

}
