package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Generate Recurring Billing Execution"                                
               , summary=""
               , page="GenerateRecurringBillingExecution"
               , namespacePrefix="rstk"
               , object="rstk__customext__c"
               , connection="QARSF_Admin"
     )             
public class rstk__GenerateRecurringBillingExecution {

	public WebDriver driver;

	public rstk__GenerateRecurringBillingExecution(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing Run Date']/ancestor::th/following-sibling::td[1]//input")
	public WebElement billingRunDate;

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Specify Customer Range']/ancestor::th/following-sibling::td[1]//input")
	public WebElement specifyCustomerRange;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Customer']/ancestor::th/following-sibling::td[1]//select")
	public WebElement Customer;

	public void selectContract(String ContractName) throws InterruptedException {
		List<WebElement> workOrderList = driver.findElements(
				By.xpath("//label[normalize-space(.)='Contract']/ancestor::th/following-sibling::td//option"));
		for (int i = 0; i < workOrderList.size(); i++) {
			if (workOrderList.get(i).getText().contains(ContractName)) {
				workOrderList.get(i).click();
				Thread.sleep(2000);
			}
		}
	}

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Run for All Divisions']/ancestor::th/following-sibling::td//input")
	public WebElement runForAllDivisions;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Periodic Billing Frequency']/ancestor::th/following-sibling::td//select")
	public WebElement periodicBillingFrequency;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Contract Type']/ancestor::th/following-sibling::td//select")
	public WebElement contractType;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='From Customer']/ancestor::th/following-sibling::td[1]//select")
	public WebElement From_Customer;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='To Customer']/ancestor::th/following-sibling::td//select")
	public WebElement To_Customer;

	@ButtonType()
	@FindByLabel(label = "Generate Recurring Billings")
	public WebElement generateRecurringBillings;

}
