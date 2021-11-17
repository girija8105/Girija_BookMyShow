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
import pom.BPraakShow;
import pom.EventsPage;
import pom.HomePage;
import pom.MusicShowsPage;
import pom.TicketOptionsPage;
/**
 * 
 * @author girija
 *
 */
@Listeners(ITestListenerImplementation.class)
public class TC_Events_005Test extends BaseClass {

	@Test
	public void musicShows() {


		//preconditon
		String url = "https://in.bookmyshow.com/explore/home/bengaluru";
		String homepageTitle ="Movie Tickets, Plays, Sports, Events & Cinemas nearby - BookMyShow";
		String actualEventTitle = "Top Upcoming Events in Bengaluru | Best Live Events in Bengaluru - BookMyShow";
		String actualBPraakShowTitle = "B Praak Live music-shows Event Tickets Bengaluru - BookMyShow";
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

		//step7-click on music show button
		events.getMusicShowsBtn().click();

		//step8-click on bpraak live music show
		MusicShowsPage musicshows=new MusicShowsPage(driver);
		musicshows.getbPraakLiveMusicShow().click();

		//step9-Wait for the BPraakShow title
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(actualBPraakShowTitle));

		//step10-validate frontRow Title
		String bPraakShowTitle = driver.getTitle();
		Assert.assertEquals(actualBPraakShowTitle, bPraakShowTitle);

		//step11-click on book button
		BPraakShow bpraakshow=new BPraakShow(driver);
		bpraakshow.getBookBtn().click();

		//step12-click on add button
		AddTicketsPage add=new AddTicketsPage(driver);
		add.getFemaleEarlyBirdmaddBtn().click();

		//step13-click on proceed button
		add.getProceedBtn().click();

		//step14-Wait for the page title
		WebDriverWait wait2=new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.titleIs(actualTicketOptionsTitle));

		//step15-validate showdDetails Title
		String TicketOptionsTitle = driver.getTitle();
		Assert.assertEquals(actualTicketOptionsTitle, TicketOptionsTitle);

		//step16-click on proceedtopay button
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		TicketOptionsPage ticketoptions=new TicketOptionsPage(driver);
		javascriptexecutor.executeScript("window.scrollBy(0,500);");
		//ticketoptions.getLoginToProceed().click();
		//ticketoptions.getProceedToPayBtn().click();;


	}

}
