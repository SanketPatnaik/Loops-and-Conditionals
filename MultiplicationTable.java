package com.in28minutes.multiplicationtable;

public class MultiplicationTable {

	public void printTable(int table) {
		for (int i = 1; i <= table; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
}
}
