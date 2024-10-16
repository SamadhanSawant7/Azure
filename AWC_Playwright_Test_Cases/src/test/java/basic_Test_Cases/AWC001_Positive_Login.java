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
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import factory.PlaywrightFactory;
import pages.LoginPage;

public class AWC001_Positive_Login {
	public LoginPage loginPage;
	public Page page;
	public Properties prop;
	public Browser browser;
	
	PlaywrightFactory pf = new PlaywrightFactory();
	
	Logger log = LogManager.getLogger(AWC001_Positive_Login.class.getName());
	
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
	
	@Test
	public void positive_Login() throws IOException {
		
		log.info("Starting Positive Login Test");
		// Start tracing before creating / navigating a page.
				/*PlaywrightFactory.getBrowserContext().tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true)
				  .setSources(true));*/
		loginPage = new LoginPage(page);
		loginPage.positive_Login();
		log.info("Entered username and password");
		log.info("Clicked on Login Button");
		//Waiting till title changes
		page.waitForFunction("()=> document.title !== 'Teamcenter'");
		
		try {
			Assert.assertEquals(page.title(), prop.getProperty("HOMEPAGETITLE"));
			System.out.println("Login Successful.......Test Case Passed");
			log.info("Logged in......Test Case Passed");

		} catch (Exception e) {
			System.out.println("Login Failed......Test Case Failed");
			log.error("Login Failed......Test Case Failed");
			Assert.fail();
			
		}
		// Stop tracing and export it into a zip archive.
			/*	PlaywrightFactory.getBrowserContext().tracing().stop(new Tracing.StopOptions()
				  .setPath(Paths.get("tracing/Negative_Login "+new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date())+".zip")));
*/
	}
	
	@AfterMethod
	public void tearDown() {
		page.context().browser().close();
	}
}
