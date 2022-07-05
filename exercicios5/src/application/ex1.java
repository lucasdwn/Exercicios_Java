package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo re = new retangulo();
		
		System.out.println("Enter rectangle width and height:");
		re.a = sc.nextDouble();
		re.b = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n",re.area());
		System.out.printf("PERIMETER = %.2f%n",re.perimetro());
		System.out.printf("DIAGONAL = %.2f%n",re.diagonal());
		sc.close();
	}

}
