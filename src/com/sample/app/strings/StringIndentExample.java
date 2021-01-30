package com.sample.app.strings;

public class StringIndentExample {

	public static void main(String args[]) {
		String str = "       Hello World";
		String noIndenation = str.indent(0);
		String indet5Spaces = str.indent(5);
		String indentNegative5Spaces = str.indent(-5);

		System.out.println(str);
		System.out.println(noIndenation);
		System.out.println(indet5Spaces);
		System.out.println(indentNegative5Spaces);

	}

}
