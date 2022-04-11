package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Account conta;
		
		System.out.print("Enter acount number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String nome = sc.next();
		System.out.print("Is there and initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Eneter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new Account(accountNumber, nome, depositoInicial);
		} else {
			conta = new Account(accountNumber, nome);
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(conta);
		
		System.out.print("\nEnter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		System.out.print("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw data: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		System.out.print("Updated account data: ");
		System.out.println(conta);
		
		sc.close();

	}

}
