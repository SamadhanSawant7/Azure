package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class SaveAsPage {
	
	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;
	
	public SaveAsPage(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}
	
	private String processFlag = "(//input[@class='aw-jswidgets-choice gwt-ListBox ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required aw-search-dirty'])[3]";
	private String releaseOption = "(//div[@class='aw-widgets-cellListCellText aw-base-small ng-binding'])[2]";
	private String saveBtn = "//button[@class='aw-base-blk-button ng-scope ng-isolate-scope aw-accent-highContrast']";
	private String revisionExceedError="//span[@class='noty_text']";
	private String newSection ="//a[text()='New' and @class='ng-binding aw-base-tabTitle']";
	private String nameTextBox="(//div[@class='aw-widgets-innerWidget']/textarea)[1]";
	private String new_Process_Flag_Textbox ="(//input[@class='aw-jswidgets-choice gwt-ListBox ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required aw-search-dirty'])[2]";
	private String firstOptionInDropdown ="//div[@class='aw-jswidgets-nestingListItemDisplay aw-state-attention']";
	private String new_SaveAsBtn ="//button[@action='saveas']";
	private String save_Confirm_Popup="//span[@class='noty_text']";
	
	private String progressFlagInNewSectn ="//input[@class='aw-jswidgets-choice gwt-ListBox ng-pristine ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-valid-required aw-search-dirty']";
	
	
	
	public void create_Revision(String releaseStatus) throws InterruptedException {
		//page.fill(processFlag,releaseStatus);
		
		if(releaseStatus.equalsIgnoreCase("General WIP"))
		{
			System.out.println(releaseStatus);
		}
		else
		{
			Thread.sleep(5000);
			//page.waitForSelector(new_Process_Flag_Textbox);
			page.fill(new_Process_Flag_Textbox,releaseStatus);
			page.click(releaseOption);
		}
		
		page.click(saveBtn);
	}
	
	public void saveAsNewItem(String newName,String newStatus) throws InterruptedException {
		page.click(newSection);
		page.fill(nameTextBox, newName);
		if(newStatus.equals("General WIP"))
		{
			System.out.println("Selected New Status : "+newStatus);
		}
		else {
		//Thread.sleep(5000);
		page.fill(progressFlagInNewSectn,newStatus);
		page.click(firstOptionInDropdown);
		}
		page.click(new_SaveAsBtn);
		
	}
	
	public Locator getrevisionExceedError() {
		page.waitForSelector(revisionExceedError);
		return page.locator(revisionExceedError);
	}
	
	public Locator getsave_Confirm_Popup() {
		page.waitForSelector(save_Confirm_Popup);
		return page.locator(save_Confirm_Popup);
	}
}
