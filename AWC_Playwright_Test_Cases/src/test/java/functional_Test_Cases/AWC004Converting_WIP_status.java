package functional_Test_Cases;

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

public class AWC004Converting_WIP_status extends BaseTest {
	static String itemId;
	Logger log = LogManager.getLogger(AWC004Converting_WIP_status.class.getName());
//Creating item with any WIP status and converting it to any other WIP status
	@Test(priority=1)
	public void convert_GeneralWIP() throws IOException, InterruptedException {
		log.info("Starting Convert WIP Status Test");
		log.info("Starting convert_GeneralWIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_GENERAL_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}
	
	@Test(priority=2)
	public void convert_P1WIP() throws IOException, InterruptedException {
		log.info("Starting convert_P1WIP Method ");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_P1_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}
	
	@Test(priority=3)
	public void convert_P2WIP() throws IOException, InterruptedException {
		log.info("Starting convert_P2WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_P2_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}
	
	@Test(priority=4)
	public void convert_P3WIP() throws IOException, InterruptedException {
		log.info("Starting convert_P3WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_P3_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}
	
	@Test(priority=5)
	public void convert_EVT1WIP() throws IOException, InterruptedException {
		log.info("Starting convert_EVT1WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_EVT1_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}

	@Test(priority=6)
	public void convert_EVT2WIP() throws IOException, InterruptedException {
		log.info("Starting convert_EVT2WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_EVT2_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}
	
	@Test(priority=7)
	public void convert_EVT3WIP() throws IOException, InterruptedException {
		log.info("Starting convert_EVT3WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_EVT3_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}

	@Test(priority=8)
	public void convert_DVT1WIP() throws IOException, InterruptedException {
		log.info("Starting convert_DVT1WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_DVT1_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}

	@Test(priority=9)
	public void convert_DVT2WIP() throws IOException, InterruptedException {
		log.info("Starting convert_DVT2WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_DVT2_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}

	@Test(priority=10)
	public void convert_DVT3WIP() throws IOException, InterruptedException {
		log.info("Starting convert_DVT3WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_DVT3_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}

	@Test(priority=11)
	public void convert_PVT1WIP() throws IOException, InterruptedException {
		log.info("Starting convert_PVT1WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_PVT1_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}

	@Test(priority=12)
	public void convert_PVT2WIP() throws IOException, InterruptedException {
		log.info("Starting convert_PVT2WIP Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
			}
			overview.clickConvertToBuildWIP();
			overview.convertToBuildWIP(prop.getProperty("STATUS_PVT2_WIP"));
			if(overview.getconversionConfirm().isVisible()) {
				System.out.println((overview.getconversionConfirm().textContent()));
			}else
			{
				System.out.println("Message not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}
}
