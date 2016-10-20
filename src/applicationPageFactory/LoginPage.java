package applicationPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="txtUserId")
	private WebElement emailIDField;
	
	@FindBy(id="txtPassword")
	private WebElement passwordField;
	
	@FindBy(id="btnLogin")
	private WebElement btnSubmit;
	
	public void enterValueInUnerNameField(String userNmame){
		emailIDField.clear();
		emailIDField.sendKeys(userNmame);
	}
	
	public void enterValueInPasswordField(String password){
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton(){
		btnSubmit.click();
	}
	
}
