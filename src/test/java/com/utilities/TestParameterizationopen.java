package com.utilities;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationopen {

	@Test(dataProvider="getData")
	public void testData(Hashtable<String,String> data) {
		
		System.out.println(data.get("Runmode")+"----"+data.get("customer")+"-----"+data.get("currency")+"----"+data.get("browser"));
	}
	
	
	@DataProvider
	public Object[][] getData(){
ExcelReader excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\BankManagerSuite.xlsx");
		
		int rows = excel.getRowCount(Constants.DATA_SHEET);
		System.out.println("Total rows are:" +rows );
		
		
//		String testName="AddCustomerTest";
		String testName="OpenAccountTest";
		int testCaseRowNum=1;
		
		for(testCaseRowNum=1;testCaseRowNum<=rows;testCaseRowNum++) {
			
//			String testCaseName= excel.getCellData(Constants.DATA_SHEET, 0, testCaseRowNum);
			if(excel.getCellData(Constants.DATA_SHEET, 0, testCaseRowNum).equalsIgnoreCase(testName))
				break;
					
		}
		System.out.println("Test case starts from row num:" +testCaseRowNum);
		
		//checking total rows in test case
		int dataStartRowNum=testCaseRowNum+2;
		
		int testrows=0;
		while(!excel.getCellData(Constants.DATA_SHEET, 0, dataStartRowNum+testrows).equals("")) {
			testrows++;
		}
		
		System.out.println("Total rows of data are:" +testrows);
		
		//checking total rows in test case
		int colStartColNum=testCaseRowNum+1;
		int testcols=0;
//		while(!excel.getCellData(Constants.DATA_SHEET, testcols, colStartColNum+testcols).equals("")) {
		while(!excel.getCellData(Constants.DATA_SHEET, testcols, colStartColNum).equals("")) {
			testcols++;
		}

		
		
		System.out.println("Total columns are:" +testcols);
		
		//printing data
		
		Object[][] data=new Object[testrows][1];
		int i =0;
		for(int rNum=dataStartRowNum;rNum<(dataStartRowNum+testrows);rNum++) {
			
			Hashtable<String,String> table=new Hashtable<String,String>();
			
			for(int cNum=0;cNum<testcols;cNum++) {
				
				
//				System.out.println(excel.getCellData(Constants.DATA_SHEET, cNum, rNum));
				
				String testData=excel.getCellData(Constants.DATA_SHEET, cNum, rNum);
				String colName=excel.getCellData(Constants.DATA_SHEET, cNum, colStartColNum);
				
				table.put(colName, testData);
			}
			
			data[i][0]=table;
			i++;
			
		}
		return data;
		
	}
}
