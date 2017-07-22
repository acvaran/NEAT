package com.neat.equations;

public class Equations {

	/*
	 * This class holds the mathematical equations that might come in handy in
	 * the neural network calculations.
	 */

	// Returns a random double number between -1 and 1
	// This method will be used to create random weights.
	public static double randomWeight() {
		return (Math.random() * 2) - 1;
	}

	// Returns the sigmoid value of a double number
	public static double sigmoid(double x) {
		return 1 / (1 - Math.pow(Math.E, (-1 * x)));
	}
}
