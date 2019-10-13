package com.companyName.projectName.rough;

public class AccessModifer_Public { // Class level Access Modifier

	protected static String abc ;
	protected String xyz; 
	
	
	public static void test1() { // Method level Access Modifier
   // Add-me -- dgdfgdg565464
		System.out.println("I am in Method 1 which is public Access Modifer");
	}
	
/*	public String test11() {
		return null; // Method level Access Modifier

	}

	public int test123() {
		return 0; // Method level Access Modifier

	}
	
	public boolean test123122() {
		return false;
		
	}
	*/
	
	
	static void test2() {

		System.out.println("I am in Method 2 which is Default Access Modifer"+ abc);
	}

	protected static void test3() {

		System.out.println("I am in Method 3 which protected Access Modifer");
	}

	private static void test4() {
		
		System.out.println("I am in Method 4 which is private Access Modifer");

	}
	
    public static void test5() { // Never this method
		
		System.out.println("I am in Method 4 which is private Access Modifer");
	}

}
