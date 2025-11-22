package suite.customer.testcase;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utilities.Constants;
import com.utilities.DataProviders;
import com.utilities.DataUtil;
import com.utilities.ExcelReader;

public class OpenAccountTest2 {
	
	@Test(dataProviderClass = DataProviders.class,dataProvider = "customerDP")
	public void OpenAccountTest(Hashtable<String,String> data) {
		
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		System.out.println("Suite:"+DataUtil.isSuiteRunnable("BankManagerSuite"));
		System.out.println("TestCase:"+DataUtil.isTestRunnable("OpenAccountTest2",excel));
		
		System.out.println("Runmode for data:"+data.get("Runmode"));
			
	}
	
	
}
