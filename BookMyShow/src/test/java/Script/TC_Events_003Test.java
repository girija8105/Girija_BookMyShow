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
import pom.HomePage;
import pom.PotteryWorkshopsPage;
import pom.RegisterPage;
import pom.TicketOptionsPage;
import pom.WorkshopsPage;

/**
 * 
 * @author girija
 *
 */
@Listeners(ITestListenerImplementation.class)
public class TC_Events_003Test extends BaseClass {

	@Test
	public void workshops() throws InterruptedException, IOException {

		//preconditon
		String url = "https://in.bookmyshow.com/explore/home/bengaluru";
		String homepageTitle ="Movie Tickets, Plays, Sports, Events & Cinemas nearby - BookMyShow";
		String actualEventTitle = "Top Upcoming Events in Bengaluru | Best Live Events in Bengaluru - BookMyShow";
		String actualpotteryWorkshopTitle = "Pottery Workshop(s) for Skill-building and Therapy workshops Event Tickets Mumbai - BookMyShow";
		String actualTicketOptionsTitle = "Ticket options | BookMyShow";	

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

		//step6-validate events title
		String eventTitle = driver.getTitle();
		Assert.assertEquals(actualEventTitle, eventTitle);

		//step7-click on this categories link
		EventsPage events=new EventsPage(driver);
		events.getCategoriesLinkText().click();

		//step8-click on workshop button
		events.getWorkshopBtn().click();

		//step9-click on potteryworkshop text
		WorkshopsPage workshops=new WorkshopsPage(driver);
		workshops.getPotteryWorkshop().click();

		//step10-Wait for the potteryworkshop title
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(actualpotteryWorkshopTitle));

		//step11-validate frontRow Title
		String potteryWorkshopTitle = driver.getTitle();
		Assert.assertEquals(actualpotteryWorkshopTitle, potteryWorkshopTitle);

		//step12-click on register button
		PotteryWorkshopsPage potteryworkshops=new PotteryWorkshopsPage(driver);
		potteryworkshops.getRegisterBtn().click();

		//step13-click on date
		DateAndTimePage dateandtime=new DateAndTimePage(driver);
		dateandtime.getSelectDate26().click();

		//step14-select and click on time button
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(0,500);");
		dateandtime.getSelectTime11pm().click();

		//step15-click on continue button
		dateandtime.getContinueBtn().click();

		//step16-click on add button
		AddTicketsPage add=new AddTicketsPage(driver);
		add.getAddBtnForPotteryWorkshopSession1().click();

		//step17-click on proceed button
		add.getProceedBtn().click();

		//step18 read data from propertyFile
		FileUtil util = new FileUtil();
		String name = util.readPropertyFile("name");
		String mobileNumber = util.readPropertyFile("mobilenumber");
		String email = util.readPropertyFile("emailid");
		RegisterPage register=new RegisterPage(driver);
		register.getNameTextField().sendKeys(name);
		register.getMobileNumberTextField().sendKeys(mobileNumber);
		register.getEmailTextField().sendKeys(email);
		javascriptexecutor.executeScript("window.scrollBy(0,500);");

		//step19-click on checkBox
		register.getCheckBox().click();

		//step20-click on submit button
		register.getSubmitBtn().click();

		//step21-Wait for the page title
		WebDriverWait wait2=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(actualTicketOptionsTitle));

		//step22-validate showdDetails Title
		String TicketOptionsTitle = driver.getTitle();
		Assert.assertEquals(actualTicketOptionsTitle, TicketOptionsTitle);

		//step23-click on proceedtopay button
		TicketOptionsPage ticketoptions=new TicketOptionsPage(driver);
		javascriptexecutor.executeScript("window.scrollBy(0,500);");
		//ticketoptions.getLoginToProceed().click();
		//ticketoptions.getProceedToPayBtn().click();




	}

}
