package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();
		
		for (int i = 1; i<=numberOfShapes; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (shape == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else if (shape == 'c') {
				System.out.println("Radius: ");
				Double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			} else {
				System.out.println("Forma invalida");
			}
		}
		
		sc.close();

	}

}
