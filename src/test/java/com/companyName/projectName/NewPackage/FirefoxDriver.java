package com.companyName.projectName.NewPackage;

public class FirefoxDriver implements WebDriver {

	@Override
	public void getTitle() {
		
		System.out.println("FirefoxDriver:-Write code for getting Title of the page");
		
	}

	@Override
	public void get(String url) {
		System.out.println("**************************************************");
		System.out.println("FirefoxDriver:-Write code for navigating to URL");
	}

	@Override
	public void close() {
		System.out.println("FirefoxDriver:-Write code for closing the current active window");
		
	}

	@Override
	public void switchTo(String element) {
		System.out.println("FirefoxDriver:-Write code for Switching to Window");
		
	}

	@Override
	public void quit() {
		System.out.println("FirefoxDriver:-Write code for killing the browser");
		System.out.println("**************************************************");
	}

	public void click() {
		System.out.println("FirefoxDriver:-Write code for clicking the WebElement");
		
	}

	@Override
	public void findElements() {
		System.out.println("FirefoxDriver:-Write code for findElements");
		
	}

	@Override
	public void takingScreenShot() {
		System.out.println("FirefoxDriver:-Write code for takingScreenShotinChromeDriver");
		//System.out.println("**************************************************");
	}

	@Override
	public void reportCreation(String format) {
		// TODO Auto-generated method stub
		
	}

}
