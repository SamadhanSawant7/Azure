package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class AddChildForm {
	
	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;
	
	public AddChildForm(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();	
		}
	
	private String processFlag = "(//input[@class='aw-jswidgets-choice gwt-ListBox ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required aw-search-dirty'])[2]";
	private String firstOptnInProcessFlag = "(//div[@class='aw-widgets-cellListCellText aw-base-small ng-binding' ])[5]";
	private String nameTextBox = "(//div[@class='aw-widgets-innerWidget']/textarea)[2]";
	private String addBtn ="//button[@class='aw-base-blk-button ng-scope ng-isolate-scope aw-accent-highContrast']";
	private String confirmMsg ="//span[@class='noty_text']";
	
	public void createChildInAddForm(String status,String childName) {
		if(status.equals("General WIP"))
		{
			System.out.println("Selected Release Status : "+status);
		}
		else {
			page.fill(processFlag, status);
			page.click(firstOptnInProcessFlag);
		}
		page.fill(nameTextBox, childName);
		page.click(addBtn);
	}
	
	public Locator getconfirmMsg() {
		page.waitForSelector(confirmMsg);
		return page.locator(confirmMsg);
	}
	
	
}
