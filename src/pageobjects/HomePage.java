package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "HomePage", 
      summary = "", 
      relativeUrl = "", 
      connection = "QARSF_Admin")
      
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
	
	@LinkType()
	@FindBy(xpath = "//span[text()='Forecast Demand']")
	public WebElement ForecastDemand;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='Forecast Demand-Fast Entry']")
	public WebElement ForecastDemandFastEntry;

	@ButtonType()
	@FindBy(xpath = "//input[@name='new']")
	public WebElement NewForecastDemand;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='Summary Review by Item']")
	public WebElement SummaryReviewbyItem;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='Detailed Review by Item']")
	public WebElement DetailedReviewbyItem;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='Credit Release']")
	public WebElement CreditRelease;
	
	@LinkType()
	@FindBy(xpath = "//span[text()='MRP Action Message Search']")
	public WebElement MRPActionMessageSearch;

	@LinkType()
	@FindBy(xpath = "//div[@id='sidebarDiv']//a[normalize-space(.)='Sales Order Header']")
	public WebElement salesOrderEntry;

	@ButtonType()
	@FindBy(xpath = "//input[@name='new']")
	public WebElement New_Sales_Order_Header;

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Search apps and items...']/following-sibling::div//input")
	public WebElement searchAppsAndItems;

	@LinkType()
	@FindBy(xpath = "//one-app-launcher-menu-item/a")
	public WebElement App_Required;

	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Sales Order Commissions']")
	public WebElement Sales_Order_Commissions_pageTitle;
	
	@TextType()
	@FindBy(xpath = "//h2[text()='Sales Order Commissions']/following::form")
	public WebElement Sales_Order_Commissions_form;

	@ButtonType()
	@FindBy(xpath = "//input[@name='new']")
	public WebElement New_Sales_Order_Invoice_Header;

	
	

}
