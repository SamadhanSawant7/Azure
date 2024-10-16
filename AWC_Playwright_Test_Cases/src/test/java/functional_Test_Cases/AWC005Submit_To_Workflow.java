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

public class AWC005Submit_To_Workflow extends BaseTest {
//Creating item with any WIP status and Submitting it to the Workflow with same release status
	static String itemId;
	Logger log = LogManager.getLogger(AWC005Submit_To_Workflow.class.getName());

	@Test(priority = 1)
	public void PO_Release() throws IOException, InterruptedException {
		log.info("Starting Submit to Workflow Test");
		log.info("Starting PO_Release Method");
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
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("PROTO_0_RELEASE"));
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
	public void P1_Release() throws IOException, InterruptedException {

		log.info("Starting P1_Release Method");
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
			workflowPage.submit_To_Workflow(prop.getProperty("PROTO_1_RELEASE"));
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
	public void P2_Release() throws IOException, InterruptedException {

		log.info("Starting P2_Release Method");
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
			workflowPage.submit_To_Workflow(prop.getProperty("PROTO_2_RELEASE"));
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
	public void P3_Release() throws IOException, InterruptedException {

		log.info("Starting P3_Release Method");
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
			workflowPage.submit_To_Workflow(prop.getProperty("PROTO_3_RELEASE"));
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
	public void EVT1_Release() throws IOException, InterruptedException {

		log.info("Starting EVT1_Release Method");
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
			workflowPage.submit_To_Workflow(prop.getProperty("EVT_1_RELEASE"));
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
	public void EVT2_Release() throws IOException, InterruptedException {

		log.info("Starting EVT2_Release Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId= addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_EVT1_WIP"));
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
			workflowPage.submit_To_Workflow(prop.getProperty("EVT_2_RELEASE"));
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
	public void EVT3_Release() throws IOException, InterruptedException {

		log.info("Starting EVT3_Release Method");
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
			workflowPage.submit_To_Workflow(prop.getProperty("EVT_3_RELEASE"));
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
	public void DVT1_Release() throws IOException, InterruptedException {

		log.info("Starting DVT1_Release Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId= addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_DVT1_WIP"));
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
			workflowPage.submit_To_Workflow(prop.getProperty("DVT_1_RELEASE"));
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
	public void DVT2_Release() throws IOException, InterruptedException {

		log.info("Starting DVT2_Release Method");
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
			workflowPage.submit_To_Workflow(prop.getProperty("DVT_2_RELEASE"));
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

	@Test(priority = 10)
	public void DVT3_Release() throws IOException, InterruptedException {

		log.info("Starting DVT3_Release Method");
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
			workflowPage.submit_To_Workflow(prop.getProperty("DVT_3_RELEASE"));
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

	@Test(priority = 11)
	public void PVT1_Release() throws IOException, InterruptedException {

		log.info("Starting PVT1_Release Method");
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
			workflowPage.submit_To_Workflow(prop.getProperty("PVT_1_RELEASE"));
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
	public void PVT2_Release() throws IOException, InterruptedException {

		log.info("Starting PVT2_Release Method");
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
			workflowPage.submit_To_Workflow(prop.getProperty("PVT_2_RELEASE"));
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
	
}
