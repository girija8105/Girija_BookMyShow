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
public class EventsPage {
	
	public EventsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//div[text()='Today' and contains(@class,'StyledText')]")
	private WebElement todayBtn;
	
	@FindBy(xpath="//div[text()='Date']/../..//div[text()='Tomorrow' and contains(@class,'StyledText')]")
	private WebElement tomorrowBtn;
	
	@FindBy(xpath="//div[text()='This Weekend' and contains(@class,'StyledText')]")
	private WebElement thisWeekenedBtn;
	
	@FindBy(xpath="//div[text()='Workshops' and contains(@class,'StyledText')]")
	private WebElement workshopBtn;
	
	@FindBy(xpath="//div[text()='Categories']/../..//div[text()='Comedy Shows' and contains(@class,'StyledText')]")
	private WebElement comedyShowBtn;
	
	@FindBy(xpath="//div[text()='Categories']/../..//div[text()='Music Shows' and contains(@class,'StyledText')]")
	private WebElement musicShowsBtn;
	
	@FindBy(xpath="//div[text()='Categories']")
	private WebElement categoriesLinkText;
	
	public WebElement getCategoriesLinkText() {
		return categoriesLinkText;
	}

	public WebElement getTodayBtn() {
		return todayBtn;
	}

	public WebElement getTomorrowBtn() {
		return tomorrowBtn;
	}

	public WebElement getThisWeekenedBtn() {
		return thisWeekenedBtn;
	}

	public WebElement getWorkshopBtn() {
		return workshopBtn;
	}

	public WebElement getComedyShowBtn() {
		return comedyShowBtn;
	}

	public WebElement getMusicShowsBtn() {
		return musicShowsBtn;
	}
	
	

}
