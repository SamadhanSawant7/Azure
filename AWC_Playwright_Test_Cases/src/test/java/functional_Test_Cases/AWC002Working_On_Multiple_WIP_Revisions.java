package functional_Test_Cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Add_Popup;
import pages.AdvancedSearchPage;
import pages.FolderPage;
import pages.HomePage;
import pages.OverviewPage;
import pages.SaveAsPage;

public class AWC002Working_On_Multiple_WIP_Revisions extends BaseTest {
	static String itemId;
	Logger log = LogManager.getLogger(AWC002Working_On_Multiple_WIP_Revisions.class.getName());
	//Creating Item as per given WIP status and creating multiple revisions to check revision limit
	@Test(priority = 1)
	public void work_On_P0_WIP_Revisions() throws IOException, InterruptedException {
		log.info("Starting Working on Multiple WIP Revisions Test");
		log.info("Starting work_On_P0_WIP_Revisions Method");
		// Start tracing before creating / navigating a page.
		/*
		 * PlaywrightFactory.getBrowserContext().tracing().start(new
		 * Tracing.StartOptions() .setScreenshots(true) .setSnapshots(true)
		 * .setSources(true));
		 */

		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_P0_WIP"));
		log.info("Item Creation started In Add Popup");
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item created successfully");
			log.info("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			String release_Status = overview.get_release_Status().textContent();
			System.out.println("First Item Release Status : " + release_Status);
			overview.click_On_Revise();
			saveAs = new SaveAsPage(page);
			saveAs.create_Revision(prop.getProperty("STATUS_P1_WIP"));
			overview.click_On_Revise();
			saveAs.create_Revision(prop.getProperty("STATUS_P2_WIP"));
			if (saveAs.getrevisionExceedError().isVisible()) {
				System.out.println(saveAs.getrevisionExceedError().textContent());
			} else {
				System.out.println("Error not occured");
				Assert.fail();
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
			Assert.fail();
		}
	}

	@Test(priority = 2)
	public void work_On_EVT1_WIP_Revisions() throws IOException, InterruptedException {
		log.info("Starting work_On_EVT1_WIP_Revisions Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_EVT1_WIP"));
		log.info("Item Creation started In Add Popup");
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item created successfully");
			log.info("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			String release_Status = overview.get_release_Status().textContent();
			System.out.println("First Item Release Status : " + release_Status);
			overview.click_On_Revise();
			saveAs = new SaveAsPage(page);
			saveAs.create_Revision(prop.getProperty("STATUS_EVT2_WIP"));
			overview.click_On_Revise();
			saveAs.create_Revision(prop.getProperty("STATUS_EVT3_WIP"));
			if (saveAs.getrevisionExceedError().isVisible()) {
				System.out.println(saveAs.getrevisionExceedError().textContent());
			} else {
				System.out.println("Error not occured");
				Assert.fail();
			}

		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 3)
	public void work_On_DVT1_WIP_Revisions() throws IOException, InterruptedException {
		log.info("Starting work_On_EVT1_WIP_Revisions Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_DVT1_WIP"));
		log.info("Item Creation started In Add Popup");
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item created successfully");
			log.info("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			String release_Status = overview.get_release_Status().textContent();
			System.out.println("First Item Release Status : " + release_Status);
			overview.click_On_Revise();
			saveAs = new SaveAsPage(page);
			saveAs.create_Revision(prop.getProperty("STATUS_DVT2_WIP"));
			overview.click_On_Revise();
			saveAs.create_Revision(prop.getProperty("STATUS_DVT3_WIP"));
			if (saveAs.getrevisionExceedError().isVisible()) {
				System.out.println(saveAs.getrevisionExceedError().textContent());
			} else {
				System.out.println("Error not occured");
				Assert.fail();
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 4)
	public void work_On_PVT1_WIP_Revisions() throws IOException, InterruptedException {
		log.info("Starting work_On_PVT1_WIP_Revisions Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_PVT1_WIP"));
		log.info("Item Creation started In Add Popup");
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item created successfully");
			log.info("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			String release_Status = overview.get_release_Status().textContent();
			System.out.println("First Item Release Status : " + release_Status);
			overview.click_On_Revise();
			saveAs = new SaveAsPage(page);
			saveAs.create_Revision(prop.getProperty("STATUS_PVT2_WIP"));
			overview.click_On_Revise();
			saveAs.create_Revision(prop.getProperty("STATUS_P0_WIP"));
			if (saveAs.getrevisionExceedError().isVisible()) {
				System.out.println(saveAs.getrevisionExceedError().textContent());
			} else {
				System.out.println("Error not occured");
				Assert.fail();
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
			Assert.fail();
		}
	}
}
