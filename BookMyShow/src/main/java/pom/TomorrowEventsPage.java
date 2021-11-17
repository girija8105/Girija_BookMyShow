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
public class TomorrowEventsPage {
	
	public TomorrowEventsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='FrontRow Open Mics']")
	private WebElement frontRowEventLink;
	
	@FindBy(xpath="//div[text()='Sunny tunes']")
	private WebElement sunnyTunesEventLink;

	public WebElement getFrontRowEventLink() {
		return frontRowEventLink;
	}

	public WebElement getSunnyTunesEventLink() {
		return sunnyTunesEventLink;
	}
	

}
