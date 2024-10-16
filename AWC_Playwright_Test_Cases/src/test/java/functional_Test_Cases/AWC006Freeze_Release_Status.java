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
import pages.Submit_To_Workflow_Popup;

public class AWC006Freeze_Release_Status extends BaseTest {
	static String itemId;
	Logger log = LogManager.getLogger(AWC006Freeze_Release_Status.class.getName());
//Creating item with any WIP Status and releasing it with EQR or Freeze release status
	/**/
	@Test(priority = 1)
	public void genreal_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting Freeze Release Status Test");
		log.info("Starting genreal_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_GENERAL_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 2)
	public void p0_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting p0_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId= addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_P0_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 3)
	public void p1_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting p1_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_P1_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 4)
	public void p2_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting p2_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_P2_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 5)
	public void p3_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting p3_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_P3_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 6)
	public void dVT1_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting dVT1_WIP_To_EQR Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 7)
	public void dVT2_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting dVT2_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_DVT2_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 8)
	public void Dvt3_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting Dvt3_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId=addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_DVT3_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 9)
	public void eVT1_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting eVT1_WIP_To_EQR Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}
/**/
	@Test(priority = 10)
	public void eVT2_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting eVT2_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_EVT2_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}
/**/
	@Test(priority = 11)
	public void eVT3_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting eVT3_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_EVT3_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 12)
	public void pVT1_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting pVT1_WIP_To_EQR Method");
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}

	@Test(priority = 13)
	public void pVT2_WIP_To_EQR() throws IOException, InterruptedException {
		log.info("Starting pVT2_WIP_To_EQR Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_PVT2_WIP"));
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EQR_RELEASE"));
			if (workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			} else {
				System.out.println("Popup not appeared");
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}

	}
/**/
}
