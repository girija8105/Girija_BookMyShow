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
public class WorkshopsPage {
	public WorkshopsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
		
	@FindBy(xpath="//div[contains(text(),'Pottery Workshop(s) for Skill-building')]")
	private WebElement potteryWorkshop;
	
	@FindBy(xpath="//div[text()='Little Picasso” an Kids Art Competition']")
	private WebElement littlePicassoWorkshop;

	public WebElement getPotteryWorkshop() {
		return potteryWorkshop;
	}

	public WebElement getLittlePicassoWorkshop() {
		return littlePicassoWorkshop;
	}

}
