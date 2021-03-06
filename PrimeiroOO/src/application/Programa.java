package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.printf("Product data: " + product.name + ", $ " + product.price + ", " + product.quantity + " units, total: $ %.2f", product.totalValueStock());
		System.out.println(product.toString());
		sc.close();

	}

}
