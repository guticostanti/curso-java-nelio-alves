package application;

import java.util.Scanner;

import entities.Employee;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.print("Name: ");
		funcionario.name = sc.next();
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();

		System.out.println(funcionario.toString());
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println(funcionario.toString());
		
		sc.close();
	}

}
