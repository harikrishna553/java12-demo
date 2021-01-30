package com.sample.app.switchdemo;

public class SwitchExpressionExample {
	public static void main(String args[]) {
		int number = 2;

		// Prior to Java12
		switch (number) {
		case 2:
			System.out.println("Number is even and prime");
			break;
		case 3:
		case 5:
			System.out.println("You choosen a prime number and it is < 7");
			break;
		case 4:
		case 6:
			System.out.println("You entered even number and it is < 8.");

		default:
			System.out.println("You entered a number");
		}

		// From Java12
		String result = switch (number) {
		case 2 -> "Number is even and prime";
		case 3, 5 -> "You choosen a prime number and it is < 7";
		case 4, 6 -> "You entered even number and it is < 8.";
		default -> "You entered a number";
		};

		System.out.println(result);
	}

}
