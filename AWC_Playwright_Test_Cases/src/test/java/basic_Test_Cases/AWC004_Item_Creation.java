package basic_Test_Cases;

import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.Test;

import com.microsoft.playwright.Tracing;

import base.BaseTest;
import factory.PlaywrightFactory;
import pages.Add_Popup;
import pages.FolderPage;
import pages.HomePage;
import pages.LoginPage;

public class AWC004_Item_Creation extends BaseTest {

	public AWC004_Item_Creation() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	Logger log = LogManager.getLogger(AWC004_Item_Creation.class.getName());
	static String itemId;

	@Test
	public void item_Creation() throws IOException {
		log.info("Item Creation Test started");
		// Start tracing before creating / navigating a page.
			/*PlaywrightFactory.getBrowserContext().tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true)
				  .setSources(true));*/	
		
		log.info("logged In successfully...Reached Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("RELEASE_STATUS"));
		log.info("Item Creation started In Add Popup");
		
		if(folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM")))
		{
			System.out.println("Item created successfully");
			log.info("Item Created Successfully");
		}else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		// Stop tracing and export it into a zip archive.
			/*PlaywrightFactory.getBrowserContext().tracing().stop(new Tracing.StopOptions()
				  .setPath(Paths.get("tracing/Item_Creation "+new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date())+".zip")));
	*/	}
}
