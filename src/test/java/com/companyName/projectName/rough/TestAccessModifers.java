package com.companyName.projectName.rough;

public class TestAccessModifers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifer_Public accDdf = new AccessModifer_Public(); // yes consuming memory

		accDdf.test1(); // Within a package // public   // Non- Static
		accDdf.test2(); // Within a package // default // Non- Static
		accDdf.test3(); // Within a package //Protected // Non- Static
		
	//	accDdf.test4();
		
		AccessModifer_Public.test1(); // Static -- Not consuming memory 
		AccessModifer_Public.test2(); // Static
		AccessModifer_Public.test3(); // Static
		
		
	}

}
