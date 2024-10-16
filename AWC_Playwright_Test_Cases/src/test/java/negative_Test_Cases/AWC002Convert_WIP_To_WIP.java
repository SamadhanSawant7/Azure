package negative_Test_Cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Add_Popup;
import pages.AdvancedSearchPage;
import pages.FolderPage;
import pages.HomePage;
import pages.OverviewPage;
import pages.SaveAsPage;

public class AWC002Convert_WIP_To_WIP extends BaseTest {
	static String itemId;
	Logger log = LogManager.getLogger(AWC002Convert_WIP_To_WIP.class.getName());
	//Creating Item with any WIP and Converting the Status to Higher WIP status
	@Test(priority = 1)
	public void convertWIP_P0WIP() throws IOException, InterruptedException {
		log.info("Starting Convert WIP To WIP Status Test");
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
			System.out.println("Advanced Search Page");
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			System.out.println("Searched for created item");
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Reached to Overview Page");
			overview.click_On_Revise();
			System.out.println("Clicked on Revise Button");
			SaveAsPage saveas = new SaveAsPage(page);
			saveas.create_Revision(prop.getProperty("STATUS_P1_WIP"));
			System.out.println("Creating revision");
			overview.clickBackToRevisionOne();
			System.out.println("Back to first Revision");
			overview.click_Second_revision();
			overview.clickConvertToBuildWIP();
			System.out.println("Converting to other WIP");
			overview.convertToBuildWIP(prop.getProperty("STATUS_P1_WIP"));
			String errorMsg = overview.getconversionErrorMsg().textContent();
			System.out.println(errorMsg);
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 2)
	public void convertWIP_EVT1_WIP() throws IOException, InterruptedException {
		log.info("Starting Convert WIP To WIP Status Test");
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
			overview.click_On_Revise();
			SaveAsPage saveas = new SaveAsPage(page);
			saveas.create_Revision(prop.getProperty("STATUS_EVT2_WIP"));
			overview.clickBackToRevisionOne();
			overview.click_Second_revision();
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_EVT2_WIP"));
			String errorMsg = overview.getconversionErrorMsg().textContent();
			System.out.println(errorMsg);
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 3)
	public void convertWIP_DVT1_WIP() throws IOException, InterruptedException {
		log.info("Starting Convert WIP To WIP Status Test");
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
			overview.click_On_Revise();
			SaveAsPage saveas = new SaveAsPage(page);
			saveas.create_Revision(prop.getProperty("STATUS_DVT2_WIP"));
			overview.clickBackToRevisionOne();
			overview.click_Second_revision();
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_DVT2_WIP"));
			String errorMsg = overview.getconversionErrorMsg().textContent();
			System.out.println(errorMsg);
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 4)
	public void convertWIP_PVT1_WIP() throws IOException, InterruptedException {
		log.info("Starting Convert WIP To WIP Status Test");
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
			overview.click_On_Revise();
			SaveAsPage saveas = new SaveAsPage(page);
			saveas.create_Revision(prop.getProperty("STATUS_PVT2_WIP"));
			overview.clickBackToRevisionOne();
			overview.click_Second_revision();
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_PVT2_WIP"));
			String errorMsg = overview.getconversionErrorMsg().textContent();
			System.out.println(errorMsg);
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

}