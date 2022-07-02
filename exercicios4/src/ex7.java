import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			int a = i * i;
			int b = a * i;
			System.out.printf("%s %s %s %n", i, a, b);
		}
		
		sc.close();

	}

}
