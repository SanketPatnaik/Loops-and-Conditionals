package com.in28minutes.forwhileloop;

public class WhileNumberPlayer {
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUpToLimit() {
		int i = 1;
		int j = 2;
		while (i <= limit) {
			System.out.printf("%d ", i);
			i = (j * j);
			j++;
		}
	}

	public void printCubesUpToLimit() {
		int i = 1;
		int j = 2;
		while (i <= limit) {
			System.out.printf("%d ", i);
			i = (j * j * j);
			j++;
}
}
}
