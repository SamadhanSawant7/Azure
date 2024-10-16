package functional_Test_Cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdvancedSearchPage;
import pages.ContentPage;
import pages.HomePage;
import pages.OverviewPage;

public class AWC009_Configuration extends BaseTest {
	
	Logger log = LogManager.getLogger(AWC009_Configuration.class.getName());
	
	@Test(priority = 1)
	public void configuration_P0_P1_WIP() throws IOException, InterruptedException {
		log.info("Starting Configuration Test");
		log.info("Starting configuration_P1_WIP Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		log.info("Clicked on Advanced Search Link");
		advancedpage = new AdvancedSearchPage(page);
		log.info("Reached to Advanced Search Page");
		advancedpage.search_Item_Adv(prop.getProperty("CONFIG_SEARCH_ID"));
		log.info("Searched for Item");
		overview = new OverviewPage(page);
		log.info("Reached to Overview Page");
		overview.open_Item();
		overview.go_To_Content();
		log.info("Clicked on Content Link");
		contentPage = new ContentPage(page);
		log.info("Reached to Content Page");
		contentPage.selectRevisionRule(prop.getProperty("REV_RULE_PROTO_1_WIP"));
		log.info("Revision Rule Applied");
		String releaseStat1= contentPage.getreleaseStatRoot().getAttribute("title");
		System.out.println("Parent Release Status "+releaseStat1);
		String releaseStat2= contentPage.getrelaseStatFirstChild().getAttribute("title");
		System.out.println("Child Release Status "+releaseStat2);
	}
	
	@Test(priority = 2)
	public void configuration_P0_Release() throws IOException, InterruptedException {
		
		log.info("Starting configuration_P0_Release Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Item_Adv(prop.getProperty("CONFIG_SEARCH_ID_P0_REL"));
		overview = new OverviewPage(page);
		overview.open_Item();
		overview.go_To_Content();
		contentPage = new ContentPage(page);
		contentPage.selectRevisionRule(prop.getProperty("REV_RULE_PROTO_1_WIP"));
		String releaseStat1= contentPage.getreleaseStatRoot().getAttribute("title");
		System.out.println("Parent Release Status "+releaseStat1);
	}
	
	@Test(priority = 3)
	public void configuration_P1_Release() throws IOException, InterruptedException {
		
		log.info("Starting configuration_P1_Release Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Item_Adv(prop.getProperty("CONFIG_SEARCH_ID_P1_REL"));
		overview = new OverviewPage(page);
		overview.open_Item();
		overview.go_To_Content();
		contentPage = new ContentPage(page);
		contentPage.selectRevisionRule(prop.getProperty("REV_RULE_PROTO_1_WIP"));
		String releaseStat1= contentPage.getreleaseStatRoot().getAttribute("title");
		System.out.println("Parent Release Status "+releaseStat1);
	}
	
	@Test(priority = 4)
	public void configuration_EQR_Release() throws IOException, InterruptedException {
		
		log.info("Starting configuration_EQR_Release Method");
		log.info("Logged In ... Reached to Homepage");
		homepage = new HomePage(page);
		homepage.click_AdvancedSearch();
		advancedpage = new AdvancedSearchPage(page);
		advancedpage.search_Item_Adv(prop.getProperty("CONFIG_SEARCH_ID_EQR_REL"));
		overview = new OverviewPage(page);
		overview.open_Item();
		overview.go_To_Content();
		contentPage = new ContentPage(page);
		contentPage.selectRevisionRule(prop.getProperty("REV_RULE_PROTO_1_WIP"));
		String releaseStat1= contentPage.getreleaseStatRoot().getAttribute("title");
		System.out.println("Parent Release Status "+releaseStat1);
	}
	
	
}
