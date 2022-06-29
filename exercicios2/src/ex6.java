import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double i = sc.nextDouble();
		
		if(i <= 25 && i >= 0) {
			System.out.println("Intervalo [0,25]");
		}
		else if(i <= 50 && i >= 0) {
			System.out.println("Intervalo [25,50]");
		}
		else if(i <= 75 && i >= 0) {
			System.out.println("Intervalo [50,75]");
		}
		else if(i <= 100 && i >= 0) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}
