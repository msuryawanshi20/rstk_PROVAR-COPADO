package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__insptempl"                                
               , summary=""
               , page="insptempl"
               , namespacePrefix="rstk"
               , object="rstk__insptempl__c"
               , connection="QARSF_Admin"
     )             
public class rstk__insptempl {
	public WebDriver driver;

	public rstk__insptempl(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Template Reference']/ancestor::th/following-sibling::td[1]//input")
	public WebElement templateReference;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Method for Deriving Inspection Qty']/ancestor::th/following-sibling::td[1]//select")
	public WebElement methodForDerivingInspectionQty;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Inspection Order Site']/ancestor::th/following-sibling::td[1]//select")
	public WebElement inspectionOrderSite;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Fixed Qty to Inspection Order']/ancestor::th/following-sibling::td[1]//input")
	public WebElement fixedQtyToInspectionOrder;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Percentage for Inspection Order Qty']/ancestor::th/following-sibling::td[1]//input")
	public WebElement percentageForInspectionOrderQty;

	public void setInspectionOrderLocationID(String LocationID) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='insptempl_locid__c_autocomplete']"));
		ele.clear();
		ele.sendKeys(LocationID);
		Thread.sleep(1500);

		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][1]/ul[@id='IDREF']/li"));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(500);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(LocationID)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	public void setLocationIDforScrappedDisposition(String LocationID) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='insptempl_scraplocid__c_autocomplete']"));
		ele.clear();
		ele.sendKeys(LocationID);
		Thread.sleep(1500);

		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][2]/ul[@id='IDREF']/li"));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(500);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(LocationID)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	public void setLocationIDforOtherDisposition(String LocationID) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='insptempl_otherlocid__c_autocomplete']"));
		ele.clear();
		ele.sendKeys(LocationID);
		Thread.sleep(1500);

		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][3]/ul[@id='IDREF']/li"));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(500);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(LocationID)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Inspection Order Location Number']/ancestor::th/following-sibling::td//input")
	public WebElement inspectionOrderLocationNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Location Number for Scrapped Disposition']/ancestor::th/following-sibling::td//input")
	public WebElement locationNumberForScrappedDisposition;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Location Number for Other Disposition']/ancestor::th/following-sibling::td//input")
	public WebElement locationNumberForOtherDisposition;
	
	
	@ButtonType()
	@FindBy(xpath = "//*[@value='Save']")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Template Reference']/ancestor::th/following-sibling::td[1]//span")
	public WebElement templateReference1;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;

}
