package com.companyName.projectName.NewPackage;

public interface WebDriver { 

	public void getTitle(); 

	public void get(String url) ;

	public void close() ;

	public void switchTo(String element) ;
	
	public void quit();
	
	public void click();
	
	public void findElements();
	
	public void takingScreenShot();
	
	public void reportCreation(String format); 
	
	public default void reportCreation1(String format) {
		
		System.out.println("I am in interface");
	}

}
