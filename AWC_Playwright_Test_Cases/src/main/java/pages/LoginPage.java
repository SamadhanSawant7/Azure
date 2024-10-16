package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class LoginPage {
	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;

	public LoginPage(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}

	private String userName = "//input[@name='userName']";
	private String passWord = "//input[@type='password']";
	private String loginBtn = "//button[@class='aw-base-button ng-binding']";
	private String errorMessage = "//div[@class='aw-session-errorMessage ng-binding']";
	private String internalErrorMessage = "//div[.='You were not signed in because of an internal error.']";

	
	public String getErrorMessage() {
		return errorMessage;
	}
	// For Positive Login
	public void positive_Login() {
		// Typing UserName
		page.fill(userName, prop.getProperty("USERNAME"));
		// Typing Password
		page.fill(passWord, prop.getProperty("PASSWORD"));
		// Clicking on Login Button
		page.click(loginBtn);
		// Internal error
		int i = 0;
		try {
			if (page.locator(internalErrorMessage).isVisible()) {
				for (; i < 500; i++) {
					page.click(loginBtn);
					continue;
				}
			}
		} catch (Exception e) {

		}
		System.out.println("Time : " + i);

	}

	// For Negative Login
	public void negative_Login() {
		// Typing Invalid UserName
		page.fill(userName, prop.getProperty("USERNAME") + "1");
		// Typing Invalid Password
		page.fill(passWord, prop.getProperty("PASSWORD") + "1");
		// Clicking on Login Button
		page.click(loginBtn);
	}

	public boolean checkHeading() {
		boolean result = page.title().equals(prop.getProperty("LOGINPAGETITLE"));
		return result;
	}

}
