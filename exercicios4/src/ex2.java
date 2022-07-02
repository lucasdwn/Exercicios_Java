import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int out = 0;
		int in = 0;
		
		for(int i=0; i<N; i++) {
			int X = sc.nextInt();
			
			if(X < 10 || X > 20) {
				out++;
			}else {
				in++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
