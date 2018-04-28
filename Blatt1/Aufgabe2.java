package test;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie heiﬂen Sie?");
		String input = scanner.nextLine();
		System.out.println("Hallo " + input + "!");
		System.out.println("Zahl 1 eingeben:");
		int a = scanner.nextInt();
		System.out.println("Zahl 2 eingeben:");
		int b = scanner.nextInt();
		System.out.println("Ergebniss: " + (a + b));
		scanner.close();

	}

}
