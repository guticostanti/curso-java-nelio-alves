package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		
		for (int i = 1; i <= numberOfProducts; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			String commonUsedOrImported = sc.next();
			if (commonUsedOrImported.charAt(0) == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);
				products.add(importedProduct);
			} else if (commonUsedOrImported.charAt(0) == 'c') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				Product product = new Product(name, price);
				products.add(product);
			} else if (commonUsedOrImported.charAt(0) == 'u') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				String receivedDate = sc.next();
				Date date = sdf.parse(receivedDate);
				UsedProduct usedProduct = new UsedProduct(name, price, date);
				products.add(usedProduct);
			} else {
				System.out.println("Tipo de produto invalido.");
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
	}

}
