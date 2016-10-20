package businessLib;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import applicationPageFactory.LoginPage;
import genericLib.Driver;
import genericLib.PropertyInterface;
import genericLib.TestDataReader;

public class LoginToApplication implements PropertyInterface {

	LoginPage lpObj;
	TestDataReader tdReader;

	public void loginToApplication() throws IOException {
		lpObj = PageFactory.initElements(Driver.dvr, LoginPage.class);
		tdReader = new TestDataReader();

		lpObj.enterValueInUnerNameField(
				tdReader.getData(PropertyInterface.testDataFilePath, PropertyInterface.loginTestDataSheetName, 1, 0));
		lpObj.enterValueInPasswordField(
				tdReader.getData(PropertyInterface.testDataFilePath, PropertyInterface.loginTestDataSheetName, 1, 1));
		lpObj.clickOnLoginButton();
	}
}
