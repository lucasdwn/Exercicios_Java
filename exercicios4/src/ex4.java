import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(b == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) a / b;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();

	}

}
