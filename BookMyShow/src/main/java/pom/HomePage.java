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
public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="wzrk-cancel")
	private WebElement notNowBtn;
	
	@FindBy(xpath="//span[text()='Bengaluru']")
	private WebElement selectBengaluruLocation;
	
	@FindBy(xpath="//span[text()='Hyderabad']")
	private WebElement selectHyderabadLocation;
	
	@FindBy(xpath="//div[text()='Sign in']")
	private WebElement signInBtn;
	
	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getSelectBengaluruLocation() {
		return selectBengaluruLocation;
	}

	public WebElement getSelectHyderabadLocation() {
		return selectHyderabadLocation;
	}

	@FindBy(xpath="//span[contains(text(),'Search for Movies, Events, Plays, Sports and Activities')]")
	private WebElement searchTextField;
	
	@FindBy(xpath="//a[text()='Events']")
	private WebElement eventLink;
	
	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}

	public WebElement getNotNowBtn() {
		return notNowBtn;
	}
	
	public WebElement getEventLink() {
		return eventLink;
	}

}
