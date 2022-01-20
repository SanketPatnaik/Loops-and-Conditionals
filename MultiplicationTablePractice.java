package com.in28minutes.SelfPractice;

public class MultiplicationTablePractice {
	int table;

	MultiplicationTablePractice() {
	}

	void printMultiplicationTable() {
		printMultiplicationTable(8, 1, 10);
	}

	void printMultiplicationTable(int table) {
		printMultiplicationTable(table, 1, 10);
	}

	void printMultiplicationTable(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}
}
