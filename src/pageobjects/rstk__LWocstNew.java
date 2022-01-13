package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ L Wocst New"                                
               , summary=""
               , page="LWocstNew"
               , namespacePrefix="rstk"
               , object="rstk__lwocst__c"
               , connection="QARSF_Admin"
     )             
public class rstk__LWocstNew {

	public WebDriver driver;

	public rstk__LWocstNew(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Number']/ancestor::span/ancestor::th/following-sibling::td[1]//input")
	public WebElement orderNumber;

	@TextType()
	@FindBy(xpath = "//input[@id='lwocst_item__c_autocomplete']")
	public WebElement itemNumber;

	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement list;

	public void selectInventoryItem(String InventoryItemName) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='lwocst_item__c_autocomplete']"));
		ele.sendKeys(InventoryItemName);
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		Thread.sleep(500);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][1]/ul[@id='IDREF']/li"));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(1000);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().startsWith(InventoryItemName)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	public void selectProject(String ProjectName) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='lwocst_proj__c_autocomplete']"));
		ele.clear();
		ele.sendKeys(ProjectName);
		Thread.sleep(1500);

		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][2]/ul[@id='IDREF']/li"));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(500);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(ProjectName)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Project Charge Code']/ancestor::th/following-sibling::td//select")
	public WebElement ProjectChargeCode;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Quantity']/ancestor::span/ancestor::th/following-sibling::td[1]//input")
	public WebElement quantity;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Due Date']/ancestor::span/ancestor::th/following-sibling::td[1]//input")
	public WebElement dueDate;

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Extract Routing']/ancestor::span/ancestor::th/following-sibling::td[1]//input")
	public WebElement extractRouting;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Number']/ancestor::span/ancestor::th/following-sibling::td[1]//span")
	public WebElement orderNumber1;

	@TextType()
	@FindBy(xpath = "//span[contains(@id,'lwocst_ordsts')]")
	public WebElement status;
	
	
	@TextType()
	@FindBy(xpath = "//*[contains(@id,'tab_Operations_lbl')]")
	public WebElement tab_Operations_lbl;
	
	
	@ButtonType()
	@FindByLabel(label = "Add Operation")
	public WebElement addOperation;
	
	
	@ButtonType()
	@FindByLabel(label = "Add Concurrent Operation")
	public WebElement addConcurrentOperation;
	
	
	
	

	@ButtonType()
	@FindByLabel(label = "Release")
	public WebElement release;

	@ButtonType()
	@FindByLabel(label = "Complete")
	public WebElement complete;
	
	@ButtonType()
	@FindByLabel(label = "Close Work Order")
	public WebElement closeWorkOrder;

	@ButtonType()
	@FindByLabel(label = "Reverse WO Close")
	public WebElement reverseWOClose;
	
	@ButtonType()
	@FindByLabel(label = "Reverse Complete")
	public WebElement reverseComplete;
	
	
	@ButtonType()
	@FindByLabel(label = "Recall")
	public WebElement recall;
	
	
	@ButtonType()
	@FindByLabel(label = "Delete Routing")
	public WebElement deleteRouting;



}

