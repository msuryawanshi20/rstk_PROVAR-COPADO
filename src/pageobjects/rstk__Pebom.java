package pageobjects;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TestLogger;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage(title = "Rstk__ Pebom", summary = "", page = "Pebom", namespacePrefix = "rstk", object = "rstk__pebom__c", connection = "QARSF_Admin")
public class rstk__Pebom {

	public WebDriver driver;

	public rstk__Pebom(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//input[@id='pebom_item__c_autocomplete']")
	public WebElement parentItem;

	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement list;

	@TextType()
	@FindBy(xpath = "//input[@id='pebom_compitem__c_autocomplete']")
	public WebElement componentItem;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Quantity Per']/parent::span/parent::th/following-sibling::td//input")
	public WebElement quantityPer;

	@TextType()
	@FindBy(xpath = "//td[contains(@id,'tab_Mrpoverrides_lbl')]")
	public WebElement tab_Mrpoverrides_lbl;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Scrap Factor']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement scrapFactor;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Quantity']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement setupQuantity;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TestLogger
	public Logger testLogger;

	public void selectParentItem(String parentItemName) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		String xpath = "//input[@id='pebom_item__c_autocomplete']";
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

		WebElement ele = driver.findElement(By.xpath(xpath));
		ele.clear();
		ele.sendKeys(parentItemName);
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ac_results'][1]/ul[@id='IDREF']/li")));

		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][1]/ul[@id='IDREF']/li"));

		testLogger.info("Size" + autoCompleteList.size());

		while (autoCompleteList.size() > 10 || autoCompleteList.isEmpty()) {
			ele.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(3000);
			autoCompleteList = driver.findElements(By.xpath("//div[@class='ac_results'][1]/ul[@id='IDREF']/li"));

		}

		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(500);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			testLogger.info("Parent Item Name" + autoCompleteList.get(i).getText());

			if (autoCompleteList.get(i).getText().startsWith(parentItemName)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}

	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Line Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lineNumber;

	@BooleanType()
	@FindBy(xpath = "//td//td/span/span/input")
	public WebElement fixedQuantity;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Phantom Override']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Phantom_Override;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;

}
