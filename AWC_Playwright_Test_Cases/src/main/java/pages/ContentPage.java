package pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class ContentPage {

	private Page page;
	public Properties prop;
	public PlaywrightFactory pf;

	public ContentPage(Page page) throws IOException {
		this.page = page;
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
	}

	private String firstItemInTable = "(//div[@class='aw-splm-tableCellText'])[1]";
	private String firstChildInTable = "(//div[@class='aw-splm-tableCellText'])[2]";
	private String newBtn = "//button[@id='Awp0NewGroup']";
	private String childOptn = "//li[@id='Awb0AddChildElementDeclarative']";
	private String rootLvl = "//div[@title='0']";
	private String firstChildLvl = "//div[@title='1']";
	private String secondChildLvl = "//div[@class='aw-splm-tableCellTop' and @title='2']/div";
	private String revisionRule =
			// "(//a[@class='ng-binding'])[1]";
			"(//div[@class='aw-layout-headerSubTitle'])[1]";
	private String ruleFilter = "//input[@placeholder='Filter']";
	private String ruleOptn = "//li[@class='aw-widgets-cellListItem aw-widgets-cellTop ng-scope']";
	private String releaseStatRoot = "(//div[@class='aw-splm-tableCellTop']/img)[1]";
	private String releaseStatFirstChild = "(//div[@class='aw-splm-tableCellTop']/img)[2]";

	public Locator getreleaseStatRoot() {
		return page.locator(releaseStatRoot);
	}

	public Locator getrelaseStatFirstChild() {
		return page.locator(releaseStatFirstChild);
	}

	public void clickFirstItemInTable() throws InterruptedException {
		Thread.sleep(4000);
		page.click(firstItemInTable);
	}

	public void addChild() {
		page.click(newBtn);
		page.click(childOptn);
	}

	public String getRootLvl() {
		return page.locator(rootLvl).textContent();
	}

	public String getFirstChildLvl() {
		return page.locator(firstChildLvl).textContent();
	}

	public String getSecondChildLvl() throws InterruptedException {
		return page.locator(secondChildLvl).textContent();
	}

	public void createSecondChild() throws InterruptedException {

		page.click(newBtn);
		page.click(childOptn);
	}

	public void selectRevisionRule(String rule) throws InterruptedException {

		Thread.sleep(3000);
		page.click(revisionRule);
		page.fill(ruleFilter, rule);
		page.click(ruleOptn);
	}
}
