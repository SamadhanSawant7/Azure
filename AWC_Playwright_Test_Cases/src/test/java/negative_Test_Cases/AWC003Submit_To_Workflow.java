package negative_Test_Cases;

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
import pages.Submit_To_Workflow_Popup;

public class AWC003Submit_To_Workflow extends BaseTest {
	/*Test Script for testing ability to submit item to Workflow*/
	Logger log = LogManager.getLogger(AWC003Submit_To_Workflow.class.getName());
	static String itemId;
	@Test(priority=1)
	public void submit_To_Workflow_P3_WIP() throws IOException, InterruptedException {
		log.info("Starting submit_To_Workflow_P3_WIP Method");
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
			System.out.println("Advanced Search Page");
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			System.out.println("Searched for created item");
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Reached to Overview Page");
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("PROTO_2_RELEASE"));
			if(workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			}
			else {
				System.out.println("Error not Occured");
				Assert.fail();
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}
	
	@Test(priority=2)
	public void submit_To_Workflow_DVT3_WIP() throws IOException, InterruptedException {
		log.info("Starting Submit to workflow Test");
		log.info("Starting submit_To_Workflow_DVT3_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		log.info("Reached to Folder Page");
		folderpage = new FolderPage(page);
		folderpage.click_OnAddBtn();
		log.info("Clicked on add Button....reached Add Popup");
		addPopup = new Add_Popup(page);
		itemId = addPopup.item_In_Add_Popup(itemId,prop.getProperty("STATUS_DVT3_WIP"));
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
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("DVT_2_RELEASE"));
			if(workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			}
			else {
				System.out.println("Error not Occured");
				Assert.fail();
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
		
	}
	
	
	@Test(priority=3)
	public void submit_To_Workflow_EVT3_WIP() throws IOException, InterruptedException {
		log.info("Starting submit_To_Workflow_EVT3_WIP Method");
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
			System.out.println("Advanced Search Page");
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			System.out.println("Searched for created item");
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Reached to Overview Page");
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("EVT_2_RELEASE"));
			if(workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			}
			else {
				System.out.println("Error not Occured");
				Assert.fail();
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}
	
	
	@Test(priority=4)
	public void submit_To_Workflow_PVT2_WIP() throws IOException, InterruptedException {
		log.info("Starting submit_To_Workflow_EVT3_WIP Method");
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
			System.out.println("Advanced Search Page");
			advancedpage = new AdvancedSearchPage(page);
			advancedpage.search_Advanced(itemId);
			System.out.println("Searched for created item");
			overview = new OverviewPage(page);
			overview.open_Item_Details();
			System.out.println("Reached to Overview Page");
			String releaseStatus = overview.get_release_Status().textContent();
			System.out.println(releaseStatus);
			overview.sendToWorkflowPage();
			workflowPage = new Submit_To_Workflow_Popup(page);
			workflowPage.submit_To_Workflow(prop.getProperty("PVT_1_RELEASE"));
			if(workflowPage.getErrorInWorkflow().isVisible()) {
				System.out.println(workflowPage.getErrorInWorkflow().textContent());
			}
			else {
				System.out.println("Error not Occured");
				Assert.fail();
			}
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
		}
		
	}
	
}
