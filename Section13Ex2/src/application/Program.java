package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.next();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int numberOfContracts = sc.nextInt();
		
		for (int i=1; i<numberOfContracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYY): ");
			String dataRecebida = sc.next();
			Date date = dateFormat.parse(dataRecebida);
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			Integer hours = sc.nextInt();
			HourContract contract = new HourContract(date, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String dataRecebida = sc.next();
		Date date = dateFormat.parse(dataRecebida);
		int month = Integer.parseInt(dataRecebida.substring(0, 2));
		int year = Integer.parseInt(dataRecebida.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.print("Department: " + worker.getDepartament().getName());
		System.out.print("Income for " + dataRecebida + ": " + worker.income(year, month));
		sc.close();

	}

}
