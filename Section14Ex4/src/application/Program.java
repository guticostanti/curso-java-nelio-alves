package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tay payers: ");
		int numberOfTaxPayers = sc.nextInt();
		for (int i = 1; i<=numberOfTaxPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualRevenue = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthSpending = sc.nextDouble();
				list.add(new Individual(name, anualRevenue, healthSpending));
			} else if (type == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualRevenue, numberOfEmployees));
			} else {
				System.out.print("You entered and invalid type of Tax Payer");
			}
			
		sc.close();
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer taxPayer : list) {
			
		}

	}

}
