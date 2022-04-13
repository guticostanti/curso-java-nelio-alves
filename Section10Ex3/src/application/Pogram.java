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
		
		Rent[] rents = new Rent[numberOfRooms];
		
		for (int i=1; i<=rents.length; i++) {
			System.out.println("");
			System.out.print("Rent #" + i + ":\n");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			rents[roomNumber] = new Rent(name, email, roomNumber);
		}
		
		System.out.println("Busy rooms:\n");
		for (int j=0; j<rents.length; j++) {
			if (rents[j] != null) {
				System.out.println(rents[j].roomNumber + ": " + rents[j].name + ", " + rents[j].email + "\n");
			}
		}
		
		sc.close();
		

	}

}
