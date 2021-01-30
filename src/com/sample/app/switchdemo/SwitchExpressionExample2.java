package com.sample.app.switchdemo;

public class SwitchExpressionExample2 {
	public static void main(String args[]) {
		int number = 2;

		
		String result = switch (number) {
		case 2 -> {
			System.out.println("For input 2");
			break "Number is even and prime";
		}
		case 3, 5 -> {
			System.out.println("For input 3 or 5");
			break "You choosen a prime number and it is < 7";
		}
		case 4, 6 -> {
			System.out.println("For input 4 or 6");
			break "You entered even number and it is < 8.";
		}
		default -> {
			System.out.println("No input matched");
			break "You entered a number";
		}
	};

		System.out.println(result);
	}

}
