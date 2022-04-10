package application;

import java.util.Scanner;

import entities.Calculator;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.print("What is the dollar price? ");
		calc.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		calc.amountBoughtInDollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f", calc.calculate());
		
		sc.close();
	}

}
