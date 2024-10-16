package factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
	Playwright playwright;
	Browser browser;
	BrowserContext browserContext;
	Page page;
	Properties prop;
	private static ThreadLocal<Browser> tlBrowser = new ThreadLocal<>();
	private static ThreadLocal<BrowserContext> tlBrowserContext = new ThreadLocal<>();
	private static ThreadLocal<Page> tlPage = new ThreadLocal<>();
	private static ThreadLocal<Playwright> tlPlaywright = new ThreadLocal<>();

	public static Playwright getPlaywright() {
		return tlPlaywright.get();
	}
	public static Page getPage() {
		return tlPage.get();
	}
	public static BrowserContext getBrowserContext() {
		return tlBrowserContext.get();
	}
	public static Browser getBrowser() {
		return tlBrowser.get();
	}
	

	public Page initBrowser(Properties prop) {
		String browserName = prop.getProperty("BROWSER").trim();
		System.out.println("Browser Name : " + browserName);
		tlPlaywright.set(Playwright.create());
		//playwright = Playwright.create();

		switch (browserName.toLowerCase()) {
		case "chromium":
			tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
			//browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "firefox":
			tlBrowser.set(getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)));
			//browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "safari":
			tlBrowser.set(getPlaywright().webkit().launch(new BrowserType.LaunchOptions().setHeadless(false)));
			//browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "chrome":
			tlBrowser.set(getPlaywright().chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false)));
			//browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
			break;
		default:
			System.out.println("Please pass the right browser value");
			break;
		}
		//tlBrowserContext.set(getBrowser().newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("videos/TestVideo "+new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date()))))); 
		tlBrowserContext.set(getBrowser().newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("Cookie/TCappLogin.json"))));
		tlPage.set(getBrowserContext().newPage()); 
		getPage().navigate(prop.getProperty("URL").trim());
		return getPage();
	}
	
	public Properties init_prop() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\userConfig.properties");
		prop = new Properties();
		prop.load(fis);
		return prop;
	}
	
	public static String takeScreenshot() {
		String path = System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
		byte[] buffer = getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
		String base64Path= Base64.getEncoder().encodeToString(buffer);
		return base64Path;
	}
}