package com.sample.app.strings;

public class StringTransformExample1 {

	public static void main(String args[]) {
		String str = "aa123ajbd134aa";

		int noOfDigits = str.transform((s) -> {
			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {
					count++;
				}
			}
			return count;
		});

		String stringInUpperCase = str.transform(s -> s.toUpperCase());
		String stringInUpperCasePlus5SpacesIndentation = str.transform(s -> s.toUpperCase().indent(5));

		String name = "Krishna";
		String welcomeMessage = name.transform(s -> "Welcome Mr. " + s.toUpperCase());

		System.out.println("noOfDigits : " + noOfDigits);
		System.out.println("stringInUpperCase : " + stringInUpperCase);
		System.out.println("stringInUpperCasePlus5SpacesIndentation : " + stringInUpperCasePlus5SpacesIndentation);
		System.out.println("welcomeMessage : " + welcomeMessage);
	}

}
