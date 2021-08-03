package pageobjects;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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

@SalesforcePage( title="Rstk__ Stocklocadj 2"                                
               , summary=""
               , page="Stocklocadj2"
               , namespacePrefix="rstk"
               , object="rstk__locadd__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Stocklocadj2 {

	public WebDriver driver;

	public rstk__Stocklocadj2(WebDriver driver) {
		this.driver = driver;
	}

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Site']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement site;

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

	@ButtonType()
	@FindByLabel(label = "Display Inventory Locations")
	public WebElement displayInventoryLocations;

	@PageRow()
	public static class LocationAdjust {

		@BooleanType()
		@FindBy(xpath = ".//td[1]//input")
		public WebElement select;

		@FindBy(xpath = ".//td[2]//span")
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

	@ButtonType()
	@FindByLabel(label = "Process Selected Inventory Locations")
	public WebElement processSelectedInventoryLocations;

	@ButtonType()
	@FindByLabel(label = "Adjust Inventory")
	public WebElement adjustInventory;
	
	
	@TestLogger
	public Logger testLogger;

	public void selectSerialNumber(Integer NumberOfSerialTobeSelected) throws InterruptedException {
		Thread.sleep(2000);
		for (int i = 1; i <= NumberOfSerialTobeSelected; i++) {
			WebElement element = driver.findElement(
					By.xpath("//select[contains(@hiddenfieldid,'selectediclocitemids__c')]/option[" + i + "]"));
			testLogger.info("Xpath:" + element);
			testLogger.info("Serial Number:" + element.getText());
			element.click();
		}
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Division']/parent::span/parent::th/following-sibling::td")
	public WebElement division;

}
