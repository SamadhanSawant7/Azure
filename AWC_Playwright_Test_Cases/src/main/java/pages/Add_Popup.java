package pages;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class Add_Popup {
	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;
	
	
	public Add_Popup(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}
	
	private String folderOption = "//div[@title='Folder' and @class='aw-tcWidgets-modelTypeCellTitle ng-binding']";
	private String folderNameTextBox = "//input[@type='text' and @class='aw-widgets-propertyEditValue ng-pristine ng-untouched ng-scope ng-isolate-scope ng-empty ng-invalid ng-invalid-required ng-valid-maxlength ng-invalid-aw-required']";
	private String addFolderButton = "(//button[@action='createObject'])[1]";
	private String aRVRPart = "(//div[@title='ARVR Part' and @class='aw-tcWidgets-modelTypeCellTitle ng-binding'])[2]";
	private String itemNameTextBox = "//textarea[@class='aw-widgets-propertyEditValue ng-pristine ng-untouched ng-scope ng-isolate-scope ng-empty ng-invalid ng-invalid-required ng-valid-maxlength ng-invalid-aw-required']";
	private String addItemButton = "//button[@class='aw-base-blk-button ng-scope ng-isolate-scope aw-accent-highContrast']";
	private String upload = "//input[@type='file']";
	private String addAttachment = "//button[@action='createObject']";
	private String item_progressFlag ="//div[contains(@class,'aw-layout-flexRowContainer aw-widget-iconParent ng-scope')]//input[@placeholder='Required']";
	private String item_ProgressFlagList="//div[contains(@class,'aw-jswidgets-listboxDrop')]/ul[@class='aw-widgets-cellListWidget']/li";
	
	
	public void folder_In_Add_Popup() {
		// Clicking on Folder Option
		page.click(folderOption);
		// Typing Name for folder
		page.fill(folderNameTextBox,prop.getProperty("INPUTFOLDER"));
		// Clicking on Add button
		page.click(addFolderButton);
	}
	
	public String item_In_Add_Popup(String itemId,String releaseStatus) throws IOException {
		//Selecting Alpha Item Option
		page.click(aRVRPart);
		//Selecting process flag
		if(releaseStatus.equals("General WIP"))
		{
			System.out.println("Selected Release Status : "+releaseStatus);
		}
		else {
			page.fill(item_progressFlag, releaseStatus);
			page.click("(//div[@class='aw-widgets-cellListCellText aw-base-small ng-binding' ])[5]");
		}
		//Typing Name for Item
		page.fill(itemNameTextBox, prop.getProperty("INPUTITEM"));
		//Clicking on Add Button
		page.click(addItemButton);
		FolderPage folderPage = new FolderPage(page);
		String popup = folderPage.getItemCreationPopup().textContent();
		 String[] splittedPop = popup.split("-", 6);
		 String[] id = splittedPop[0].split("\"");
		  itemId= id[1];
		  return itemId;
	}
	
	public void click_Upload_File() {
		page.setInputFiles(upload,
				Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\uploads\\Test.txt"));
	}
	
	public void click_AddAttachment() {
		page.click(addAttachment);
	}
}
