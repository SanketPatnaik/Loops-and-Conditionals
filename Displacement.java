package com.in28minutes.SelfPractice;

import java.math.BigDecimal;

public class Displacement {
	BigDecimal distance1;
	BigDecimal distance2;
	BigDecimal distance3;
	BigDecimal distance4;
	private char direction1;
	private char direction2;
	private char direction3;
	private char direction4;
	BigDecimal verticalDistance;
	BigDecimal horizontalDistance;
	BigDecimal totalDistance;


	public Displacement(String distance1, String distance2, String distance3, String distance4) {
		this.distance1 = new BigDecimal(distance1);
		this.distance2 = new BigDecimal(distance2);
		this.distance3 = new BigDecimal(distance3);
		this.distance4 = new BigDecimal(distance4);
	}

	public void setDirection(char direction1, char direction2, char direction3, char direction4) {
		this.direction1=direction1;
		this.direction2=direction2;
		this.direction3=direction3;
		this.direction4 = direction4;
	}

	public BigDecimal findVerticalDistance() {

		if (direction1 == 'N' | direction1 == 'S' & direction2 == 'N' | direction2 == 'S') {
			BigDecimal verticalDistance = distance1.subtract(distance2);
		} else if (direction1 == 'N' | direction1 == 'S' & direction3 == 'N' | direction3 == 'S') {
			BigDecimal verticalDistance = distance1.subtract(distance3);
		} else if (direction1 == 'N' | direction1 == 'S' & direction4 == 'N' | direction4 == 'S') {
			BigDecimal verticalDistance = distance1.subtract(distance4);
		} else if (direction2 == 'N' | direction2 == 'S' & direction3 == 'N' | direction3 == 'S') {
			BigDecimal verticalDistance = distance2.subtract(distance3);
		} else if (direction2 == 'N' | direction2 == 'S' & direction4 == 'N' | direction4 == 'S') {
			BigDecimal verticalDistance = distance2.subtract(distance4);
		} else if (direction3 == 'N' | direction3 == 'S' & direction4 == 'N' | direction4 == 'S') {
			BigDecimal verticalDistance = distance3.subtract(distance4);
		} else {
			System.out.println("Inputs are wrong");
		}
		return verticalDistance;

	}

	public BigDecimal findHorizontalDistance() {

		if (direction1 == 'E' | direction1 == 'W' & direction2 == 'E' | direction2 == 'W') {
			BigDecimal horizontalDistance = distance1.subtract(distance2);
		} else if (direction1 == 'E' | direction1 == 'W' & direction3 == 'E' | direction3 == 'W') {
			BigDecimal horizontalDistance = distance1.subtract(distance3);
		} else if (direction1 == 'E' | direction1 == 'W' & direction4 == 'E' | direction4 == 'W') {
			BigDecimal horizontalDistance = distance1.subtract(distance4);
		} else if (direction2 == 'E' | direction2 == 'W' & direction3 == 'E' | direction3 == 'W') {
			BigDecimal horizontalDistance = distance2.subtract(distance3);
		} else if (direction2 == 'E' | direction2 == 'W' & direction4 == 'E' | direction4 == 'W') {
			BigDecimal horizontalDistance = distance2.subtract(distance4);
		} else if (direction3 == 'E' | direction3 == 'W' & direction4 == 'E' | direction4 == 'W') {
			BigDecimal horizontalDistance = distance3.subtract(distance4);
		} else {
			System.out.println("Inputs are wrong");
		}
		return horizontalDistance;
	}

	public void findTotalDistance() {
		BigDecimal totalDistance = verticalDistance.multiply(verticalDistance).add(horizontalDistance)
				.multiply(horizontalDistance);
		System.out.println(totalDistance);
	}
}