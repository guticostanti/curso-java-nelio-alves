package secao4;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double raio, area;
		
		raio = sc.nextDouble();
		
		area = 3.14159 * raio * raio;
		
		System.out.printf("Area: %.4f\n", area);
		
		sc.close();
	}

}
