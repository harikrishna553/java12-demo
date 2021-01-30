package com.sample.app.numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactFormExample {

	public static void main(String args[]) {
		NumberFormat indiaCompactFormat = NumberFormat.getCompactNumberInstance(new Locale("hi", "IN"),
				NumberFormat.Style.SHORT);
		NumberFormat usCompactFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		NumberFormat germanCompactFormat = NumberFormat.getCompactNumberInstance(Locale.GERMAN,
				NumberFormat.Style.SHORT);

		String indiaCompactFormatResult = indiaCompactFormat.format(1000);
		String usCompactFormatResult = usCompactFormat.format(1000);
		String germanCompactFormatResult = germanCompactFormat.format(1000);

		System.out.println("locale\tcompactform");
		System.out.println("INDIA\t" + indiaCompactFormatResult);
		System.out.println("US\t" + usCompactFormatResult);
		System.out.println("GERMANY\t" + germanCompactFormatResult);
	}
}
