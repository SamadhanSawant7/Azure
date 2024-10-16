package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class FolderPage {
	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;
	
	public FolderPage(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}
	private String newButton = "//button/div[.='New']";
	private String addButton = "//li[@id='Awp0ShowCreateObject']";
			//"(//div[@class='aw-popup-cellContentContainer ng-binding'])[1]";
	private String createdFolder = "(//span[@class='aw-widgets-cellListCellTitle ng-binding ng-scope ng-isolate-scope'])[1]";
	private String createdItem = "(//span[@class='aw-widgets-cellListCellTitle ng-binding ng-scope ng-isolate-scope'])[1]";
	//private String itemToSelect = "//h3[@title='TestARVRPart']";
	private String itemToSelect = "//h3[@title='ZTestPart']";
	private String redirector ="(//div[@class='aw-commands-svg'])[12]";
	private String attachments = "//a[@name='3']";
	private String itemCreationPopup = "//span[@class='noty_text']";
	private String searchIcon = "//aw-icon[@id='cmdSearch' and @title='Expand Search Box']";
	private String advancedSearch = "//a[@title='Advanced Search']";

	public Locator getCreatedFolder() {
		return page.locator(createdFolder);
	}
	
	public Locator getCreatedItem() {
		return page.locator(createdItem);
	}
	
	public Locator getItemCreationPopup() {
		return page.locator(itemCreationPopup);
	}
	
	public void click_OnAddBtn() {
		// Clicking on New Button
		page.click(newButton);
		// Clicking on Add Button
		page.click(addButton);
	}
	
	public void click_Item_Attachment() {
		//Clicking on Item
		page.waitForSelector(itemToSelect);
		page.click(itemToSelect);
		page.click(redirector);
		//Clicking on Attachment Section
		page.click(attachments);
	}
	
	public void to_Advanced_Search() {
		page.click(searchIcon);
		page.click(advancedSearch);
	}
}
