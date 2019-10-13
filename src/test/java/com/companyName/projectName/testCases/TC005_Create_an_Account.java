package com.companyName.projectName.testCases;

import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.companyName.projectName.testBase.TestBase_20July;
import com.companyName.projectName.utilities.CommonMethods;

public class TC005_Create_an_Account extends TestBase_20July{
	
	
	@BeforeClass
	public static void isSkip() {
		
		if(!isExecutable("TC005_Create_an_Account")) 
		throw new SkipException("Skipping Testcase as it's Run Mode is marked as N");
	}
	
	
	@Test(dataProvider="Data_Collections")
	public static void TC005_Create_An_Account(Hashtable<String, String> testData) throws Throwable {
		
	//	launchBrowser();
		
		   CommonMethods.clickOnWebelement("XSignInBtn", "Sign In Button");
		    
		    CommonMethods.writeIntoInputBox("XEmail_add", testData, "Email_ID");
			
			CommonMethods.clickOnWebelement("XCreatAcnt_btn", "Create An Account Button");

		    CommonMethods.clickOnWebelement("XGender", "Mr. Title");
		
		    CommonMethods.writeIntoInputBox("XFirstName", testData, "First_Name");

			CommonMethods.writeIntoInputBox("XLastName", testData, "Last_Name");

			CommonMethods.writeIntoInputBox("Xpwd", testData, "Password");
		
	//closeBrowser();
	
	}
	
}
