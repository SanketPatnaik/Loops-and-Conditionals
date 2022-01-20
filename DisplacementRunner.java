package com.in28minutes.SelfPractice;

public class DisplacementRunner {

	public static void main(String[] args) {

		Displacement displacement = new Displacement("12", "8", "10", "4");
		displacement.setDirection('N', 'S', 'E', 'W');
		displacement.findVerticalDistance();
		displacement.findHorizontalDistance();
		displacement.findTotalDistance();

	}

}
