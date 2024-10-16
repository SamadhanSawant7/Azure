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

public class AWC001Restricting_WIP_status extends BaseTest {
	static String itemId = null;
	Logger log = LogManager.getLogger(AWC001Restricting_WIP_status.class.getName());

//Creating Item as per given WIP status and checking release status is same as given while creating item
	@Test(priority = 1)
	public void restict_GeneralWIP() throws IOException, InterruptedException {
		log.info("Starting Restricting WIP Status Test");
		log.info("Starting restict_GeneralWIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_GENERAL_WIP"));
		log.info("Item Creation started In Add Popup");
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item created successfully");
			log.info("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			log.info("Reached Advanced Search Page");
			advancedpage.search_Advanced(itemId);
			log.info("Searching for Created Item");
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			log.info("Reached Item Overview Page");
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println("Release Status is --> " + releaseStatus);
			log.info("Release Status is --> " + releaseStatus);
			if (releaseStatus.equals(prop.getProperty("STATUS_GENERAL_WIP"))) {
				System.out.println("Release Status is Matched");
				log.info("Release Status is Matched");
			} else {
				System.out.println("Release Status is not Matched");
				log.error("Release Status is not Matched");
				Assert.fail();
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
			Assert.fail();
		}

	}
/**/
	@Test(priority = 2)
	public void restrict_P0WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_P0WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		log.info("Reached to Folder Page");
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_P0_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_P0_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				log.error("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			log.error("Item Can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 3)
	public void restrict_P1WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_P1WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_P1_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_P1_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				log.error("Release status not matched");
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			log.error("Item Can not be created");
			System.out.println("Item Can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 4)
	public void restrict_P2WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_P2WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_P2_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_P2_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			Assert.fail();
		}
	}

	@Test(priority = 5)
	public void restrict_P3WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_P3WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_P3_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_P3_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			Assert.fail();
		}
	}

	@Test(priority = 6)
	public void restrict_EVT1WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_EVT1WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_EVT1_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_EVT1_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 7)
	public void restrict_EVT2WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_EVT2WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_EVT2_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_EVT2_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 8)
	public void restrict_EVT3WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_EVT3WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_EVT3_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_EVT3_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 9)
	public void restrict_DVT1WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_DVT1WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_DVT1_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_DVT1_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 10)
	public void restrict_DVT2WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_DVT2WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_DVT2_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_DVT2_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 11)
	public void restrict_DVT3WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_DVT3WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_DVT3_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_DVT3_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 12)
	public void restrict_PVT1WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_PVT1WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_PVT1_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item Created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_PVT1_WIP"))) {
				System.out.println("Release status is matched");
			} else {
				System.out.println("Release status not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item Can not be created");
			Assert.fail();
		}

	}

	@Test(priority = 13)
	public void restrict_PVT2WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_PVT2WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId, prop.getProperty("STATUS_PVT2_WIP"));
		if (folderpage.getItemCreationPopup().textContent().contains(prop.getProperty("INPUTITEM"))) {
			System.out.println("Item created Successfully");
			folderpage.to_Advanced_Search();
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Release Status : " + overview.get_release_Status().textContent());
			if (overview.get_release_Status().textContent().equals(prop.getProperty("STATUS_PVT2_WIP"))) {
				System.out.println("Release status is Matched");
			} else {
				System.out.println("Release status is not matched");
				Assert.fail();
			}
		} else {
			System.out.println("Item can not be created");
			Assert.fail();
		}

	}
	/**/
}
