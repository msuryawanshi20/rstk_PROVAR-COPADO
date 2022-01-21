package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Rmaprocesses"                                
               , summary=""
               , page="Rmaprocesses"
               , namespacePrefix="rstk"
               , object="rstk__sorma__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Rmaprocesses {
	public WebDriver driver;

	public rstk__Rmaprocesses(WebDriver driver) {
		this.driver = driver;
	}


	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='To Inventory']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement toInventory;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='To Inspection']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement toInspection;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty to Process']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement qtyToProcess;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Txn Comments']/parent::span/parent::th/following-sibling::td//input")
	public WebElement txnComments;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Location Comments']/parent::span/parent::th/following-sibling::td//input")
	public WebElement locationComments;
	@PageRow()
	public static class RmarcptdetailsTable {

		@TextType()
		@FindBy(xpath = ".//td[3]/input")
		public WebElement lotNumber;
	}
	@FindBy(xpath = "//table[contains(@id,'pb_rmarcptdetails')]/tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = RmarcptdetailsTable.class)
	public List<RmarcptdetailsTable> rmarcptdetailsTable;
	
	
	public void selectSerialNumber(Integer NumberOfSerialTobeSelected) throws InterruptedException {

		Thread.sleep(2000);

	Select listbox = new Select(driver.findElement(By.xpath("//select[contains(@id,'rmarcptdetails')]")));
		listbox.deselectAll();

		for (int i = 1; i <= NumberOfSerialTobeSelected; i++) {

			WebElement element = driver.findElement(By.xpath("//select[contains(@id,'rmarcptdetails')]/option[" + i + "]"));
			element.click();

		}

	}


	@ButtonType()
	@FindByLabel(label = "Process Receipt")
	public WebElement processReceipt;
	
}
