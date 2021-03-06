package secao8;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class aulaExSemOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measure of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		System.out.printf("Triangle x area = %.4f", x.area());
		System.out.printf("\nTriangle y area = %.4f\n", y.area());
		
		if (x.area() > y.area()) {
			System.out.println("Larger area: x");
		} else if (x.area() < y.area()) {
			System.out.println("Larger area: y");
		} else {
			System.out.println("The areas are equal");
		}
		
		
		sc.close();

	}

}
