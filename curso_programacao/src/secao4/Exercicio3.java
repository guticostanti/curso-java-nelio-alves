package secao4;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, resultado;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		resultado = A * B - C * D;
		
		System.out.println("Resultado: " + resultado);
		
		sc.close();

	}

}
