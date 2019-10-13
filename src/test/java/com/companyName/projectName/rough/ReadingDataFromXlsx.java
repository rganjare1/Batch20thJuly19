package com.companyName.projectName.rough;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationWorldByRahul.SeleniumTraining.DataCollection;
import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;

public class ReadingDataFromXlsx {
	
	static ExcelReader excel= new ExcelReader("E:\\Study Material\\Automation_World-Training\\Training Docs\\Master_Sheet.xlsx");
	
	@Test(dataProvider = "Data_Collections")
	public void readingDataFromXlsx(Hashtable <String, String> testData) {
		
	//excel = new ExcelReader("E:\\Study Material\\Automation_World-Training\\Training Docs\\Master_Sheet.xlsx");
		
	//excel.addSheet("New_Sheet");
		
	//excel.addColumn("Test_Cases", "Comments");
		
	//excel.removeColumn("Test_Cases", 3);
		
	//System.out.println(excel.getCellData("Test_Cases", 1, 4)); // OOPs concept

    //System.out.println(excel.getCellData("Test_Cases", "Run_Mode", 4));
		
	//excel.getCellData(sheetName, colNum, rowNum)
	
	//excel.setCellData("Test_Cases", "TestCaseName", 7, "NewTestCase_Create_an_Account6");
		
		System.out.println("Value in hashtable:---" +testData);
		
		System.out.println(testData.get("First_Name"));
		System.out.println(testData.get("Last_Name"));
		System.out.println(testData.get("Address"));
		System.out.println(testData.get("Phone_Numer"));
		
	}
	
	 @DataProvider 	
		public static Object[][] Data_Collections() {
			
		//	DataCollection dc = new DataCollection(excel, Constants.TestData_SheetName, testCaseName);
			
			DataCollection dc = new DataCollection(excel , "Test_Data", "TC001_Create_an_Account2222" );
			
			return dc.dataArray();
			// Hash Table	-- htdata
		}	

}
