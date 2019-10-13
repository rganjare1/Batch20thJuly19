package com.companyName.projectName.NewPackage;

public class InternetExplorerDriver implements WebDriver{

	@Override
	public void getTitle() {
		
		System.out.println("InternetExplorerDriver:-Write code for getting Title of the page");
		
	}

	@Override
	public void get(String url) {
		System.out.println("**************************************************");
		System.out.println("InternetExplorerDriver:-Write code for navigating to URL");
	}

	
	public void close() {
		System.out.println("InternetExplorerDriver:-Write code for closing the current active window");
		
	}

	
	public void switchTo(String element) {
		System.out.println("InternetExplorerDriver:-Write code for Switching to Window");
		
	}

	
	public void quit() {
		System.out.println("InternetExplorerDriver:-Write code for killing the browser");
		System.out.println("**************************************************");
	}

	public void findElements() {
		System.out.println("InternetExplorerDriver:-Write code for findElements");
		//System.out.println("**************************************************");
	}

	@Override
	public void click() {
		System.out.println("InternetExplorerDriver:-Write code for clicking on Webelement");
		
	}

	@Override
	public void takingScreenShot() {
		System.out.println("InternetExplorerDriver:-Write code for takingScreenShotinChromeDriver");
		
	}

	@Override
	public void reportCreation(String format) {
		// TODO Auto-generated method stub
		
	}

}
