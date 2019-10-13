package com.companyName.projectName.NewPackage;

public class ChromeDriver implements WebDriver { // Abstract class Or Concrete class

	@Override
	public void getTitle() {
		
		System.out.println("ChromeDriver:-Write code for getting Title of the page");
		
	}

	@Override
	public void get(String url) {
		System.out.println("**************************************************");
		System.out.println("ChromeDriver:-Write code for navigating to URL");
	}

	@Override
	public void close() {
		System.out.println("ChromeDriver:-Write code for closing the current active window");
		
	}

	@Override
	public void switchTo(String element) {
		System.out.println("ChromeDriver:-Write code for Switching to Window");
		
	}

	@Override
	public void quit() {
		System.out.println("ChromeDriver:-Write code for killing the browser");
		System.out.println("**************************************************");
	}
	
	public void takingScreenShot() {
		
		System.out.println("ChromeDriver:-Write code for takingScreenShotinChromeDriver");
	}

	@Override
	public void click() {
		System.out.println("ChromeDriver:-Write code for clicking on Webelement");
		
	}

	@Override
	public void findElements() {
		System.out.println("ChromeDriver:-Write code for findElements");
		
	}
	
	public void reportCreation(String html) {
		
		System.out.println("ChromeDriver:-Write code for genrtation report in given format by user");
		
	}
	
   public void perticulerToMethod(String html) {
		
		System.out.println("ChromeDriver:-Write code for genrtation report in given format by user");
		
	}
	
}
