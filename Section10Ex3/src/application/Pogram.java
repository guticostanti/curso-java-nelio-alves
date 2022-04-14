package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Pogram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int numberOfRooms = sc.nextInt();
		
		Rent[] rents = new Rent[10];
		
		for (int i=1; i<=numberOfRooms; i++) {
			System.out.println();
			System.out.print("Rent #" + i + ":\n");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			rents[roomNumber] = new Rent(name, email);
		}
		
		System.out.println("Busy rooms:\n");
		for (int j=0; j<10; j++) {
			if (rents[j] != null) {
				System.out.println(j + ": " + rents[j] + "\n");
			}
		}
		
		sc.close();
		

	}

}
