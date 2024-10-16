package negative_Test_Cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdvancedSearchPage;
import pages.HomePage;
import pages.OverviewPage;
import pages.SaveAsPage;

public class AWC001Restrict_To_One_WIP extends BaseTest {
	// Creating Item revision of Already Existing Item with same Release Status
	Logger log = LogManager.getLogger(AWC001Restrict_To_One_WIP.class.getName());

	@Test(priority = 1)
	public void restrict_To_General_WIP() throws IOException, InterruptedException {
		log.info("Starting Retricting to One WIP Test");
		log.info("Starting restrict_To_General_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("GENERALWIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_GENERAL_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	/**/
	@Test(priority = 2)
	public void restrict_To_P0_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_P0_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("P0WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_P0_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 3)
	public void restrict_To_P1_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_P1_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("P1WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_P1_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 4)
	public void restrict_To_P2_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_P2_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("P2WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_P2_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 5)
	public void restrict_To_P3_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_P3_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("P3WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_P3_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 6)
	public void restrict_To_EVT1_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_EVT1_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("EVT1WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_EVT1_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 7)
	public void restrict_To_EVT2_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_EVT2_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("EVT2WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_EVT2_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 8)
	public void restrict_To_EVT3_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_EVT3_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("EVT3WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_EVT3_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 9)
	public void restrict_To_DVT1_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_DVT1_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("DVT1WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_DVT1_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 10)
	public void restrict_To_DVT2_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_DVT2_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("DVT2WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_DVT2_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 11)
	public void restrict_To_DVT3_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_DVT3_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("DVT3WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_DVT3_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 12)
	public void restrict_To_PVT1_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_PVT1_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("PVT1WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_PVT1_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}

	@Test(priority = 13)
	public void restrict_To_PVT2_WIP() throws IOException, InterruptedException {
		log.info("Starting restrict_To_PVT2_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Advanced(prop.getProperty("PVT2WIP_ID"));
		overview = new OverviewPage(page);
		overview.open_Item_Details();
		System.out.println("Release Status : " + overview.get_release_Status().textContent());
		overview.click_On_Revise();
		saveAs = new SaveAsPage(page);
		saveAs.create_Revision(prop.getProperty("STATUS_PVT2_WIP"));
		if (saveAs.getrevisionExceedError().isVisible()) {
			System.out.println(saveAs.getrevisionExceedError().textContent());
		} else {
			System.out.println("Error not occured");
		}
	}
	/**/
}