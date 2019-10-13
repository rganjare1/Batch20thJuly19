package com.companyName.projectName.NewPackage;

public class TestInterface extends AbstractClass{

	public static void main(String[] args) {
		
		AbstractClass.personalDetails();
		
		//AbstractClass.homeLoanDefaulterList();
		
	
		ChromeDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://gamil.com");
		cdriver.getTitle();
		cdriver.switchTo("window");
		cdriver.close();
		cdriver.quit();
		cdriver.takingScreenShot();
		cdriver.findElements();
		cdriver.click();
		cdriver.reportCreation("xlsx");
		cdriver.perticulerToMethod("pdf");	// 
		
		
		FirefoxDriver fdriver = new FirefoxDriver();
		
		fdriver.get("https://gamil.com");
		fdriver.getTitle();
		fdriver.switchTo("window");
		fdriver.close();
		fdriver.quit();
		fdriver.click();		
		fdriver.findElements();
		fdriver.takingScreenShot();
		cdriver.reportCreation("xlsx");
		
		InternetExplorerDriver idriver = new InternetExplorerDriver();
		
		idriver.get("https://gamil.com");
		idriver.getTitle();
		idriver.switchTo("window");
		idriver.close();
		idriver.quit();
		idriver.findElements();		
		idriver.click();
		idriver.takingScreenShot();
		cdriver.reportCreation("xlsx");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homeLoanDefaulterList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interestRate() {
		// TODO Auto-generated method stub
		
	}

}
