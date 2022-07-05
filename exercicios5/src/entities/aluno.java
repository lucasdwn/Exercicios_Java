package entities;

public class aluno {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double mediaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double missingPoints() {
		if(mediaFinal() < 60.00) {
			return 60.00 - mediaFinal();
		}else {
			return 0.00;
		}
	}
	
	
}
