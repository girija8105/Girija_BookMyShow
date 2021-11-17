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
public class ComedyShows {
	
	public ComedyShows(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
		
	@FindBy(xpath="//div[text()='NamduK - [1 & aaf] Kannada standup comedy']")
	private WebElement namdukKannadaStandUpComedy;
	
	@FindBy(xpath="//div[text()='KORAMANGALA COMEDY NIGHTS']")
	private WebElement kormangalaComedyNights;

	public WebElement getNamdukKannadaStandUpComedy() {
		return namdukKannadaStandUpComedy;
	}

	public WebElement getKormangalaComedyNights() {
		return kormangalaComedyNights;
	}

}
