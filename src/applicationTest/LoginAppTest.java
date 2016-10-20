package applicationTest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import businessLib.LoginToApplication;
import genericLib.ApplicationGenericMethods;
import genericLib.Driver;

public class LoginAppTest {

	ApplicationGenericMethods openApplicationBLObject;
	LoginToApplication loginToApplicationBLObject;

	@BeforeTest
	public void beforeTestMethod() {
		Driver.OpenBrowser();
		openApplicationBLObject = new ApplicationGenericMethods();
		openApplicationBLObject.openApplication();
	}

	@Test
	public void loginToAppTest() throws IOException {
		loginToApplicationBLObject = new LoginToApplication();
		openApplicationBLObject.openApplication();
		loginToApplicationBLObject.loginToApplication();

	}
}
