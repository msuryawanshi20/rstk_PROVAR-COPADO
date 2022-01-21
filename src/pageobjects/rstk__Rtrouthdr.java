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

@SalesforcePage(title = "Rstk__ Rtrouthdr", summary = "", page = "Rtrouthdr", namespacePrefix = "rstk", object = "rstk__rtrouthdr__c", connection = "QARSF_Admin")
public class rstk__Rtrouthdr {
	public WebDriver driver;

	public rstk__Rtrouthdr(WebDriver driver) {
		this.driver = driver;
	}

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Site']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement site;

	public void selectItemNumber(String ItemNumber) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='rtrouthdr_item__c_autocomplete']"));
		ele.sendKeys(ItemNumber);
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		Thread.sleep(500);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][1]/ul[@id='IDREF']/li"));

		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(3000);

			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().startsWith(ItemNumber)) {
				Thread.sleep(1000);
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Name']/parent::th/following-sibling::td[1]/span/span")
	public WebElement name;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Responsible Engineer']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement responsibleEngineer;

	@FindBy(xpath = "//label[normalize-space(.)='Responsible Engineer']/parent::span/parent::th/following-sibling::td[1]//a")
	public WebElement responsibleEngineerText;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Responsible Planner']/parent::span/parent::th/following-sibling::td//select")
	public WebElement responsiblePlanner;

	@FindBy(xpath = "//label[normalize-space(.)='Responsible Planner']/parent::span/parent::th/following-sibling::td[1]//a")
	public WebElement responsiblePlannerText;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;

	@ButtonType()
	@FindByLabel(label = "Clone")
	public WebElement clone;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Source Add Revision']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement selectedSourceRevision;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Target Add Revision']/parent::span/parent::th/following-sibling::td//select")
	public WebElement targetRevision;

	@ButtonType()
	@FindBy(xpath = "//a[contains(text(),'Add Standard Operation')]")
	public WebElement addStandardOperation;

	@ButtonType()
	@FindBy(xpath = "//a[contains(text(),'Add Subcontract Operation')]")
	public WebElement addSubcontractOperation;

	@ButtonType()
	@FindBy(xpath = "//a[contains(text(),'Add Concurrent Operation')]")
	public WebElement addConcurrentOperation;

}
