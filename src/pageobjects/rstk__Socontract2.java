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

@SalesforcePage( title="Rstk__ Socontract 2"                                
               , summary=""
               , page="Socontract2"
               , namespacePrefix="rstk"
               , object="rstk__socontract__c"
               , connection="QARSF_Admin"
     )             

public class rstk__Socontract2 {

	public WebDriver driver;

	public rstk__Socontract2(WebDriver driver) {
		this.driver = driver;
	}

	public void selectContractCustomer(String CustomerName) throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='socontract_socust__c_autocomplete']"));
		ele.sendKeys(CustomerName);
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		Thread.sleep(500);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][1]/ul[@id='IDREF']/li"));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(1000);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().startsWith(CustomerName)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Master Services Agreement']/ancestor::th/following-sibling::td[1]//select")
	public WebElement socontract_socustmsa__c;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Contract Terms Template']/ancestor::th/following-sibling::td[1]//select")
	public WebElement socontract_soctt__c;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Contract Type']/ancestor::th/following-sibling::td//select")
	public WebElement socontract_type__c;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Contract Term']/ancestor::th/following-sibling::td[1]//input")
	public WebElement contractTerm;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Recurring Billing Start Date']/ancestor::th/following-sibling::td//input")
	public WebElement recurringBillingStartDate;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='First Full RB Period Start Date']/ancestor::th/following-sibling::td//input")
	public WebElement firstFullRBPeriodStartDate;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Contract Term UOM / Billing Frequency']/ancestor::th/following-sibling::td//select")
	public WebElement contractTermUOMBillingFrequency;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Contract ID']/ancestor::th/following-sibling::td[1]//input")
	public WebElement contractID;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/ancestor::th/following-sibling::td[1]//input")
	public WebElement description;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Contract Status']/ancestor::th/following-sibling::td[1]//select")
	public WebElement contractStatus;

}
