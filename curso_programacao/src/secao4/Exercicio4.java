package secao4;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numeroDoFuncionario, horasTrabalhadas;

		double valorPorHora, salario;
		
		numeroDoFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("Number = " + numeroDoFuncionario);
		System.out.printf("salario = U$ %.2f%n", salario);
		
		sc.close();
	}

}
