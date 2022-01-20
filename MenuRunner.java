package com.in28minutes.acceptinginputs;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1 - ");
		int number1 = scanner.nextInt();
		System.out.println("The number you entered is " + number1);

		System.out.print("Enter Number2 - ");
		int number2 = scanner.nextInt();
		System.out.println("The number you entered is " + number2);

		System.out.println("Choose an operation");
		System.out.println("Add - 1");
		System.out.println("Substract - 2");
		System.out.println("Multiply - 3");
		System.out.println("Divide - 4");
		System.out.println("Remainder - 5");
		int choice = scanner.nextInt();
		printUsingSwitch(choice);
		performTheOperationUsingSwitch(number1, number2, choice);
		System.out.println("Enter a number to find out if its Positive or negative or 0");
		int number = scanner.nextInt();
		findIfTheNumberIsPositive(number);

	}

	public static void printUsingSwitch(int choice) {
		switch(choice) {
		case 1 : System.out.println("The operation you chose is Add");
		break;
		case 2 : System.out.println("The operation you chose is Substract");
		break;
		case 3 : System.out.println("The operation you chose is Multiply");
		break;
		case 4 : System.out.println("The operation you chose is Divide");
		break;
	case 5:
		System.out.println("The operation you chose is Remainder");
		default : System.out.println("Neetu is so Beautiful");
			break;
		}
	}

	public static void performTheOperationUsingSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			int result = number1 + number2;
			System.out.println("The Result is " + result);
			break;
		case 2:
			result = number1 - number2;
			System.out.println("The Result is " + result);
			break;
		case 3:
			result = number1 * number2;
			System.out.println("The Result is " + result);
			break;
		case 4:
			result = number1 / number2;
			System.out.println("The Result is " + result);
			break;
		case 5:
			result = number1 % number2;
			System.out.println("The result is " + result);
			break;
		default:
			System.out.println("Neetu is so Beautiful");
			break;
	}
	}

	public static void findIfTheNumberIsPositive(int number) {
		if (number == 0) {
			System.out.println("The number is 0");
		}
		else {
		switch (number / Math.abs(number)) {
		case 1:
			System.out.println("The number is +ve");
			break;
		case -1:
			System.out.println("The number is -ve");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
	}
}