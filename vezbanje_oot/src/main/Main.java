package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Vezbe 1
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Operation: ");
		
//		int valOne = 24;
//		int valTwo = 12;
//		char operation = scanner.next().charAt(0);
//		
//		if (operation == '+') {
//			System.out.println("Result: " + (valOne + valTwo));
//		}
//		else if (operation == '-') {
//			System.out.println("Result: " + (valOne - valTwo));
//		}
//		else if (operation == '*') {
//			System.out.println("Result: " + (valOne * valTwo));
//		}
//		else if (operation == '/') {
//			System.out.println("Result: " + (valOne / valTwo));
//		}
//		else {
//			System.out.println("Invalid input");
//		}
//		
//		int num = scanner.nextInt();
//		while (num > 200) {
//			System.out.println("Invalid input\nValue must be less then 200");
//			num = scanner.nextInt();
//		}
//		
//		int sum = 0;
//		for (int i = 0; i <= num; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("Sum: " + sum);

//		scanner.close();
		int cnt = 0;
		for (int i = 2023; i <= 2100; i++) {
			if (i % 4 == 0 && i % 100 != 0) {
				cnt++;
			}
			else if (i % 400 == 0) {
				cnt++;
			}
		}
		System.out.println("Broj prestupnih godina: " + cnt);
	}

}
