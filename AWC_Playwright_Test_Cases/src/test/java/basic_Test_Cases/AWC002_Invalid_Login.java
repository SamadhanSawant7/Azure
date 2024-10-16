package basic_Test_Cases;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

import factory.PlaywrightFactory;
import pages.LoginPage;

public class AWC002_Invalid_Login {
	public LoginPage loginPage;
	public Page page;
	public Properties prop;
	public Browser browser;
	
	PlaywrightFactory pf = new PlaywrightFactory();
	
	Logger log = LogManager.getLogger(AWC002_Invalid_Login.class.getName());
	
	@BeforeMethod
	public void setup() throws IOException {
		prop= pf.init_prop();
		String browserName = prop.getProperty("BROWSER").trim();
		Playwright playWright = Playwright.create();
		switch(browserName.toLowerCase()) {
		case "chromium":
		 browser = playWright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		break;
		case "chrome":
		 browser = playWright.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false));
		break;
		default:
			System.out.println("Please pass the right Browser value");
		}
		BrowserContext context = browser.newContext();
		page= context.newPage();
		page.navigate(prop.getProperty("URL").trim());
	}
	
	@AfterMethod
	public void tearDown() {
		page.context().browser().close();
	}
	
	@Test
	public void negative_Login() throws IOException, InterruptedException {
		
		log.info("Starting Negative Login Test");
		
		loginPage = new LoginPage(page);
		loginPage.negative_Login();
		log.info("Entered Invalid username and password");
		log.info("Clicked on Login Button");
		//Waiting till error message 
		page.waitForSelector(loginPage.getErrorMessage());
		
		try {
			Assert.assertEquals(page.title(), prop.getProperty("LOGINPAGETITLE"));
			System.out.println("Login Failed.......Test Case Passed");
			log.info("Log In Failed......Test Case Passed");

		} catch (Exception e) {
			System.out.println("Logged In......Test Case Failed");
			log.error("Logged in ......Test Case Failed");
			Assert.fail();
			
		}
		// Stop tracing and export it into a zip archive.
			/*	PlaywrightFactory.getBrowserContext().tracing().stop(new Tracing.StopOptions()
				  .setPath(Paths.get("tracing/Negative_Login "+new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date())+".zip")));
*/
	}

}
