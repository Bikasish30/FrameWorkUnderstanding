package applicationPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="EmailID")
	private WebElement emailIDField;
	
	@FindBy(id="Password")
	private WebElement passwordField;
	
	@FindBy(id="btnSubmit")
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
