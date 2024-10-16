package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class Submit_To_Workflow_Popup {
	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;
	
	public Submit_To_Workflow_Popup(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}

	private String templateTextbox = "//*[@id='aw_toolsAndInfo']/div/aw-include/div/div/div[2]/div/form/form/div[1]/form/aw-listbox/aw-widget/div/div/div/aw-property-val/div/div/aw-property-string-val/div/aw-property-lov-val/div/aw-property-error/div/div/input";
	//private String templateTextbox = "html/body/div[1]/aw-include/div/div/div/div/div/ui-view/aw-showobject-page/div/div/div/div[3]/div/ng-transclude/aw-xrt-sublocation/aw-sublocation/div/div[2]/div/div/div/aw-include/div/div/div[2]/div/form/form/div[1]/form/aw-listbox/aw-widget/div/div/div/aw-property-val/div/div/aw-property-string-val/div/aw-property-lov-val/div/aw-property-error/div/div/input";
	private String firstReleaseOptn = "//div[@class='aw-widgets-cellListCellText aw-base-small ng-binding']";
			//"//div[@class='aw-jswidgets-nestingListItemDisplay aw-state-attention aw-state-selected']";
	private String submitBtn = "//button[@class='aw-base-blk-button ng-scope ng-isolate-scope aw-accent-highContrast']";
	private String errorInWorkflow ="//span[@class='noty_text']";
	
	public void submit_To_Workflow(String releaseStatus) {
		page.click(templateTextbox);
		page.fill(templateTextbox, releaseStatus);
		page.click(firstReleaseOptn);
		page.click(submitBtn);
	}
	
	public Locator getErrorInWorkflow() {
		page.waitForSelector(errorInWorkflow);
		return page.locator(errorInWorkflow);
	}
}
