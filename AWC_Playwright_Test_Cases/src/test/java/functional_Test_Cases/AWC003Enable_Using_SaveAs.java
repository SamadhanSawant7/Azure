package functional_Test_Cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdvancedSearchPage;
import pages.HomePage;
import pages.OverviewPage;
import pages.SaveAsPage;

public class AWC003Enable_Using_SaveAs extends BaseTest {

	Logger log = LogManager.getLogger(AWC003Enable_Using_SaveAs.class.getName());
//Searching for existing item and saving it as new item
	@Test(priority = 1)
	public void enable_Using_SaveAs_General_WIP() throws IOException, InterruptedException {
		log.info("Starting Enable Using SaveAs Test");
		log.info("Starting enable_Using_SaveAs_General_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_GENERAL_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 2)
	public void enable_Using_SaveAs_P0_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_P0_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_P0_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 3)
	public void enable_Using_SaveAs_P1_WIP() throws IOException, InterruptedException {
		log.info("Starting Enable Using SaveAs Test");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_P1_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 4)
	public void enable_Using_SaveAs_P2_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_P2_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_P2_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 5)
	public void enable_Using_SaveAs_P3_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_P3_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_P3_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 6)
	public void enable_Using_SaveAs_EVT1_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_EVT1_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_EVT1_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 7)
	public void enable_Using_SaveAs_EVT2_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_EVT2_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_EVT2_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 8)
	public void enable_Using_SaveAs_EVT3_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_EVT3_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_EVT3_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 9)
	public void enable_Using_SaveAs_DVT1_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_DVT1_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_DVT1_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 10)
	public void enable_Using_SaveAs_DVT2_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_DVT2_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_DVT2_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 11)
	public void enable_Using_SaveAs_DVT3_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_DVT3_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_DVT3_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 12)
	public void enable_Using_SaveAs_PVT1_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_PVT1_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_PVT1_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}

	@Test(priority = 13)
	public void enable_Using_SaveAs_PVT2_WIP() throws IOException, InterruptedException {
		log.info("Starting enable_Using_SaveAs_PVT2_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("ADVANCEDSEARCHID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.saveAsNewItem(prop.getProperty("NEW_NAME"), prop.getProperty("STATUS_PVT2_WIP"));
		if (saveAs.getsave_Confirm_Popup().isVisible()) {
			System.out.println(saveAs.getsave_Confirm_Popup().textContent());
		} else {
			System.out.println("Popup not appeared");
			Assert.fail();
		}
	}
}
