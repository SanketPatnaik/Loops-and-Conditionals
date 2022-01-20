package com.in28minutes.forwhileloop;

import java.util.ArrayList;
import java.util.Scanner;

public class DoWhileNumber {

	int number;

	public DoWhileNumber(int number) {
		this.number=number;
	}

	public void printCubeOfANumber() {
		int number = -1;
		Scanner scanner = new Scanner(System.in);
		do {
			if (number >= 0) {
			System.out.println("The Cube is " + number * number * number);
			}
			System.out.print("Enter the number - ");
			number = scanner.nextInt();
		} while (number >= 0);
		System.out.println("Thank you & Have fun");
	}

	public void findSumOfEvenNumbers(int limit1, int limit2) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		int sum = 0;
		do {
			int check = smaller;
			if (check % 2 == 0) {
				sum = sum + check;
			}
			smaller++;
		} while (smaller <= bigger);
		System.out.println("The sum of all the even numbers is " + sum);
	}

	public void findSumOfOddNumbers(int limit1, int limit2) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		int sum = 0;
		do {
			int check = smaller;
			if (check % 2 == 1) {
				sum = sum + check;
			}
			smaller++;
		}while(smaller<=bigger);
		System.out.println("The sum of all the odd numbers is " + sum);
	}

	public void findSumOfEvenNumbersInReverseOrder(int limit1, int limit2) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		int sum = 0;
		do {
			int check = bigger;
			if (check % 2 == 0) {
				sum = sum + check;
			}
			bigger--;
		} while (bigger >= smaller);
		System.out.println("The sum of all the even numbers is " + sum);
	}

	public void findSumOfOddNumbersInReverseOrder(int limit1, int limit2) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		int sum = 0;
		do {
			int check = bigger;
			if (check % 2 == 1) {
				sum = sum + check;
			}
			bigger--;
		} while (bigger >= smaller);
		System.out.println("The sum of all the odd numbers is " + sum);
	}

	public void printEvenDigitsInANumber(int number) {
		int check = number;
		do {
			int digit = check % 10;
			if (digit % 2 == 0) {
				System.out.print(digit + " ");
			}
			check = check / 10;
		} while (check > 0);
		System.out.println();
	}

	public void printOddDigitsInANumber(int number) {
		int check = number;
		do {
			int digit = check % 10;
			if (digit % 2 == 1) {
				System.out.print(digit + " ");
			}
			check = check / 10;
		} while (check > 0);
		System.out.println();
	}

	public void calculateSumOfAllDigits(int number) {
		int check = number;
		int sum = 0;
		do {
			int digit = check % 10;
			sum = sum + digit;
			check = check / 10;
		} while (check > 0);
		System.out.println("The sum of all the digits is " + sum);
	}

	public void calculateSumOfAllEvenAndOddDigits(int number) {
		int check = number;
		int sumEven = 0;
		int sumOdd = 0;
		do {
			int digit = check % 10;
			if (digit % 2 == 0) {
				sumEven = sumEven + digit;
			} else {
				sumOdd = sumOdd + digit;
			}
			check = check / 10;
		} while (check > 0);
		System.out.println("The sum of all the even digits is " + sumEven);
		System.out.println("The sum of all the odd digits is " + sumOdd);
	}

	public void countTheEvenOrOddDigitsInANumber(int number) {
		int check = number;
		int countEven = 0;
		int countOdd = 0;
		do {
			int digit = check % 10;
			if (digit % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
			check = check / 10;
		} while (check > 0);
		System.out.println("The count of all the even digits is " + countEven);
		System.out.println("The count of all the odd digits is " + countOdd);
	}

	public int findPower(int base, int power) {
		int result = 1;
		do {
			result = result * base;
			power--;
		} while (power > 0);
		System.out.println("The power of base " + base + " is " + result);
		return result;
	}

	public void findPalindromBetweenTwoNumbers(int limit1, int limit2) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		do {
			int reverse = 0;
			int check = smaller;
			do {
				int digit = check % 10;
				reverse = reverse * 10 + digit;
				check = check / 10;
			} while (check > 0);
			if (reverse == smaller) {
				System.out.print(reverse + " ");
			}
			smaller++;
		} while (smaller <= bigger);
		System.out.println();
	}

	public void findSqaureOfEvenAndCubeOfOdd(int number) {
		int sumEven = 0;
		int sumOdd = 0;
		do {
			int digit = number%10;
			if(digit%2 == 0) {
				int evenPower = findPower(digit , 2);
				System.out.println("The square of even digit" + digit+" is "+ evenPower);
				sumEven = sumEven+evenPower;
			}
			else {
				int oddPower = findPower(digit, 3);
				System.out.println("The cube of odd digit"+digit+" is "+oddPower );
				sumOdd = sumOdd + oddPower;
			}
			number = number/10;
		}while(number>0);
		System.out.println("The sum of all the even digit squares is " +sumEven);
		System.out.println("The sum of all the odd digit cubes is " +sumOdd);
	}

	public void printDivisors(int number) {
		int i = 1;
		do {
			if(number%i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}while(i<=number);
		System.out.println();
	}

	public void printNumbersDivisibleBy3And9(int limit1, int limit2) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		do {
			if(smaller%9==0) {
				System.out.print(smaller + " ");
			}
			smaller++;
		}while(smaller<=bigger);
		System.out.println();
	}

	public void printNumbersDivisibleBy9(int limit1, int limit2) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		do {
			if(smaller%9==0) {
				System.out.print(smaller + " ");
			}
			smaller++;
		}while(smaller<=bigger);
		System.out.println();
	}

	public void printNumbersDivisibleBy2And4(int limit1, int limit2) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		do {
			if(smaller%4==0) {
				System.out.print(smaller + " ");
			}
			smaller++;
		}while(smaller<=bigger);
		System.out.println();
	}

	public void printNumbersDivisibleByAnyDivisor(int limit1 , int limit2, int divisor) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		do {
			if(smaller%divisor==0) {
				System.out.print(smaller + " ");
			}
			smaller++;
		}while(smaller<=bigger);
	}

	public void printSumOfNumbersBetween20To60(int limit1, int limit2) {
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		do {
			if (smaller % 11 == 0) {
				System.out.print(smaller + " ");
			}
			smaller++;
		} while (smaller <= bigger);
		System.out.println();

	}

	public boolean findPerfectNumberOrNot(int number) {
		int sum = 0;
		int i = 1;
		do {
			if (number % i == 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= number / 2);
		if (sum == number) {
			return true;
		}
		return false;
	}

	public ArrayList<Integer> findAllPerfectNumbersBetween2Numbers(int limit1, int limit2) {
		ArrayList<Integer> divisors = new ArrayList<>();
		int bigger = limit1 > limit2 ? limit1 : limit2;
		int smaller = limit1 < limit2 ? limit1 : limit2;
		do {
			if(findPerfectNumberOrNot(smaller)) {
				divisors.add(smaller);
			}
			smaller++;
		}while(smaller<=bigger);
		return divisors;
	}

	public int findFactorialOfAGivenNumber(int number) {
		int factorial = 1;
		if (number == 0) {
			return factorial;
		}
		do {
			factorial = factorial*number;
			number--;
		} while (number >= 1);
		return factorial;
	}

	public void findFactorialOfEveryIndividualDigit(int number) {
		do {
			int digit = number%10;
			System.out.println("The factorial of the digit "+digit+" is "+ findFactorialOfAGivenNumber(digit));
			number = number/10;
		}while(number>0);
	}

	public boolean findStrongNumber(int number) {
		int check = number;
		int sum = 0;
		do {
			int digit = number%10;
			sum = sum + findFactorialOfAGivenNumber(digit);
			number = number/10;
		}while(number>0);
		if (check == sum) {
			return true;
		}
		return false;
	}

	public void findEvenAndOddDigitFactorial(int number) {
		int sumEven = 0;
		int sumOdd = 0;
		do {
			int digit = number%10;
			if(digit%2 == 0) {
				sumEven = sumEven+findFactorialOfAGivenNumber(digit);
			}
			else {
				sumOdd = sumOdd+findFactorialOfAGivenNumber(digit);
			}
			number = number/10;
		}while(number>0);
			System.out.println("The sum of even factorials is " + sumEven);
			System.out.println("The sum of odd factorials is " + sumOdd);
	}
	}