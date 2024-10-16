package functional_Test_Cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddChildForm;
import pages.Add_Popup;
import pages.AdvancedSearchPage;
import pages.ContentPage;
import pages.FolderPage;
import pages.HomePage;
import pages.OverviewPage;

public class AWC008_Create_BOM_Structure extends BaseTest {
	static String itemId;
	Logger log = LogManager.getLogger(AWC008_Create_BOM_Structure.class.getName());

	@Test
	public void create_BOM() throws IOException, InterruptedException {
		log.info("Starting Restricting WIP Status Test");
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
			overview.go_To_Content();
			contentPage = new ContentPage(page);
			contentPage.clickFirstItemInTable();
			contentPage.addChild();
			addChildForm = new AddChildForm(page);
			addChildForm.createChildInAddForm(prop.getProperty("STATUS_GENERAL_WIP"), prop.getProperty("CHILD_NAME"));
			try {
				if (addChildForm.getconfirmMsg().isVisible()) {
					System.out.println(addChildForm.getconfirmMsg().textContent());
				}
			} catch (Exception e) {
				System.out.println("Confirmation Not Appeared");
			}

			System.out.println("Root Parent Level = " + contentPage.getRootLvl());
			System.out.println("First Child Level = " + contentPage.getFirstChildLvl());
			contentPage.createSecondChild();
			addChildForm.createChildInAddForm(prop.getProperty("STATUS_GENERAL_WIP"),
					prop.getProperty("SECOND_CHILD_NAME"));
			try {
				if (addChildForm.getconfirmMsg().isVisible()) {
					System.out.println(addChildForm.getconfirmMsg().textContent());
				}
			} catch (Exception e) {
				System.out.println("Confirmation Not Appeared");
				Assert.fail();
			}
			System.out.println("Second Child Level = " + contentPage.getSecondChildLvl());
		} else {
			log.error("Item not Created");
			System.out.println("Item can not be created");
			Assert.fail();
		}

	}
}
