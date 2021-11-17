package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {
	
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByValue(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele);
	}
	
	public void alertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchBack(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

}
