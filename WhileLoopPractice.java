package com.in28minutes.oops;

import java.util.Scanner;

public class WhileLoopPractice {
	private int limit;

	public WhileLoopPractice(int limit) {
		this.limit = limit;
	}

	public void printSqaureUpToLimit() {
		int number = 1;
		int square = 1;
		while (square <= limit) {
			System.out.print(square + " ");
			number++;
			square = number * number;
		}
		System.out.println();
	}

	public void printCubesUpToLimit() {
		int number = 1;
		int cube = 1;
		while (cube <= limit) {
			System.out.print(cube + " ");
			number++;
			cube = number * number * number;
		}
		System.out.println();

	}

	public void printSumUntilNegative() {
		int number;
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int sumEven = 0;
		int sumOdd = 0;
		do {
			System.out.println("Enter a number for getting its sum ");
			number = scan.nextInt();
			int check = number;
			sum = sum + check;
			sumEven = sumEven + (check % 2 == 0 ? check : 0);
			sumOdd = sumOdd + (check % 2 == 0 ? 0 : check);
			if (number < 0) {
				System.out.println("The sum is " + sum);
				System.out.println("The sum of even numbers is " + sumEven);
				System.out.println("The sum of odd number is is " + sumOdd);
			}
		} while (number > 0);
	}

}

