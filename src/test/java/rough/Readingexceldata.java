package rough;

import com.utilities.Constants;
import com.utilities.ExcelReader;

public class Readingexceldata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExcelReader excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\BankManagerSuite.xlsx");
		
		int rows = excel.getRowCount(Constants.DATA_SHEET);
		System.out.println("Total rows are:" +rows );
		
		
//		String testName="AddCustomerTest";
		String testName="OpenAccountTest";
		int testCaseRowNum=1;
		
		for(testCaseRowNum=1;testCaseRowNum<=rows;testCaseRowNum++) {
			
			String testCaseName= excel.getCellData(Constants.DATA_SHEET, 0, testCaseRowNum);
			if(testCaseName.equalsIgnoreCase(testName))
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
		int colStartColNum=testCaseRowNum+2;
		int testcols=0;
		while(!excel.getCellData(Constants.DATA_SHEET, testcols, colStartColNum+testcols).equals("")) {
			testcols++;
		}
		
		System.out.println("Total columns are:" +testcols);
		
		//printing data
		for(int rNum=dataStartRowNum;rNum<(dataStartRowNum+testrows);rNum++) {
			
			for(int cNum=0;cNum<testcols;cNum++) {
				
				System.out.println(excel.getCellData(Constants.DATA_SHEET, cNum, rNum));
			}
		}
		
	}

}
