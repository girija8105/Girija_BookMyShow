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
public class AddTicketsPage {
	
	public AddTicketsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//div[text()='Add']")
	private WebElement addBtn;
	
	@FindBy(xpath="//div[text()='For 1 session']/../../..//div[text()='Add']")
	private WebElement addBtnForPotteryWorkshopSession1;
	
	@FindBy(xpath="//div[text()='For 9 session']/../../..//div[text()='Add']")
	private WebElement addBtnForPotteryWorkshopSession9;
	
	@FindBy(xpath="//div[text()='Female - Phase 1']/../../..//div[text()='Add']")
	private WebElement FemaleEarlyBirdmaddBtn;
	
	@FindBy(xpath="//div[text()='Male (Early Bird)']/../../..//div[text()='Add']")
	private WebElement maleEarlyBirdmaddBtn;
	
	public WebElement getFemaleEarlyBirdmaddBtn() {
		return FemaleEarlyBirdmaddBtn;
	}

	public WebElement getMaleEarlyBirdmaddBtn() {
		return maleEarlyBirdmaddBtn;
	}

	public WebElement getAddBtnForPotteryWorkshopSession1() {
		return addBtnForPotteryWorkshopSession1;
	}

	public WebElement getAddBtnForPotteryWorkshopSession9() {
		return addBtnForPotteryWorkshopSession9;
	}

	@FindBy(xpath="//div[@data-id='increment-button']")
	private WebElement plusBtn;
	
	@FindBy(xpath="//div[@data-id='decrement-button']")
	private WebElement minusBtn;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedBtn;

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getPlusBtn() {
		return plusBtn;
	}

	public WebElement getMinusBtn() {
		return minusBtn;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

}
