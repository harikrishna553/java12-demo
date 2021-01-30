package com.sample.app.numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactFormStylesExample {
	public static void main(String args[]) {
		long thousand = 1000l;
		long tenThousand = 10000l;
		long oneLaksh = 100000l;
		long tenLaksh = 1000000l;
		long oneCrore = 10000000l;
		long tenCrore = 100000000l;
		long hundredCrore = 1000000000l;
		long thousandCrore = 10000000000l;

		NumberFormat usShortStyle = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		NumberFormat usLongStyle = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

		System.out.println("number\t\tshort_form\tlong_form");
		System.out.println(thousand + "\t\t" + usShortStyle.format(thousand) + "\t\t" + usLongStyle.format(thousand));
		System.out.println(
				tenThousand + "\t\t" + usShortStyle.format(tenThousand) + "\t\t" + usLongStyle.format(tenThousand));
		System.out.println(oneLaksh + "\t\t" + usShortStyle.format(oneLaksh) + "\t\t" + usLongStyle.format(oneLaksh));
		System.out.println(tenLaksh + "\t\t" + usShortStyle.format(tenLaksh) + "\t\t" + usLongStyle.format(tenLaksh));
		System.out.println(oneCrore + "\t" + usShortStyle.format(oneCrore) + "\t\t" + usLongStyle.format(oneCrore));
		System.out.println(tenCrore + "\t" + usShortStyle.format(tenCrore) + "\t\t" + usLongStyle.format(tenCrore));
		System.out.println(hundredCrore + "\t" + usShortStyle.format(hundredCrore) + "\t\t" + usLongStyle.format(hundredCrore));
		System.out.println(thousandCrore + "\t" + usShortStyle.format(thousandCrore) + "\t\t" + usLongStyle.format(thousandCrore));

		
	}

}
