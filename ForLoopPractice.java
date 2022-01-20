package com.in28minutes.oops;

public class ForLoopPractice {
	private int number;

	public ForLoopPractice(int number) {
		this.number = number;
	}

	public boolean isPrime2() {
		int check = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				check++;
			}
		}
		if (check == 2) {
			return true;
		} else {
			return false;
		}
	}
	public void sumUpToN2() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println("The sum upto number is " + sum);
	}

	public void sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of the Divisors is " + sum);
	}

	public void printSameNumber90DegreeTriangle() {
		for (int row = 1; row <= number; row++) {
			int sameDigit = 0;
			for (int digit = 1; digit <= row; digit++) {
				sameDigit = row;
				System.out.print(sameDigit + " ");
			}
			System.out.println();
		}

	}

	public void printNumber90DegreeTriangle() {
		for (int row = 1; row <= number; row++) {
			for (int digit = 1; digit <= row; digit++) {
				System.out.print(digit + " ");
			}
			System.out.println();
		}
	}

	public void printEquilateralNumberTriangle() {
		int x = number;
		for (int row = 1; row <= number; row++) {
				for (int space = 1; space <= x; space++) {
					System.out.print(" ");
				}
				for (int digit = 1; digit <= row; digit++) {
					System.out.print(digit + " ");
				}
			System.out.println();
				x--;
		}
	}

	public void printCamelCaseNumber90Triangle() {
		for (int row = 1; row <= number; row++) {
			if (row > number / 2) {
				for (int digit = 1; digit <= number - row; digit++) {
					System.out.print(digit + " ");
				}
				System.out.println();
			}
			else {
			for (int digit = 1; digit <= row; digit++) {
				System.out.print(digit + " ");
			}
			System.out.println();
		}
		}
	}

	public void printReverseCamelCaseNumber90Triangle() {
		for (int row = 0; row <= number; row++) {
			int difference = 0;
			if (row % 2 == 0) {
				difference = ((number - row) / 2);
			for (int digit = 1; digit <= difference; digit++) {
				System.out.print(digit + " ");
			}
			System.out.println();
		}
		}
	}

}
