package application;

import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		funcionario fu = new funcionario();
		
		System.out.println("Name: ");
		fu.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		fu.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		fu.tax = sc.nextDouble();
		
		System.out.println("Employee: " + fu.toString());
		
		System.out.println("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		fu.increaseSalary(percentage);
		
		System.out.println("Update data: " + fu.toString());
		
		sc.close();

	}

}
