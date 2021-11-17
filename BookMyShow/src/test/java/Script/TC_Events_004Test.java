package Script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import genericLibrary.BaseClass;
import genericLibrary.ITestListenerImplementation;
import pom.AddTicketsPage;
import pom.ComedyShows;
import pom.DateAndTimePage;
import pom.EventsPage;
import pom.HomePage;
import pom.NamdukKannadaComedy;
import pom.TicketOptionsPage;
/**
 * 
 * @author girija
 *
 */
@Listeners(ITestListenerImplementation.class)
public class TC_Events_004Test extends BaseClass {

	@Test
	public void comedyShows() {

		//preconditon
		String url = "https://in.bookmyshow.com/explore/home/bengaluru";
		String homepageTitle ="Movie Tickets, Plays, Sports, Events & Cinemas nearby - BookMyShow";
		String actualEventTitle = "Top Upcoming Events in Bengaluru | Best Live Events in Bengaluru - BookMyShow";
		String actualNamdukKannadaStandUpTitle = "NamduK - [1 & aaf] Kannada standup comedy comedy-shows Event Tickets Bengaluru - BookMyShow";
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

		//step5-validate events title
		String eventTitle = driver.getTitle();
		Assert.assertEquals(actualEventTitle, eventTitle);

		//step6-click on this categories link
		EventsPage events=new EventsPage(driver);
		events.getCategoriesLinkText().click();

		//step7-click on comedy show button
		events.getComedyShowBtn().click();

		//step8-click on namdukkannadastandup comedy show text
		ComedyShows comedyshows=new ComedyShows(driver);
		comedyshows.getNamdukKannadaStandUpComedy().click();

		//step9-validate frontRow Title
		String namdukKannadaStandUpTitle = driver.getTitle();
		Assert.assertEquals(actualNamdukKannadaStandUpTitle, namdukKannadaStandUpTitle);

		//step10-click on book button
		NamdukKannadaComedy namdukkannadacomedyshow=new NamdukKannadaComedy(driver);
		namdukkannadacomedyshow.getBookBtn().click();

		//step11-select and click on time
		DateAndTimePage dateandtime=new DateAndTimePage(driver);
		dateandtime.getSelectTime7pm().click();

		//step12-click on continue button
		dateandtime.getContinueBtn().click();

		//step13-click on add button
		AddTicketsPage add=new AddTicketsPage(driver);
		add.getAddBtn().click();

		//step14-click on proceed button
		add.getProceedBtn().click();

		//step15- Wait for the page title
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(actualTicketOptionsTitle));

		//step16-validate showdDetails Title
		String TicketOptionsTitle = driver.getTitle();
		Assert.assertEquals(actualTicketOptionsTitle, TicketOptionsTitle);

		//step17-click on proceedtopay button
		TicketOptionsPage ticketoptions=new TicketOptionsPage(driver);
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(0,500);");
		//ticketoptions.getLoginToProceed().click();
		//ticketoptions.getProceedToPayBtn().click();


	}


}
