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
public class DateAndTimePage {
	
	public DateAndTimePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
		
	@FindBy(xpath="//span[text()='23']")
	private WebElement selectDate23;
	
	@FindBy(xpath="//li[text()='10:00 PM']")
	private WebElement selectTime;
	
	@FindBy(xpath="//span[text()='19']")
	private WebElement selectDate19;
	
	@FindBy(xpath="//span[text()='23']")
	private WebElement selectDate26;
	
	@FindBy(xpath="//li[text()='11:00 AM']")
	private WebElement selectTime11pm;
	
	@FindBy(xpath="//li[text()='7:00 PM']")
	private WebElement selectTime7pm;
	
	@FindBy(xpath="//li[text()='5:00 PM']")
	private WebElement selectTime5pm;
	
	public WebElement getSelectTime7pm() {
		return selectTime7pm;
	}

	public WebElement getSelectTime5pm() {
		return selectTime5pm;
	}

	public WebElement getSelectTime11pm() {
		return selectTime11pm;
	}

	public WebElement getSelectDate26() {
		return selectDate26;
	}

	public WebElement getSelectDate23() {
		return selectDate23;
	}

	public WebElement getSelectDate19() {
		return selectDate19;
	}

	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueBtn;

	public WebElement getSelectTime() {
		return selectTime;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
