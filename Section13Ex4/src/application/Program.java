package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		// CLient Data
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY: ");
		String receivedDate = sc.next();
		Date date = sdf.parse(receivedDate);
		Client client = new Client(name, email, date);

		// Order data
		System.out.print("Enter oder data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);		
		
		// OrderItem data
		System.out.print("How many items to this order? ");
		int numberOfItems = sc.nextInt();
		for (int i = 1; i <= numberOfItems; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, price, new Product(productName, price));
			
		}
		
		// Summary
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		
	}

}
