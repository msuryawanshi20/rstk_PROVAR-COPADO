package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "HomePage", summary = "", relativeUrl = "", connection = "pde5")
public class HomePage {

	public WebDriver driver;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Rootstock Site Map']")
	public WebElement rootstockSiteMap;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='Quick Cash Receipts']")
	public WebElement QuickCashReceipts;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='Cash Receipts']")
	public WebElement CashReceipts;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='Cash Receipts Journal']")
	public WebElement CashReceiptsJournal;
	
	@ButtonType()
	@FindBy(xpath = "//input[@name='new']")
	public WebElement New_Cash_Receipt;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='SO Invoice']")
	public WebElement SOInvoice;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='Sales Order Prepayment']")
	public WebElement SalesOrderPrepayment;

	@ButtonType()
	@FindBy(xpath = "//input[@name='new']")
	public WebElement New_Prepayment_Detail;
	
	

}
