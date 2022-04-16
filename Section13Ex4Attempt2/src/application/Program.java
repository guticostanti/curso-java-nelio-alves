package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Client data
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (15/03/1985): ");
		String receivedDate = sc.next();
		Date date = sdf.parse(receivedDate);
		Client client = new Client(name, email, date);
		
		// OrderItem data
		System.out.print("Enter order data:");
		
		sc.close();
	}

}
