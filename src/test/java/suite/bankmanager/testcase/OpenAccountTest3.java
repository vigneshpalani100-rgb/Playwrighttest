package suite.bankmanager.testcase;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utilities.Constants;
import com.utilities.DataUtil;
import com.utilities.ExcelReader;

public class OpenAccountTest3 {
	
	@Test(dataProvider = "getData")
	public void OpenAccountTest(Hashtable<String,String> data) {
		
			
	}
	
	@DataProvider
	public Object[][] getData(){
		
		
		return DataUtil.getData("OpenAccountTest", new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\BankManagerSuite.xlsx"));
		

		
	}
}
