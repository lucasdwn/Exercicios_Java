package application;

import java.util.Locale;
import java.util.Scanner;

import entities.aluno;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		aluno al = new aluno();
		
		System.out.println("Name: ");
		al.name = sc.nextLine();
		
		System.out.println("Nota1: ");
		al.nota1 = sc.nextDouble();
		
		System.out.println("Nota2: ");
		al.nota2 = sc.nextDouble();
		
		System.out.println("Nota3: ");
		al.nota3 = sc.nextDouble();
		
		if(al.mediaFinal() >= 60) {
			System.out.printf("FINAL GRADE = %.2f %nPASS", al.mediaFinal());
		}else {
			System.out.printf("FINAL GRADE = %.2f %nFAILED %nMISSING %.2f POINTS %n", al.mediaFinal(), al.missingPoints());
		}
		
		sc.close();
	}

}
