package com.sample.app.strings;

public class StringIndentExample2 {

	private static String getIndentedString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n");
		builder.append("\"id\": 123,".indent(2));
		builder.append("\"name\": {".indent(2));
		builder.append("\"firstName\" : \"Krishna\",".indent(4));
		builder.append("\"lastName\" : \"Gurram\"".indent(4));
		builder.append("}".indent(2));
		builder.append("}");

		return builder.toString();
	}

	public static void main(String args[]) {
		String s = getIndentedString();
		System.out.println(s);
	}

}
