package basic_Test_Cases;

import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Tracing;

import base.BaseTest;
import factory.PlaywrightFactory;
import pages.Add_Popup;
import pages.Attachments;
import pages.FolderPage;
import pages.HomePage;
import pages.LoginPage;

public class AWC005_Attaching_File_To_Item extends BaseTest{
	
	Logger log = LogManager.getLogger(AWC005_Attaching_File_To_Item.class.getName());


	@Test
	public void attach_File_To_Item() throws IOException {
		log.info("Starting Attaching File to Item Test");
		// Start tracing before creating / navigating a page.
			/*	PlaywrightFactory.getBrowserContext().tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true)
				  .setSources(true));*/
		//loginPage = new LoginPage(page);
		//loginPage.positive_Login();
		log.info("Logged in Successfully...Reached Home Page");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		log.info("Reached Folder Page");
		folderpage.click_Item_Attachment();
		log.info("Item Selected");
		attachments = new Attachments(page);
		log.info("Reached Attachment page");
		attachments.click_Add_Attachment();
		addPopup = new Add_Popup(page);
		log.info("Reached Add popup");
		addPopup.click_Upload_File();
		log.info("Started Uploading File");
		addPopup.click_AddAttachment();
		
		try {
			Assert.assertEquals(attachments.getDatasetName().textContent(),"Test" );
			System.out.println("Dataset attached to Item successfully");
			log.info("Dataset attached to Item successfully");

		} catch (Exception e) {
			System.out.println("Dataset not attached");
			log.error("Dataset not attached");
			Assert.fail();		}
		
		// Stop tracing and export it into a zip archive.
				/*PlaywrightFactory.getBrowserContext().tracing().stop(new Tracing.StopOptions()
				  .setPath(Paths.get("tracing/Attaching_File_To_Item "+new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date())+".zip")));
	*/}
}
