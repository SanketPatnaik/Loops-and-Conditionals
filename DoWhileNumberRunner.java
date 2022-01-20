package com.in28minutes.forwhileloop;

public class DoWhileNumberRunner {

	public static void main(String[] args) {
		DoWhileNumber number = new DoWhileNumber(88);

		// number.printCubeOfANumber();
		number.findSumOfEvenNumbers(1, 10);
		number.findSumOfOddNumbers(1, 10);
		number.findSumOfEvenNumbersInReverseOrder(20, 10);
		number.findSumOfOddNumbersInReverseOrder(35, 11);
		number.printEvenDigitsInANumber(5438);
		number.printOddDigitsInANumber(5438);
		number.calculateSumOfAllDigits(5438);
		number.calculateSumOfAllEvenAndOddDigits(5438);
		number.countTheEvenOrOddDigitsInANumber(5438);
		number.findPower(8, 2);
		number.findPalindromBetweenTwoNumbers(10, 200);
		number.findSqaureOfEvenAndCubeOfOdd(543892);
		number.printDivisors(10);
		number.printNumbersDivisibleBy3And9(1, 30);
		number.printNumbersDivisibleBy9(1, 100);
		number.printNumbersDivisibleBy2And4(1, 20);
		number.printNumbersDivisibleByAnyDivisor(1, 100, 9);
		number.printSumOfNumbersBetween20To60(20, 60);
		System.out.println(number.findPerfectNumberOrNot(28));
		System.out.println(number.findAllPerfectNumbersBetween2Numbers(1, 1000));
		System.out.println(number.findFactorialOfAGivenNumber(5));
		number.findFactorialOfEveryIndividualDigit(24567480);
		System.out.println(number.findStrongNumber(40585));
		number.findEvenAndOddDigitFactorial(1267);

}
}