package entities;

public class Student {

	public double notaUm, notaDois, notaTres;
	
	public double notaFinal() {
		return notaUm + notaDois + notaTres;
	}
	
	public double missingPoints() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		} else {
			return 0;
		}
	}
}
