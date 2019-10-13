package com.companyName.projectName.rough;

public class methodOverloading {

	public static void main(String[] args) {

		test(10, 50);
		test(10, "Rahul");
		test(10, "Deepak", 50);
		test(10, 40, 50);

		// HomeLoanInterestRate(8.5);

	}

	// Bank - HomeLoanInterestRate - SBI -- 8.5%, HDFC - 9.5%, HSBC- 10.5, ICICI -
	// 11.5%

	public static void test(int a) {

		System.out.println("Value in the variable:-" + a);

	}

	public static void test(int a, int b) {
		System.out.println("***********************");
		System.out.println("Value in the variable:-" + a);
		System.out.println("Value in the variable:-" + b);
	}

	public static void test(int a, String x) {

		System.out.println("***********************");
		System.out.println("Value in the variable:-" + a);
		System.out.println("Value in the variable:-" + x);

	}

	// Access Modifier
	public static void test(int a, String e, int c) {

		System.out.println("***********************");
		System.out.println("Value in the variable:-" + a);
		System.out.println("Value in the variable:-" + e);
		System.out.println("Value in the variable:-" + c);

	}

	public static void test(int a, int e, int c) {

		System.out.println("***********************");
		System.out.println("Value in the variable:-" + a);
		System.out.println("Value in the variable:-" + e);
		System.out.println("Value in the variable:-" + c);

	}

	public static void test(int a, String f, int c, int d) {

		System.out.println("***********************");
		System.out.println("Value in the variable:-" + a);
		System.out.println("Value in the variable:-" + f);
		System.out.println("Value in the variable:-" + d);

	}

	public static void testdfdsf(int a, String f, int c, int d) {

		

	}

}
