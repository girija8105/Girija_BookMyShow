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
public class MusicShowsPage {
	
	public MusicShowsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
		
	@FindBy(xpath="//div[text()='B Praak Live']")
	private WebElement bPraakLiveMusicShow;
	
	@FindBy(xpath="//div[text()='DIVINE | Punya Paap Tour']")
	private WebElement divineMusicShow;

	public WebElement getbPraakLiveMusicShow() {
		return bPraakLiveMusicShow;
	}

	public WebElement getDivineMusicShow() {
		return divineMusicShow;
	}
	
	
}
