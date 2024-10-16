package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class Attachments {
	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;
	
	public Attachments(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}
	private String addToAttachmentButton = "(//button[@id='Awp0ShowAddObject'])[1]";	
	private String datasetBanner = "(//div[@class='aw-splm-tableCellTop'])[1]";
	private String downloadDatsetBtn = "//aw-icon[@icon-id='cmdDownload' and @class='ng-scope ng-isolate-scope']";
	private String datasetName = "(//div[@class='aw-splm-tableCellText'])[1]";
	private String DatasetSection ="(//div[@class='aw-splm-tableCellTop'])[1]";
	//private String DatasetSection = "//li[@class='aw-widgets-cellListItem aw-widgets-cellTop ng-scope']";
	//private String DatasetSection = "//ul[@class='aw-widgets-cellListWidget aw-layout-flexColumnContainer']";
	private String selectViewBtn = "(//button[@id='objectSetViewModeGroup'])[1]";
	private String tableViewBtn ="//li[@id='objectSetTableViewMode']";
	
	public Locator getDatasetName() {
		return page.locator(datasetName);
	}
	/*
	public Locator getDatasetBanner() {
		return page.locator(datasetBanner);
	}
	*/
	public Locator getDatasetSection() {
		return page.locator(DatasetSection);
	}
	
	public void click_Add_Attachment() {
		page.click(addToAttachmentButton);
	}
	
	public void click_Download_Dataset() {
		page.click(selectViewBtn);
		page.click(tableViewBtn);
		try {
				page.click(DatasetSection);
				// Clicking on Download Button
				
		} catch (Exception e) {
			System.out.println("Dataset not found");
		}
		
	}
}
