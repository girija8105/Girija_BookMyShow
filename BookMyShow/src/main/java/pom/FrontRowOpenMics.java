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
public class FrontRowOpenMics {
	
	public FrontRowOpenMics(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement registerBtn;
	
	@FindBy(xpath="//button[text()='Interested?']")
	private WebElement interestedBtn;

	public WebElement getRegisterBtn() {
		return registerBtn;
	}

	public WebElement getInterestedBtn() {
		return interestedBtn;
	}
	

}
