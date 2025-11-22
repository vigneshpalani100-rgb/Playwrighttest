package suite.bankmanager.testcase;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utilities.Constants;
import com.utilities.DataProviders;
import com.utilities.DataUtil;
import com.utilities.ExcelReader;

public class OpenAccountTest2 {
	
	@Test(dataProviderClass = DataProviders.class,dataProvider = "bankManagerDP")
	public void OpenAccountTest(Hashtable<String,String> data) {
		
			
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
//		System.out.println("Suite:"+DataUtil.isSuiteRunnable("BankManagerSuite"));
//		System.out.println("TestCase:"+DataUtil.isTestRunnable("OpenAccountTest2",excel));
//		
//		System.out.println("Runmode for data:"+data.get("Runmode"));
		
		DataUtil.checkExecution("BankManagerSuite", "OpenAccountTest2", data.get("Runmode"), excel);
//		browser = getBrowser(data.get("browser"));
//		navigate(browser, Constants.URL);
//		click("bmlBtn_CSS");
//		click("openaccount_CSS");
//		select("customer_CSS",data.get("customer"));
//		select("currency_CSS",data.get("currency"));
//		click("process_CSS");

		
	}
	
	
}
