package com.sample.app.model;

public class EmployeeMinMaxAge {
	private int minAge;
	private int maxAge;

	public EmployeeMinMaxAge(int minAge, int maxAge) {
		super();
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public String toString() {
		return "EmployeeMinMaxAge [minAge=" + minAge + ", maxAge=" + maxAge + "]";
	}

}
