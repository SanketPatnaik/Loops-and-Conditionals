package com.in28minutes.oops;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		// System.out.println(isWeekDay());
		// System.out.println(nameOfMonth());
		// System.out.println(nameOfDay());
		isVowel();
	}

	public static void isVowel() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 26; i++) {
			System.out.println("Enter the character");
			char ch = scan.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'o':
		case 'i':
		case 'u':
		case 'A':
		case 'E':
		case 'O':
		case 'I':
		case 'U':
			System.out.println("The entered character is a vowel.");
			break;
		default:
			System.out.println("The entered character is a consonant.");
			break;
		}
	}
	}

	public static String nameOfMonth() {
		int monthNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the month from 1 to 12 ");
		monthNumber = scan.nextInt();
		System.out.print("The month you chose is ");
		String month;
		switch (monthNumber) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			month = "Invalid Choice";
			break;
		}
		return month;
	}

	public static String nameOfDay() {
		int dayNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the day from 0 to 6 ");
		dayNumber = scan.nextInt();
		System.out.print("The day you chose is ");
		String day;
		switch (dayNumber) {
		case 0:
			day = "Monday";
			break;
		case 1:
			day = "Tuesday";
			break;
		case 2:
			day = "Wednesday";
			break;
		case 3:
			day = "Thursday";
			break;
		case 4:
			day = "Friday";
			break;
		case 5:
			day = "Saturday";
			break;
		case 6:
			day = "Sunday";
			break;
		default:
			day = "Invalid Choice";
			break;
		}
		return day;
	}
}
