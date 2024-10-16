package basic_Test_Cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Add_Popup;
import pages.FolderPage;
import pages.HomePage;

public class AWC003_Folder_Creation extends BaseTest {

	
	public AWC003_Folder_Creation() throws IOException {
		super();
	}
	
	Logger log = LogManager.getLogger(AWC003_Folder_Creation.class.getName());

	@Test
	public void folder_Creation() throws IOException {
		log.info("Starting Folder Creation Test");
		// Start tracing before creating / navigating a page.
		/*	PlaywrightFactory.getBrowserContext().tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true)
				  .setSources(true));*/
		
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on Add button");
		addPopup = new Add_Popup(page);
		log.info("Reached to Add Popup");
		addPopup.folder_In_Add_Popup();
		
		if(folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTFOLDER"))) {
			System.out.println("Folder Created Successfully");
			log.info("Folder Created Successfully");
		}
		else {
			System.out.println("Folder creation Test Failed");
			log.error("Folder Created Failed");
			Assert.fail();
		}
		/*// Stop tracing and export it into a zip archive.
				PlaywrightFactory.getBrowserContext().tracing().stop(new Tracing.StopOptions()
				  .setPath(Paths.get("tracing/Folder_Creation "+new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date())+".zip")));
	*/
	}
}
