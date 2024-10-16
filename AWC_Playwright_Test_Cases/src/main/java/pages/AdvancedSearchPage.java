package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class AdvancedSearchPage {
	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;
	public AdvancedSearchPage(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}
	
	private String itemIDTextBox ="(//textarea[@class='aw-widgets-propertyEditValue ng-pristine ng-untouched ng-valid ng-scope ng-isolate-scope ng-empty ng-valid-required ng-valid-maxlength ng-valid-aw-required'])[1]";
	private String searchButton = "//button[@action='doQuickSearch']";
	private String itemSearchResult = "//label[@class='aw-widgets-cellListCellItemType aw-base-small ng-scope ng-isolate-scope']";
	private String searchCriteria = "(//input[@type='text'])[4]";
	private String item_Name_Option ="//div[@class='aw-widgets-cellListCellText aw-base-small ng-binding' and @title='Item Name']";
	private String itemNameTextBox ="(//textarea[@class='aw-widgets-propertyEditValue ng-pristine ng-untouched ng-valid ng-scope ng-isolate-scope ng-empty ng-valid-required ng-valid-maxlength ng-valid-aw-required'])[1]";
	private String search_Result_First ="//li[@class='aw-widgets-cellListItem aw-widgets-cellTop ng-scope aw-widgets-cellListItemSelected']";
	private String redirector = "(//button[@id='Awp0ShowObjectCell'])[1]";	
	
	public Locator getItemSearchResult() {
		return page.locator(itemSearchResult);
	}
	public void search_Advanced(String itemId) {
		// Typing Item Id for search
		page.fill(itemIDTextBox, itemId);
		// Clicking on Search Button
		page.click(searchButton);
	}
	
	
	public void search_Item() {
		page.click(searchCriteria);
		page.click(item_Name_Option);
		page.fill(itemNameTextBox,prop.getProperty("ADVANCEDSEARCHNAME"));
		page.click(searchButton);
		page.click(search_Result_First);
		page.click(redirector);
		
	}
	
	public void search_Item_Adv(String itemId) {
		
		page.fill(itemIDTextBox,itemId);
		page.click(searchButton);
		page.click(search_Result_First);
		page.click(redirector);
		
	}
	
	public void redirect_To_Overview() throws InterruptedException {
		Thread.sleep(3000);
		page.click(search_Result_First);
		page.click(redirector);
		
	}
}
