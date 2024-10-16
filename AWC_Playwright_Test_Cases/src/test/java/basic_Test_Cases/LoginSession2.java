package basic_Test_Cases;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginSession2 {
	
	@Test
	public void login_Method() throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		//Using the Json file to skip Login part 
		BrowserContext context = browser.newContext(
				new Browser.NewContextOptions().
				setStorageStatePath(Paths.get("Cookie/TCappLogin.json")));
		Page page = context.newPage();
		//Launching url
		page.navigate("localhost:3000/");
		//Starting from Homepage
	    page.click("//button[@id='Awp0ShowHomeFolder']");
		Thread.sleep(3000);
		
	}

}
