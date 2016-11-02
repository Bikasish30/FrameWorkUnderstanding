package applicationTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import businessLib.AddFinanceTracker;
import businessLib.LoginToApplication;
import businessLib.TestFinance;
import genericLib.ApplicationGenericMethods;
import genericLib.Driver;

public class LoginAppTest {

	ApplicationGenericMethods openApplicationBLObject;
	LoginToApplication loginToApplicationBLObject;
	AddFinanceTracker addFinanceTrackerObject;
	
	@BeforeTest
	public void beforeTestMethod() {
		Driver.OpenBrowser();
		openApplicationBLObject = new ApplicationGenericMethods();
		openApplicationBLObject.openApplication();
	}

	@Test
	public void loginToAppTest() throws Exception {
		loginToApplicationBLObject = new LoginToApplication();
		openApplicationBLObject.openApplication();
		loginToApplicationBLObject.loginToApplication();

		//addFinanceTrackerObject = new AddFinanceTracker();
		//addFinanceTrackerObject.addFinanceTracker();
		
		TestFinance obj = new TestFinance();
		obj.testFinance();	
	}
}
