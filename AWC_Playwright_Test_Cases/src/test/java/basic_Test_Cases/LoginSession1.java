package basic_Test_Cases;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginSession1 {
	
	@Test
	public void login_Method() throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext();
		Page page = context.newPage();
		//Launching url
		page.navigate("localhost:3000/");
		//Typing Username
		page.fill("//input[@name='userName']", "fbtcuser");
		//Typing Password
		page.fill("//input[@type='password']", "fbtcuser");
		//Clicking Login Button
		page.click("//button[@ng-click='login()']");
		page.waitForFunction("()=> document.title !== 'Teamcenter'");
		//Creating Json file to save the session
		context.storageState(new  BrowserContext.StorageStateOptions().setPath(Paths.get("Cookie/TCappLogin.json")));
	}

}
