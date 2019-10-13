package com.companyName.projectName.rough;

import java.util.Hashtable;
import org.testng.annotations.Test;

public class TestHashTable {
	
	@Test
	public static void hashTable() {
		
		//ExcelReader excel = new ExcelReader("E:\\Study Material\\Automation_World-Training\\Training Docs\\Master_Sheet.xlsx");
	
		Hashtable <String, String> htdata = new Hashtable<String, String>(); // Collection in JAVA 
		
		htdata.put("FirstName", "Rahul");
		htdata.put("LastName", "Ganjare");
		htdata.put("Address", "Pune");
		htdata.put("MobileNo", "123454457567");
		
		System.out.println("Values In HashTable:-*** " +htdata );
		
		System.out.println(htdata.get("FirstName"));
		System.out.println(htdata.get("LastName"));
		System.out.println(htdata.get("Address"));
		System.out.println(htdata.get("MobileNo"));
		
		
	}

}
