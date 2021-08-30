package pageobjects;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TestLogger;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage(title = "Rstk__ Stocklocadj 2", summary = "", page = "Stocklocadj2", namespacePrefix = "rstk", object = "rstk__locadd__c", connection = "QARSF_Admin")

public class rstk__Stocklocadj2 {

	public WebDriver driver;

	public rstk__Stocklocadj2(WebDriver driver) {
		this.driver = driver;
	}

	public void selectInventoryItem(String InventoryItemName) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='locadd_item_ui__c_autocomplete']")).sendKeys(InventoryItemName);
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][1]/ul[@id='IDREF']/li"));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(1000);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(InventoryItemName)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	public void selectProject(String projectName) throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='locadd_proj__c_autocomplete']")).clear();
		driver.findElement(By.xpath("//input[@id='locadd_proj__c_autocomplete']")).sendKeys(projectName);
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][2]/ul[@id='IDREF']/li"));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(1000);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(projectName)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Stock Loc ID']/parent::span/parent::th/following-sibling::td//select")
	public WebElement StockLocID;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Stock Loc No']/parent::span/parent::th/following-sibling::td//input")
	public WebElement stockLocNo;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Lot No']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lotNo;

	@PageRow()
	public static class LocationAdjust {

		@BooleanType()
		@FindBy(xpath = ".//td[1]//input")
		public WebElement select;

		@FindBy(xpath = ".//td[2]//a|.//td[2]//span")
		public WebElement locationID;

		@FindBy(xpath = ".//td[3]//span")
		public WebElement locationNumber;

		@FindBy(xpath = ".//td[4]//span")
		public WebElement lotSerialNumber;

		@ChoiceListType()
		@FindBy(xpath = ".//td[5]/select")
		public WebElement adjustOption;

		@TextType()
		@FindBy(xpath = ".//td[6]/input")
		public WebElement processQtySerials;

		@TextType()
		@FindBy(xpath = ".//td[7]//input")
		public WebElement transactionDate;

		@ChoiceListType()
		@FindBy(xpath = ".//td[8]/select")
		public WebElement adjustmentAccount;

		@TextType()
		@FindBy(xpath = ".//td[9]//input")
		public WebElement comments;

		@BooleanType()
		@FindBy(xpath = ".//td[10]//input")
		public WebElement cycle;

	}

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@FindBy(xpath = "//div[contains(text(),'Location ID')]/parent::th//parent::tr/parent::thead/parent::table/tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = LocationAdjust.class)
	public List<LocationAdjust> locationAdjTable;

	public static String locID, locNum, Lot;

	@TextType()
	@FindBy(xpath = "//input[@name='locadd_icitem__c_autocomplete']")
	public WebElement itemNo;

	@TextType()
	@FindBy(id = "li-0")
	public WebElement list;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Project']/parent::span/parent::th/following-sibling::td//select")
	public WebElement project;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Inventory Offset Account']/parent::th/following-sibling::td[1]//select")
	public WebElement inventoryOffsetAccount;

	@TextType()
	@FindBy(xpath = "//label[text()='Material']/parent::th/parent::tr//td[2]//input")
	public WebElement material;

	@TextType()
	@FindBy(xpath = "//label[text()='Labor']/parent::th/parent::tr//td[2]//input")
	public WebElement labor;

	@TextType()
	@FindBy(xpath = "//label[text()='Material OHD']/parent::th/parent::tr//td[2]//input")
	public WebElement materialOHD;

	@TextType()
	@FindBy(xpath = "//label[text()='Labor OHD']/parent::th/parent::tr//td[2]//input")
	public WebElement laborOHD;

	@TextType()
	@FindBy(xpath = "//label[text()='Fringe Ohd']/parent::th/parent::tr//td[2]//input")
	public WebElement fringeOhd;

	@TextType()
	@FindBy(xpath = "//label[text()='Machine OHD']/parent::th/parent::tr//td[2]//input")
	public WebElement machineOHD;

	@TextType()
	@FindBy(xpath = "//label[text()='Sub Material']/parent::th/parent::tr//td[2]//input")
	public WebElement subMaterial;

	@TextType()
	@FindBy(xpath = "//label[text()='Sub Labor']/parent::th/parent::tr//td[2]//input")
	public WebElement subLabor;

	@ButtonType()
	@FindByLabel(label = "Adjust Inventory Costs")
	public WebElement adjustInventoryCosts;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Site']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement site;

	@TextType()
	@FindBy(xpath = "//input[@name='locadd_item_ui__c_autocomplete']")
	public WebElement ItemNo;

	@TextType()
	@FindBy(xpath = "//input[@name='locadd_proj__c_autocomplete']")
	public WebElement Project;

	@ButtonType()
	@FindByLabel(label = "Display Inventory Locations")
	public WebElement displayInventoryLocations;

	@ButtonType()
	@FindByLabel(label = "Process Selected Inventory Locations")
	public WebElement processSelectedInventoryLocations;

	@ButtonType()
	@FindByLabel(label = "Adjust Inventory")
	public WebElement adjustInventory;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Division']/parent::span/parent::th/following-sibling::td")
	public WebElement division;

	@TestLogger
	public Logger testLogger;

	public String selectSerialNumber(Integer NumberOfSerialTobeSelected) throws InterruptedException {

		Thread.sleep(2000);

		String selectedSerial = "";
		WebElement element;
		for (int i = 1; i <= NumberOfSerialTobeSelected; i++) {

			if (Lot != null) {

				element = driver.findElement(By.xpath("//*[contains(text(),'" + locID
						+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
						+ "')]/parent::td/following-sibling::td/span[contains(text(),'" + Lot
						+ "')]/parent::td/parent::tr//td[6]//select/option[" + i + "]"));

				testLogger.info("Serial Number:" + element.getText());
				selectedSerial += "\n" + element.getText();
			} else {

				element = driver.findElement(By.xpath("//*[contains(text(),'" + locID
						+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
						+ "')]/parent::td/parent::tr//td[6]//select/option[" + i + "]"));

				testLogger.info("Serial Number:" + element.getText());
				selectedSerial += "\n" + element.getText();

			}
			element.click();

		}
		return selectedSerial;
	}

	public void setAdjustOption(String locationID, String locationNumber, String LotNumber, String adjustmentOption)
			throws InterruptedException {

		locID = locationID;
		locNum = locationNumber;
		Lot = LotNumber;

		testLogger.info("Location ID" + locID);
		testLogger.info("Location Number" + locNum);
		testLogger.info("Lot Number" + Lot);

		Thread.sleep(2000);
		String xpath = null;
		if (Lot != null) {
			xpath = "//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/following-sibling::td/span[contains(text(),'" + Lot
					+ "')]/parent::td/parent::tr//td[5]//select";

			testLogger.info("Dropdownvalues::::" + xpath);
		} else {

			xpath = "//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/parent::tr//td[5]//select";
			testLogger.info("Dropdownvalues::::" + xpath);
		}

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath(xpath));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(adjustmentOption);
	}

	public void setQty(String qty) throws InterruptedException {

		Thread.sleep(2000);

		if (Lot != null) {
			driver.findElement(By.xpath("//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/following-sibling::td/span[contains(text(),'" + Lot
					+ "')]/parent::td/parent::tr//td[6]//input")).sendKeys("" + qty);

		} else {

			driver.findElement(By.xpath("//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/parent::tr//td[6]//input")).sendKeys("" + qty);
		}

	}

	public void setTransactionDate(String date) throws InterruptedException {

		if (Lot != null) {
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/following-sibling::td/span[contains(text(),'" + Lot
					+ "')]/parent::td/parent::tr//td[7]//input"));
			element.clear();
			element.sendKeys("" + date);

		} else {

			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/parent::tr//td[7]//input"));

			element.clear();
			testLogger.info("Date:::" + date);
			element.sendKeys("" + date);
		}

	}

	public void setAdjustmentAccount(String adjustmentAccount) throws InterruptedException {

		Thread.sleep(2000);
		String xpath = null;
		if (Lot != null) {
			xpath = "//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/following-sibling::td/span[contains(text(),'" + Lot
					+ "')]/parent::td/parent::tr//td[5]//select";

			testLogger.info("Dropdownvalues::::" + xpath);
		} else {

			xpath = "//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/parent::tr//td[5]//select";
			testLogger.info("Dropdownvalues::::" + xpath);
		}

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath(xpath));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(adjustmentAccount);
	}

	public void setComments(String comments) throws InterruptedException {

		Thread.sleep(2000);

		if (Lot != null) {
			driver.findElement(By.xpath("//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/following-sibling::td/span[contains(text(),'" + Lot
					+ "')]/parent::td/parent::tr//td[9]//input")).sendKeys("" + comments);

		} else {

			driver.findElement(By.xpath("//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/parent::tr//td[9]//input")).sendKeys("" + comments);
		}

	}

	public void setCycleCount() throws InterruptedException {

		Thread.sleep(2000);

		if (Lot != null) {
			driver.findElement(By.xpath("//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/following-sibling::td/span[contains(text(),'" + Lot
					+ "')]/parent::td/parent::tr//td[10]//input")).click();

		} else {

			driver.findElement(By.xpath("//*[contains(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/parent::tr//td[10]//input")).click();
		}

	}
	
	
	public void selectLocationRowCheckbox(String locationID, String locationNumber, String LotNumber)
			throws InterruptedException {

		Thread.sleep(2000);

		locID = locationID;
		locNum = locationNumber;
		Lot = LotNumber;

		if (Lot != null) {
			driver.findElement(By.xpath("//*[starts-with(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/following-sibling::td/span[contains(text(),'" + Lot
					+ "')]/parent::td/parent::tr//td[1]//input")).click();

		} else {

			driver.findElement(By.xpath("//*[starts-with(text(),'" + locID
					+ "')]/parent::span/parent::td/following-sibling::td/span[contains(text(),'" + locNum
					+ "')]/parent::td/parent::tr//td[1]//input")).click();
		}

	}
	
}
