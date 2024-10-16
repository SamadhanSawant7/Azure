package base;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;
import pages.AddChildForm;
import pages.Add_Popup;
import pages.AdvancedSearchPage;
import pages.Attachments;
import pages.ContentPage;
import pages.FolderPage;
import pages.HomePage;
import pages.LoginPage;
import pages.OverviewPage;
import pages.SaveAsPage;
import pages.Submit_To_Workflow_Popup;

public class BaseTest {
	PlaywrightFactory pf;
	public Page page;
	public LoginPage loginPage;
	public HomePage homepage;
	public FolderPage folderpage;
	public OverviewPage overview;
	public AdvancedSearchPage advancedpage;
	public SaveAsPage saveAs;
	public Attachments attachments;
	public Add_Popup addPopup;
	public Submit_To_Workflow_Popup workflowPage;
	public Properties prop;
	public ContentPage contentPage;
	public AddChildForm addChildForm;
	
	@BeforeMethod
	public void setup() throws IOException {
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
		
		page = pf.initBrowser(prop);
		
	}
	
	@AfterMethod
	public void tearDown() {
		page.context().browser().close();
	}
}
