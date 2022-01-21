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
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage(title = "Rstk__ Wocst", summary = "", page = "Wocst", namespacePrefix = "rstk", object = "rstk__wocst__c", connection = "QARSF_Admin")

public class rstk__Wocst {

	public WebDriver driver;

	public rstk__Wocst(WebDriver driver) {
		this.driver = driver;
	}

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Site']/ancestor::span/ancestor::th/following-sibling::td[1]//select")
	public WebElement Site;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Number']/ancestor::span/ancestor::th/following-sibling::td[1]//input")
	public WebElement orderNumber;

	public void selectInventoryItem(String InventoryItemName) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='wocst_item__c_autocomplete']"));
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
		WebElement ele = driver.findElement(By.xpath("//input[@name='wocst_proj__c_autocomplete']"));
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

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty Required']/ancestor::span/ancestor::th/following-sibling::td[1]//input")
	public WebElement qtyRequired;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty Required']/ancestor::span/ancestor::th/following-sibling::td[1]//span")
	public WebElement readQtyRequired;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Due Date']/ancestor::span/ancestor::th/following-sibling::td//input")
	public WebElement dueDate;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Number']/ancestor::span/ancestor::th/following-sibling::td[1]//span")
	public WebElement orderNumber1;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Status']/ancestor::span/ancestor::th/following-sibling::td//span")
	public WebElement status;

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Project Charge Code']/ancestor::th/following-sibling::td//select")
	public WebElement projectChargeCode;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Project']/ancestor::span/ancestor::th/following-sibling::td//input")
	public WebElement project;

	@TextType()
	@FindBy(xpath = "//input[@id='wocst_item__c_autocomplete']")
	public WebElement itemName;

	@ButtonType()
	@FindBy(xpath = "//input[@id='extractOperationsAndComponents']")
	public WebElement extractOperationsAndComponents;

	@ButtonType()
	@FindBy(xpath = "//input[@id='extractCompOpt']")
	public WebElement extractOperationsAndComponents1;

	@ButtonType()
	@FindBy(xpath = "//input[@id='allocateDemandsBtn']")
	public WebElement allocate;

	@ButtonType()
	@FindBy(xpath = "//*[contains(@value,'Deallocate')]")
	public WebElement deallocate;

	@ButtonType()
	@FindBy(xpath = "//input[@id='generatePickListRecords']")
	public WebElement generatePickList;

	@BooleanType()
	@FindBy(xpath = "//input[@id='incBackflush2']")
	public WebElement includeBackflushComponentsinPicklist;

	@ButtonType()
	@FindBy(xpath = "//div[@id='generatePicklist']/p[2]/input[1]")
	public WebElement generatePicklist;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;

	@FindBy(xpath = "//td[contains(@id,'Lot_lbl')]/parent::tr")
	public WebElement lot;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Lot Number']/ancestor::span/ancestor::th/following-sibling::td[1]//input")
	public WebElement lotNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Lot Expiration Date']/ancestor::span/ancestor::th/following-sibling::td//input")
	public WebElement lotExpirationDate;

	@ButtonType()
	@FindByLabel(label = "Close Work Order")
	public WebElement closeWorkOrder;

	@ButtonType()
	@FindByLabel(label = "Reverse WO Close")
	public WebElement reverseWOClose;

	@ButtonType()
	@FindBy(xpath = "//input[@id='deleteOperations']")
	public WebElement deleteOperations;

	@ButtonType()
	@FindBy(xpath = "//input[@id='deleteComponents']")
	public WebElement deleteComponents;

	@TextType()
	@FindBy(xpath = "//img[@name='Related Lists']")
	public WebElement relatedLists;

	@ButtonType()
	@FindBy(xpath = "//input[@value='Add Component']")
	public WebElement addComponent;

	@ButtonType()
	@FindByLabel(label = "Generate Serials")
	public WebElement generateSerials;

	@TextType()
	@FindBy(xpath = "//*[contains(@id,'tab_SerialNumbers_lbl')]")
	public WebElement tab_SerialNumbers_lbl;

	@FindBy(xpath = "//img[@name='Serial Number Fast Entry']")
	public WebElement pbs_SNFastEntry;

	@ButtonType
	@FindBy(xpath = "//input[@value='Assign']")
	public WebElement assignSerialBtn;

	public void setSerial(String serial) {
		driver.findElement(By.xpath("//textarea[@id='srlnums']")).sendKeys(serial + "\n");
	}

	@TextType()
	@FindBy(xpath = "//*[contains(@id,'tab_Operations_lbl')]")
	public WebElement tab_Operations_lbl;

	@ButtonType()
	@FindBy(xpath = "//input[contains(@value,'Add Standard Operation')]")
	public WebElement addStandardOperation;

	@ButtonType()
	@FindBy(xpath = "//input[contains(@value,'Add Subcontract Operation')]")
	public WebElement addSubcontractOperation;

	@ButtonType()
	@FindBy(xpath = "//input[contains(@value,'Add Concurrent Operation')]")
	public WebElement addConcurrentOperation;

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Rework']/ancestor::span/ancestor::th/following-sibling::td//input")
	public WebElement rework;

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Refurb']/ancestor::span/ancestor::th/following-sibling::td//input")
	public WebElement refurb;

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Consigned']/ancestor::span/ancestor::th/following-sibling::td//input")
	public WebElement consigned;

	@ButtonType()
	@FindBy(xpath = "//input[@id='extractOperations']")
	public WebElement extractOperations;

	@ButtonType()
	@FindBy(xpath = "//input[@value='Extract Operations']")
	public WebElement extractOperations1;

	@ButtonType()
	@FindBy(xpath = "//input[@id='extractComponents']")
	public WebElement extractComponets;

	@ButtonType()
	@FindBy(xpath = "//input[@value='Extract Components']")
	public WebElement extractComponets1;

	public void selectComponent(String Component) {

		driver.findElement(By.xpath("//div[@id='selectRefurb']//table[@class='list']//tbody//tr/td[contains(text(),'"
				+ Component + "')]/parent::tr//td[1]/input[1]")).click();
	}

	@ButtonType()
	@FindBy(xpath = "//div[@id='selectRefurb']/div[@id='issueBtns']/p/input")
	public WebElement oK;

	@ButtonType()
	@FindBy(xpath = "//*[contains(@id,'tab_Totalcost_lbl')]")
	public WebElement tab_Totalcost_lbl;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Material']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_Material;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Labor']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_Labor;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Material Overhead']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_MaterialOverhead;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Labor Overhead']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_LaborOverhead;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Fringe Overhead']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_FringeOverhead;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Overhead']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_MachineOverhead;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Subcontract Material']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_SubcontractMaterial;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Subcontract Labor']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_SubcontractLabor;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Freight']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_Freight;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Other Indirect']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_OtherIndirect;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Total Charges']/ancestor::td/following-sibling::td[1]//span")
	public WebElement charges_TotalCharges;

}
