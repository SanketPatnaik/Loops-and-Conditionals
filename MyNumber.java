package com.in28minutes.forwhileloop;

import java.util.ArrayList;

public class MyNumber {
	int number;

	MyNumber(int number) {
		this.number = number;
	}

	public void isPrime() {
		int k = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				k++;
			}
		}
		if (k == 2) {
			System.out.println(number + " is a prime a nunber.");
		} else {
			System.out.println((number + " is not a prime number."));
		}
		}

		public void sumUpTo() {
			int sum = 0;
			for (int i = 1; i <= number; i++) {
				sum = sum + i;
			}
			System.out.println("The sum upto " + number + " is " + sum);
		}

		public void sumOfDivisors() {
			int sum = 0;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					sum = sum + i;
				}
			}
			System.out.println("The sum of Divisors is " + sum);
			if (sum == 0) {
				System.out.println("Because " + number + " is a prime number");
			}
		}

		public void printNumberRightAngleTriangle() {
			for (int i = 1; i <= number; i++) {
				for (int k = 1; k <= i; k++) {
					System.out.printf("%d ", k);
				}
				System.out.println();
			}
		}

		public void printNumberEquilateralTriangle() {
			for (int row = 1; row <= number; row++) {
				for (int space = 1; space <= number - row; space++) {
					System.out.print(" ");
				}
				for (int digit = 1; digit <= row; digit++) {
					System.out.print(digit + " ");
				}
				System.out.println();
			}
			}

			public void printNumberPascalTriangle() {
				for (int row = 1; row <= number; row++) {
					for (int space = 1; space <= number - row; space++) {
						System.out.print(" ");
					}
					int print = 1;
					for (int digit = 1; digit <= row; digit++) {
						System.out.print(print + " ");
						print = print * (row - digit) / digit;
					}
					System.out.println();
				}
			}

			public int findSumOfEvenNumbers(int limit1, int limit2) {
				int bigger = limit1 > limit2 ? limit1 : limit2;
				int smaller = limit1 < limit2 ? limit1 : limit2;
				int sum = 0;
				while (smaller <= bigger) {
					if (smaller % 2 == 0) {
						sum = sum + smaller;
					}
					smaller++;
				}
				System.out.println("The sum is " + sum);
				return sum;
			}

			public int findSumOfOddNumbers(int limit1, int limit2) {
				int sum = 0;
				int bigger = limit1 > limit2 ? limit1 : limit2;
				int smaller = limit1 < limit2 ? limit1 : limit2;
				while (smaller <= bigger) {
					if (smaller % 2 == 1) {
						sum = sum + smaller;
					}
					smaller++;
				}
				System.out.println("The sum is " + sum);
				return sum;
			}

			public int findSumOfEvenNumbersInReverseOrder(int limit1, int limit2) {
				int bigger = limit1 > limit2 ? limit1 : limit2;
				int smaller = limit1 < limit2 ? limit1 : limit2;
				int sum = 0;
				while (bigger >= smaller) {
					if (bigger % 2 == 0) {
						sum = sum + bigger;
					}
					bigger--;
				}
				System.out.println("The sum is " + sum);
				return sum;
			}

			public int findSumOfOddNumbersInReverseOrder(int limit1, int limit2) {
				int sum = 0;
				int bigger = limit1 > limit2 ? limit1 : limit2;
				int smaller = limit1 < limit2 ? limit1 : limit2;
				while (bigger >= smaller) {
					if (bigger % 2 == 1) {
						sum = sum + bigger;
					}
					bigger--;
				}
				System.out.println("The sum is " + sum);
				return sum;
			}

			public void printEvenDigitsInANumber(int number) {
				int digit = 0;
				while (number > 0) {
					digit = number % 10;
					if (digit % 2 == 0) {
						System.out.print(digit);
					}
					number = number / 10;
				}
				System.out.println();
			}

			public void printOddDigitsInANumber(int number) {
				int digit = 0;
				while (number > 0) {
					digit = number % 10;
					if (digit % 2 == 1) {
						System.out.print(digit);
					}
					number = number / 10;
				}
				System.out.println();
			}

			public int calculateSumOfAllDigits(int number) {
				int sum = 0;
				while (number > 0) {
					sum = sum + (number % 10);
					number = number / 10;
				}
				System.out.println("The Sum Of All Digits is " + sum);
				return sum;
			}

			public void calculateSumOfAllEvenAndOddDigits(int number) {
				int sumEven = 0;
				int sumOdd = 0;
				int digit = 0;
				while (number > 0) {
					digit = number % 10;
					if (digit % 2 == 0) {
						sumEven = sumEven + digit;
					}
					else {
						sumOdd = sumOdd + digit;
					}
					number = number / 10;
				}
				System.out.println("The Sum Of All Even Digits is " + sumEven);
				System.out.println("The Sum Of All Odd Digits is " + sumOdd);
			}

			public void countTheEvenOrOddDigitsInANumber(int number) {
				int countEven = 0;
				int countOdd = 0;
				int digit = 0;
				while (number > 0) {
					digit = number % 10;
					if (digit % 2 == 0) {
						countEven++;
					}
					else {
						countOdd++;
					}
					number = number / 10;
				}
				System.out.println("The number Of All Even Digits is " + countEven);
				System.out.println("The number Of All Odd Digits is " + countOdd);

			}

			public void findPower(int number, int power) {
			int result = 1;
			for (int i = 1; i<=power ; i++) {
				result = result*number;
			}
			System.out.println(result);
		}

		public void findPalindromBetweenTwoNumbers(int limit1, int limit2) {
			int bigger = limit1 > limit2 ? limit1 : limit2;
			int smaller = limit1 < limit2 ? limit1 : limit2;
			for (int i = smaller; i <= bigger; i++) {
				int number = i;
				int reverse = 0;
				while (number > 0) {
					int digit = number % 10;
					number = number / 10;
					reverse = reverse * 10 + digit;
				}
				if (i == reverse) {
					System.out.print(reverse + " ");
				}
			}
		}

		public void findSqaureOfEvenAndCubeOfOdd(int number) {
			int digit = 0;
			int sumSquare = 0;
			int sumCube = 0;
			while (number > 0) {
				digit = number % 10;
				if (digit % 2 == 0) {
					int square = digit * digit;
					System.out.println("The Sqauare of digit " + digit + " is " + square);
					sumSquare = sumSquare + square;
				} else {
					int cube = digit * digit * digit;
					System.out.println("The Cube of digit " + digit + " is " + cube);
					sumCube = sumCube + cube;
				}
				number = number / 10;
			}
			System.out.println("The sum of all the squares is " + sumSquare);
			System.out.println("The sum of all the cubes is " + sumCube);
		}

		public void printDivisors(int number) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					System.out.print(i + " ");
				}
			}
		}

		public void printNumbersDivisibleBy3And9() {
			for (int i = 1; i <= 30; i++) {
				if (i % 9 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		public void printNumbersDivisibleBy9() {
			for (int i = 1; i <= 100; i++) {
				if (i % 9 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		public void printNumbersDivisibleBy2And4() {
			for (int i = 1; i <= 20; i++) {
				if (i % 4 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		public void printSumOfNumbersBetween20To60() {
			for (int i = 20; i <= 60; i++) {
				if (i % 11 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		public boolean findPerfectNumberOrNot(int number) {
			int sum = 0;
			for (int i = 1; i <= number / 2; i++) {
				if (number % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == number) {
				return true;
			}
			return false;
		}

		public ArrayList<Integer> findAllPerfectNumbersBetween2Numbers(int limit1, int limit2) {
			int bigger = limit1 > limit2 ? limit1 : limit2;
			int smaller = limit1 < limit2 ? limit1 : limit2;
			ArrayList<Integer> perfect = new ArrayList<Integer>();
			for (int i = smaller; i <= bigger; i++) {
				if (findPerfectNumberOrNot(i)) {
					perfect.add(i);
				}
			}
			return perfect;
		}

		public int findFactorialOfAGivenNumber(int number) {
			int factorial = 1;
			for (int i = 1; i <= number; i++) {
				factorial = factorial * i;
			}
			return factorial;
		}

		public void findFactorialOfEveryIndividualDigit(int number) {
			int check = number;
			while (check >= 1) {
				int factorial = 1;
				int digit = check % 10;
				check = check / 10;
					System.out.print("The factorials of digit " + digit + " is ");
					for (int j = 1; j <= digit; j++) {
						factorial = factorial * j;
					System.out.println(factorial + " ");
				}
			}
		}

		public int findSumOfFactorialOfEveryIndividualEvenDigit(int number) {
			int check = number;
			int sum = 0;
			while (check > 0) {
				int factorial = 1;
				int digit = check % 10;
				check = check / 10;
				for (int j = 1; j <= digit; j++) {
					factorial = factorial * j;
				}
				sum = sum + factorial;
			}
			return sum;
		}

		public boolean findStrongNumber(int number) {
			if (number == findSumOfFactorialOfEveryIndividualEvenDigit(number)) {
				return true;
			}
			return false;
		}

		public void findEvenAndOddDigitFactorial(int number) {
			int sumEven = 0;
			int sumOdd = 0;
			while (number > 0) {
				int digit = number % 10;
				int factEven = 1;
				int factOdd = 1;
				if (digit % 2 == 0) {
					for (int i = 1; i <= digit; i++) {
						factEven = factEven * i;
					}
					sumEven = sumEven + factEven;
				} else {
					for (int i = 1; i <= digit; i++) {
						factOdd = factOdd * i;
					}
					sumOdd = sumOdd + factOdd;
				}
				number = number / 10;
			}
			System.out.println("The sum of even factorials is " + sumEven);
			System.out.println("The sum of odd factorials is " + sumOdd);
		}

		public void removeAll(String str1, String str2) {
			for (int i = 0, j = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					if (j < str2.length() - 1) {
					j++;
				}
				} else {
					System.out.print(str1.charAt(i));
				}
			}
		}

		}