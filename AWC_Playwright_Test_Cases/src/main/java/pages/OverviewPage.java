package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class OverviewPage {

	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;

	public OverviewPage(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}

	private String newBtn = "//button[@id='Awp0NewGroup']";
	private String reviseBtn = "//li[@id='Awp0ShowSaveAs']";
	private String release_Status = "(//span[@class='aw-jswidgets-text ng-isolate-scope'])[14]";
	private String secondReleaseStatus = "(//a[@class='aw-widgets-propertyValueLink ng-isolate-scope'])[3]";
	private String overView_redirector = "//aw-command[@id='0' and @title='Open']";
	private String overView_Item_Banner ="(//div[@class='aw-layout-flexRow'])[1]";
			//"//li[@class='aw-widgets-cellListItem aw-widgets-cellTop ng-scope']";
			//"//h3[@class='aw-widgets-cellListCellTitle ng-binding ng-scope ng-isolate-scope']";
	private String convertToBuildWIPBtn = "//button[@id='ConvertToBuildWIP']";
	private String wipStatus = "//div[@class='aw-layout-flexRowContainer aw-widget-iconParent ng-scope']//input[@placeholder='Required']";
	private String statusOption = "//div[@class='aw-widgets-cellListCellText aw-base-small ng-binding']";
	private String saveBtn = "//button[@action='convertAction']";
	private String conversionErrorMsg = "//span[@class='noty_text']";
	private String backToRevisionOne = "(//button[@id='Awp0GoBack'])[1]";
	private String moreBtn = "(//button[@title='More...'])[5]";
	private String manageBtn = "//button[@id='Awp0ManageGroup']";
	private String submitToWorkflow = "//li[@id='Awp0NewWorkflowProcess']";
	private String conversionConfirm = "//span[@class='noty_text']";
	private String content = "//a[@name='1']";
	private String ItemBanner = "(//h3[@id='CellTitle'])[1]";
	private String secondRevnBanner ="(//li[@class='aw-widgets-cellListItem aw-widgets-cellTop ng-scope'])[2]";
	private String secondRevisionredirector ="(//aw-command[@class='ng-scope aw-widgets-cellListCellCommandHover aw-widgets-cellListCellCommandSelected'])[2]";
	
	public Locator get_release_Status() throws InterruptedException {
		Thread.sleep(3000);
		page.waitForSelector(release_Status);
		return page.locator(release_Status);
	}
	
	public Locator getconversionConfirm() {
		page.waitForSelector(conversionConfirm);
		return page.locator(conversionConfirm);
	}

	public Locator getSecondReleaseStatus() {
		return page.locator(secondReleaseStatus);
	}

	public Locator getconversionErrorMsg() {
		page.waitForSelector(conversionErrorMsg);
		return page.locator(conversionErrorMsg);
	}
	
	public void go_To_Content() throws InterruptedException {
		Thread.sleep(4000);
		 page.click(content);
	}

	public void click_On_Revise() throws InterruptedException {
		Thread.sleep(3000);
		page.click(newBtn);
		page.click(reviseBtn);
	}
	
	

	public void open_Item_Details() {
		try {
			//page.click(ItemBanner);
			page.click(overView_Item_Banner);
			page.click(overView_redirector);
			page.click(overView_Item_Banner);
			page.click(overView_redirector);
		} catch (Exception e) {
			System.out.println("Banner not Loaded");
		}

	}

	public void clickConvertToBuildWIP() throws InterruptedException {
		Thread.sleep(2000);
		page.click(convertToBuildWIPBtn);
	}

	public void convertToBuildWIP(String wipInputStatus) throws InterruptedException {
		
		if(wipInputStatus.equals("General WIP"))
		{
			System.out.println(wipInputStatus);
		}
		else {
			Thread.sleep(5000);
			page.fill(wipStatus, wipInputStatus);
			page.click(statusOption);
		}
		
		page.click(saveBtn);
	}

	

	public void sendToWorkflowPage() {
		try {
			//page.click(moreBtn);
		} catch (Exception e) {
			System.out.println("More Button not loaded");			
		}
		
		page.click(manageBtn);
		page.click(submitToWorkflow);
	}
	
	public void open_Item() {
		page.click(ItemBanner);
		page.click("(//aw-command[@id='0'])[5]");
	}
	
	public void clickBackToRevisionOne() {
		page.click(backToRevisionOne);
	}

	public void click_Second_revision() throws InterruptedException {
		page.waitForSelector(secondRevnBanner);
		page.click(secondRevnBanner);
		Thread.sleep(3000);
		page.click(secondRevisionredirector);
	}
}
