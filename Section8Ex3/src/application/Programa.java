package application;

import java.util.Scanner;

import entities.Student;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();
		
		System.out.print("Name: ");
		sc.next();
		System.out.print("Grade 1: ");
		estudante.notaUm = sc.nextDouble();
		System.out.print("Grade 2: ");
		estudante.notaDois = sc.nextDouble();
		System.out.print("Grade 3: ");
		estudante.notaTres = sc.nextDouble();
		
		System.out.println("\nNOTA FINAL = " + estudante.notaFinal());
		
		if (estudante.notaFinal() >= 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING POINTS %.2f", estudante.missingPoints());
		}
		
		System.out.println();
		
		sc.close();

	}

}
