package secao8;

import java.util.Locale;
import java.util.Scanner;

public class aulaExSemOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xa, xb, xc, ya, yb, yc, areax, areay, px, py;
		
		System.out.println("Enter the measure of triangle x: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle y: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		px = (xa + xb + xc) / 2;
		py = (ya + yb + yc) / 2;

		areax = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));
		areay = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));
		
		System.out.printf("Triangle x area = %.4f", areax);
		System.out.printf("\nTriangle y area = %.4f\n", areay);
		
		if (areax > areay) {
			System.out.println("Larger area: x");
		} else if (areax < areay) {
			System.out.println("Larger area: y");
		} else {
			System.out.println("The areas are equal");
		}
		
		
		sc.close();

	}

}
