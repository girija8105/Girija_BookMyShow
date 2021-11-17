package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author girija
 *
 */
public class SignInPage {
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Continue with mobile number']")
	private WebElement continueMobileTextField;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement  continueBtn;

	public WebElement getContinueMobileTextField() {
		return continueMobileTextField;
	}

	public void setContinueMobileTextField(WebElement continueMobileTextField) {
		this.continueMobileTextField = continueMobileTextField;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
}
