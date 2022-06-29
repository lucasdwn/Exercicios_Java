import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h1, h2, d;
		
		h1 = sc.nextInt();
		h2 = sc.nextInt();
		
		if(h1 < h2) {
			d = h2 - h1;
		}
		else {
			d = 24 - h1 + h2;
		}
		
		System.out.printf("O JOGO DUROU %s HORA(S) %n", d);
		
		sc.close();
	}

}
