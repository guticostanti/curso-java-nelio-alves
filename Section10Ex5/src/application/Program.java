package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int numberOfEmployees = sc.nextInt();
		
		List<Employee> listaDeFuncionarios = new ArrayList<>();
		
		for (int i = 1; i <= numberOfEmployees; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			listaDeFuncionarios.add(new Employee(id, name, salary));
		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int id  = sc.nextInt();
		Employee funcionario = listaDeFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (funcionario == null) {
			System.out.println("You entered an invalid ID.");
		} else {
			System.out.print("Enter the perentage: ");
			double percentage = sc.nextDouble();
			funcionario.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of Employees: ");
		for (Employee func : listaDeFuncionarios) {
			System.out.println(func);
		}
		
		sc.close();
	}

}
