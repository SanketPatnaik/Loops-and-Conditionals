package com.in28minutes.acceptinginputs;

import java.util.Scanner;

public class DayAndMonthRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose the number of the Day ");
		int dayNumber = scanner.nextInt();
		printUsingSwitch(dayNumber);
		determineWeekDay(dayNumber);
		System.out.print("Choose a number for the month ");
		int monthNumber = scanner.nextInt();
		determineNameOfTheMonth(monthNumber);
		System.out.print("Choose the number of the Day ");
		int weekDayNumber = scanner.nextInt();
		printNameOfTheDay(weekDayNumber);

	}

	public static void printUsingSwitch(int dayNumber) {
		switch (dayNumber) {
		case 1:
			System.out.println("The day you chose is Monday");
			break;
		case 2:
			System.out.println("The day you chose is Tuesday");
			break;
		case 3:
			System.out.println("The day you chose is Wednesday");
			break;
		case 4:
			System.out.println("The day you chose is Thursday");
			break;
		case 5:
			System.out.println("The day you chose is Friday");
			break;
		case 6:
			System.out.println("The day you chose is Saturday");
			break;
		case 7:
			System.out.println("The day you chose is Sunday");
			break;
		default:
			System.out.println("Neetu is so Beautiful.");

		}
	}

	public static void determineWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 1:
			System.out.println("Which is a Weekday");
			break;
		case 2:
			System.out.println("Which is a Weekday");
			break;
		case 3:
			System.out.println("Which is a Weekday");
			break;
		case 4:
			System.out.println("Which is a Weekday");
			break;
		case 5:
			System.out.println("Which is a Weekday");
			break;
		case 6:
			System.out.println("Which is not a Weekday");
			break;
		case 7:
			System.out.println("Which is not a Weekday");
			break;
		default:
			System.out.println("Neetu is so Beautiful.");
		}
	}

	public static void determineNameOfTheMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			System.out.println("The month you chose is January");
			break;
		case 2:
			System.out.println("The month you chose is February");
			break;
		case 3:
			System.out.println("The month you chose is March");
			break;
		case 4:
			System.out.println("The month you chose is April");
			break;
		case 5:
			System.out.println("The month you chose is May");
			break;
		case 6:
			System.out.println("The month you chose is June");
			break;
		case 7:
			System.out.println("The month you chose is July");
			break;
		case 8 : System.out.println("The month you chose is August");
		break;
		case 9 : System.out.println("The month you chose is September");
		break;
		case 10 : System.out.println("The month you chose is October");
		break;
		case 11 : System.out.println("The month you chose is November");
		break;
		case 12 : System.out.println("The month you chose is December");
			break;
		default:
			System.out.println("Neetu is so Beautiful.");
		break;
	}
}

public static void printNameOfTheDay(int weekDayNumber) {
	switch (weekDayNumber) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Neetu is so Beautiful.");

	}
}
}