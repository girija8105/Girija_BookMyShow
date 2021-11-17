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
public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(name="name")
	private WebElement nameTextField;
	
	@FindBy(xpath="//div[text()='IN - +91']")
	private WebElement countryCodeTextField;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement mobileNumberTextField;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitBtn;

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public void setNameTextField(WebElement nameTextField) {
		this.nameTextField = nameTextField;
	}

	public WebElement getMobileNumberTextField() {
		return mobileNumberTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}

	public WebElement getCountryCodeTextField() {
		return countryCodeTextField;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}
}
