package applicationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import businessLib.LoginToApplication;
import businessLib.OpenApplication;
import genericLib.Driver;

public class LoginAppTest {

	OpenApplication openApplicationBLObject;
	LoginToApplication loginToApplicationBLObject;

	String applicationUrl = "http://kassandra.immidart.com/immidartlite/";

	@Test
	public void loginToAppTest() throws IOException {
		openApplicationBLObject = new OpenApplication();
		loginToApplicationBLObject = new LoginToApplication();

		Driver.OpenBrowser();
		openApplicationBLObject.openApplication(applicationUrl);
		loginToApplicationBLObject.loginToApplication();

	}
}
