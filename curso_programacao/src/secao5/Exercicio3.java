package secao5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroUm, numeroDois;
		
		numeroUm = sc.nextInt();
		numeroDois = sc.nextInt();
		
		if (numeroUm % numeroDois == 0 || numeroDois % numeroUm == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();

	}

}
