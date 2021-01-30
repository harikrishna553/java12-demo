package com.sample.app.streams;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.teeing;

import java.util.Arrays;
import java.util.List;

import com.sample.app.model.EmployeeMinMaxAge;

public class TeeingExample {

	public static void main(String args[]) {
		List<Integer> employeeAges = Arrays.asList(19, 23, 44, 35, 36, 65, 50, 43);

		EmployeeMinMaxAge empMinAndMaxAge = employeeAges.stream()
				.collect(teeing(minBy(Integer::compareTo), maxBy(Integer::compareTo), (minAge, maxAge) -> {
					return new EmployeeMinMaxAge(minAge.get(), maxAge.get());
				}));

		System.out.println(empMinAndMaxAge);
	}

}
