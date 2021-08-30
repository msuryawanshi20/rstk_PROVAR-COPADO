package pageobjects;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TestLogger;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Woreceiptr"                                
               , summary=""
               , page="Woreceiptr"
               , namespacePrefix="rstk"
               , object="rstk__worcpt__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Woreceiptr {
	public WebDriver driver;

	public rstk__Woreceiptr(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//input[@id='worcpt_hdrordno__c_autocomplete']")
	public WebElement workOrder;
	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement list;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Transaction Date']/parent::span/parent::th/following-sibling::td//input")
	public WebElement transactionDate;
	
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Transaction Date']/parent::span/parent::th/following-sibling::td//a")
	public WebElement transactionDateTodayLink;
	
	
	
	@ButtonType()
	@FindByLabel(label = "Display Receipt Locations")
	public WebElement displayReceiptLocations;
	@PageRow()
	public static class WoReceiptDetailsTable {

		@BooleanType()
		@FindBy(xpath = ".//td[1]/input")
		public WebElement selected;
		@TextType()
		@FindBy(xpath = ".//td[5]/textarea")
		public WebElement txnComment;
		@TextType()
		@FindBy(xpath = ".//td[4]/input")
		public WebElement reverseQty;
	}
	
	@FindBy(xpath="//table[@class='list']/tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = WoReceiptDetailsTable.class)
	public List<WoReceiptDetailsTable> woReceiptDetailsTable;
	
	@ButtonType()
	@FindByLabel(label = "Reverse Receive Selected Locs")
	public WebElement reverseReceiveSelectedLocs;
	
	
	@TestLogger
	public Logger testLogger;

	public void selectSerialNumber(Integer NumberOfSerialTobeSelected) throws InterruptedException {

		Thread.sleep(2000);
		for (int i = 1; i <= NumberOfSerialTobeSelected; i++) {

			WebElement element = driver
					.findElement(By.xpath("//select[contains(@id,'reverseSrls')]/option[" + i + "]"));
			testLogger.info("Serial Number:" + element.getText());
			element.click();

		}

	}

}
