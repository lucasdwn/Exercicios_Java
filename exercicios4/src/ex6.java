import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			if(6 % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
