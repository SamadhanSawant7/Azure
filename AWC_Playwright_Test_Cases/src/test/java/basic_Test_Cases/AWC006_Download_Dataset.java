package basic_Test_Cases;

import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Download;

import base.BaseTest;
import pages.Attachments;
import pages.FolderPage;
import pages.HomePage;

public class AWC006_Download_Dataset extends BaseTest {
	Logger log = LogManager.getLogger(AWC006_Download_Dataset.class.getName());

	@Test
	public void download_Dataset() throws IOException, InterruptedException {
		log.info("Starting Download Dataset Test");
		log.info("Logged in Successfully...Reached Home Page");
		homepage = new HomePage(page);
		homepage.clickOnFolderTile();
		folderpage = new FolderPage(page);
		log.info("Reached Folder Page");
		folderpage.click_Item_Attachment();
		log.info("Item Selected");
		attachments = new Attachments(page);
		log.info("Reached Attachment page");
		// ----------------------------------------------------------//
		attachments.click_Download_Dataset();
		if (attachments.getDatasetSection().isEnabled()) {
			log.info("Attachment is available");
			Download download = page.waitForDownload(() -> {
				page.click("//aw-command[@title='Download File']");
			});
			download.saveAs(Paths
					.get("Downloads/Test " + new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date()) + ".pdf"));
			System.out.println("File Downloaded Successfully");
			log.info("File Downloaded Successfully");
		} else {
			System.out.println("Datset Not Found");
		}
	}
}