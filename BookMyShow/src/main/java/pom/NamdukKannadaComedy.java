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
public class NamdukKannadaComedy {
	
	public NamdukKannadaComedy(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
		
	@FindBy(xpath="//button[text()='Book']")
	private WebElement bookBtn;
	
	@FindBy(xpath="//button[text()='Interested?']")
	private WebElement interestedBtn;

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public WebElement getInterestedBtn() {
		return interestedBtn;
	}
}
