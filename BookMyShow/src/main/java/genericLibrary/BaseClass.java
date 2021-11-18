package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pom.HomePage;
import pom.SignInPage;
/**
 * 
 * @author girija
 *
 */
public class BaseClass {

	public static WebDriver driver;

	//launch and maximize the browser
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void openBrowser(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		} else  {
			System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		Reporter.log("openBrowser",true);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	//Enter url
	@BeforeMethod(alwaysRun = true)
	public void  signIn() throws IOException, InterruptedException {
		FileUtil f=new FileUtil();
		String url = f.readPropertyFile("url");
		//String mobileNumber = f.readPropertyFile("mobilenumber");
		driver.get(url);

		HomePage hompepage=new HomePage(driver);
		hompepage.getNotNowBtn().click();
		hompepage.getSelectBengaluruLocation().click();
		//	hompepage.getSignInBtn().click();

		//		SignInPage si=new SignInPage(driver);
		//		si.getContinueMobileTextField().sendKeys(mobileNumber);
		//		si.getContinueBtn().click();
		Reporter.log("signIn",true);
		//	Thread.sleep(15000);

	}

	@AfterMethod(alwaysRun = true)
	public void  logout() {
	
	}

	//closing the browser
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		Reporter.log("close the browser",true);
		driver.close();

	}
}
