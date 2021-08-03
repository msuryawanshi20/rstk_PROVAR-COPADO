package pageobjects;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TestLogger;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage(title = "Rstk__create Inspection Order", summary = "", page = "createInspectionOrder", namespacePrefix = "rstk", object = "rstk__inspord__c", connection = "QARSF_Admin")
public class rstk__createInspectionOrder {
	public WebDriver driver;

	public rstk__createInspectionOrder(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//input[@id='inspord_icitem__c_autocomplete']")
	public WebElement inventoryItem;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Inspection Order Template']/parent::th/following-sibling::td[1]//select")
	public WebElement inspord_insptempl__c;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Originating Inventory Site']/parent::th/following-sibling::td//select")
	public WebElement Originating_Inventory_Site;

	@TextType()
	@FindBy(xpath = "//input[@id='inspord_frlocid__c_autocomplete']")
	public WebElement Originating_Location_ID;

	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement list;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Originating Location Number']/parent::th/following-sibling::td//select")
	public WebElement OriginatingLocationNumber;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TestLogger
	public Logger testLogger;

	public void selectInventoryItem(String InventoryItemName) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='inspord_icitem__c_autocomplete']")).sendKeys(InventoryItemName);
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

	public void selectOriginatingLocationID(String OriginalLocID) throws InterruptedException {
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='inspord_frlocid__c_autocomplete']")).sendKeys(OriginalLocID);
		Actions actions = new Actions(driver);
		Thread.sleep(2500);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][2]/ul[@id='IDREF']/li"));

		testLogger.info("List Size" + autoCompleteList.size());
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(500);
			testLogger.info("List value" + i + ":" + autoCompleteList.get(i).getText());
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(OriginalLocID)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Inspection Quantity']/parent::th/following-sibling::td[1]//input")
	public WebElement inspectionQuantity;

	
	@FindBy(xpath = "//label[normalize-space(.)='Serial Numbers']/parent::span/parent::th/following-sibling::td//textarea")
	public WebElement serialNumbers;

	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='Division']/parent::th/following-sibling::td[1]//a")
	public WebElement division;

	public static String serialList = "";

	public void setSerialNumbers(String serialNumber) {
		testLogger.info("Serial number Input::" + serialNumber);

		//serialNumbers.sendKeys(serialNumber);

		serialNumbers.sendKeys("\n" + serialNumber );
		serialList += serialNumber;
		testLogger.info("SErial List::" + serialList);

	}

}
