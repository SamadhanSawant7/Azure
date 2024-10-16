package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class HomePage {
	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;
	public HomePage(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}
	private String heading = "//h1[@class='aw-layout-locationTitle aw-layout-flexRow ng-binding']";
	private String folderTile = "//button[@id='Awp0ShowHomeFolder']";
	private String savedSearches = "//div[@ng-class='textClassNames[tile.themeIndex]' and text()='            Saved Searches        ']";
	private String advancedSearch = "//a[@title='Advanced Search']";
	private String globalSearch = "//input[@aria-label='Search Box']";
	private String globalSearchIcon = "(//aw-icon[@icon-id='cmdSearch'])[1]";
	
	public Locator getHeading() {
		return page.locator(heading);
	}
	
	public Locator getSavedSearches() {
		return page.locator(savedSearches);
	}
	
	public void clickOnFolderTile() {
		page.click(folderTile);
	}
	
	public void click_AdvancedSearch() {
		page.click(advancedSearch);
	}
	
	public void global_Search() {
		page.fill(globalSearch, prop.getProperty("GLOBALSEARCHID"));
		//Clicking on search button
		page.click(globalSearchIcon);
	}
}
