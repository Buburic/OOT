package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Da li ovo radi?");
		Scanner scanner = new Scanner(System.in);
		
		int broj = scanner.nextInt();
		 System.out.println("\nDa, radi " + broj);
		
		scanner.close();
	}

}
