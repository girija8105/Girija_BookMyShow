package Script;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.FileUtil;
import genericLibrary.ITestListenerImplementation;
import pom.AddTicketsPage;
import pom.DateAndTimePage;
import pom.EventsPage;
import pom.FrontRowOpenMics;
import pom.HomePage;
import pom.RegisterPage;
import pom.ShowDetailsPage;
import pom.ThisWekenedPage;

/**
 * 
 * @author girija
 *
 */
@Listeners(ITestListenerImplementation.class)
public class TC_Events_002Test extends BaseClass {

	@Test
	public void thisWeekened() throws IOException, InterruptedException {

		//preconditon
		String url = "https://in.bookmyshow.com/explore/home/bengaluru";
		String homepageTitle ="Movie Tickets, Plays, Sports, Events & Cinemas nearby - BookMyShow";
		String actualEventTitle = "Top Upcoming Events in Bengaluru | Best Live Events in Bengaluru - BookMyShow";
		String actualFrontRowTitle = "FrontRow Open Mics comedy-shows,online-streaming-events Event Tickets Mumbai - BookMyShow";
		String actualShowDetailTitle = "Show details | BookMyShow";	

		//step1-validate url
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(url, currentUrl);

		//step2-validate homepage title
		String actualhomepageTitle = driver.getTitle();
		Assert.assertEquals(homepageTitle, actualhomepageTitle);

		//step3-click on the event link
		HomePage homepage=new HomePage(driver);
		homepage.getEventLink().click();

		//step4-wait until event title
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(actualEventTitle));

		//step4-validate events title
		String eventTitle = driver.getTitle();
		Assert.assertEquals(actualEventTitle, eventTitle);

		//step5-click on this weekened button
		EventsPage events=new EventsPage(driver);
		events.getThisWeekenedBtn().click();

		//step6-click on frontRow event link
		ThisWekenedPage thiswekened=new ThisWekenedPage(driver);
		thiswekened.getFrontRowEventLink().click();

		//step7-validate frontRow Title
		String frontRowTitle = driver.getTitle();
		Assert.assertEquals(actualFrontRowTitle, frontRowTitle);

		//step8-click on register button
		FrontRowOpenMics frontrowopenmicsevent=new FrontRowOpenMics(driver);
		frontrowopenmicsevent.getRegisterBtn().click();

		//step9-click on date
		DateAndTimePage dateandtime=new DateAndTimePage(driver);
		dateandtime.getSelectDate19().click();

		//step10-select and click on time button
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(0,500);");
		dateandtime.getSelectTime().click();

		//step11-click on continue button
		dateandtime.getContinueBtn().click();

		//step12-click on add button and click on increment by 1 by clicking on plus
		AddTicketsPage add=new AddTicketsPage(driver);
		add.getAddBtn().click();
		add.getPlusBtn().click();

		//step13-click on proceed button
		add.getProceedBtn().click();

		//step14-read data from propertyfile
		FileUtil util=new FileUtil();
		String name = util.readPropertyFile("name");
		String mobileNumber = util.readPropertyFile("mobilenumber");
		String email = util.readPropertyFile("emailid");
		RegisterPage register=new RegisterPage(driver);
		register.getNameTextField().sendKeys(name);
		register.getMobileNumberTextField().sendKeys(mobileNumber);
		register.getEmailTextField().sendKeys(email);
		javascriptexecutor.executeScript("window.scrollBy(0,500);");

		//step15-click on checkBox
		register.getCheckBox().click();

		//step16-click on submit button
		register.getSubmitBtn().click();

		//step-17 Wait for the page title
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(actualShowDetailTitle));

		//step18-validate showdDetails Title
		String showDetailsTitle = driver.getTitle();
		Assert.assertEquals(actualShowDetailTitle, showDetailsTitle);

		//step19-click on proceed button
		ShowDetailsPage showdetails=new ShowDetailsPage(driver);
		javascriptexecutor.executeScript("window.scrollBy(0,500);");
		//showdetails.getLoginToProceedBtn().click();
		//showdetails.getProceedBtn().click();
	}

}
