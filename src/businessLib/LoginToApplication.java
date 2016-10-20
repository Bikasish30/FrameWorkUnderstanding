package businessLib;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import applicationPageFactory.LoginPage;
import genericLib.Driver;
import genericLib.TestDataReader;

public class LoginToApplication {

	LoginPage lpObj;
	TestDataReader tdReader;

	private String testDataFilePath = "Z:\\FrameWorkUnderstanding\\LoginApp\\TestData\\ImmidartTestData.xlsx";
	private String loginTestDataSheetName = "LoginTestData";

	public void loginToApplication() throws IOException {
		lpObj = PageFactory.initElements(Driver.dvr, LoginPage.class);
		tdReader = new TestDataReader();

		lpObj.enterValueInUnerNameField(tdReader.getData(testDataFilePath, loginTestDataSheetName, 1, 0));
		lpObj.enterValueInPasswordField(tdReader.getData(testDataFilePath, loginTestDataSheetName, 1, 1));
		lpObj.clickOnLoginButton();
	}
}
