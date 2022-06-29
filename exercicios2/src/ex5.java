import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c, q;
		double preco = 0, total;
		
		c = sc.nextInt();
		q = sc.nextInt();
		
		if(c == 1) {
			preco = 4.00;
		}
		else if(c == 2) {
			preco = 4.50;
		}
		else if(c == 3) {
			preco = 5.00;
		}
		else if(c == 4) {
			preco = 2.00;
		}
		else if(c == 5) {
			preco = 1.50;
		}
		else {
			System.out.println("Digite um código valido");
		}
		
		total = q * preco;
		
		System.out.printf("Total: R$ %.2f %n", total);
		
		sc.close();
	}
}
