package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.VisualforceBy;

@SalesforcePage(title = "Rstk__ Manufacturing",
				summary = "", 
				page = "Manufacturing", 
				namespacePrefix = "rstk", 
				object = "rstk__menu__c", 
				connection = "QARSF_Admin")
public class rstk__Manufacturing {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Site to Site Transfer']")
	public WebElement siteToSiteTransfer;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Location to Location Transfer']")
	public WebElement locationToLocationTransfer;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Site Master']")
	public WebElement siteMaster;

	@LinkType()
	@FindBy(linkText = "Inventory by Item/Site/Project")
	public WebElement inventoryByItemSiteProject;

	@LinkType()
	@FindBy(linkText = "Inventory by Item/Project")
	public WebElement inventoryByItemProject;

	@LinkType()
	@FindBy(linkText = "Inventory by Serial Number")
	public WebElement inventoryBySerialNumber;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='New Disassembly Order']")
	public WebElement newDisassemblyOrder;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='WO Issue']")
	public WebElement wOIssue;

	@LinkType()
	@FindBy(xpath = "//div/li/a[normalize-space(.)='Work Orders']")
	public WebElement workOrders;

	@LinkType()
	@FindBy(linkText = "Sales Order Entry")
	public WebElement salesOrderEntry1;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Location Add']")
	public WebElement inventoryLocationAdd;
	
	@LinkType()
	@FindBy(linkText = "Rootstock Site Map")
	public WebElement rootstockSiteMap;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Order Entry']")
	public WebElement purchaseOrderEntry;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Order Receipts']")
	public WebElement purchaseOrderReceipts;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PO Receipt Transactions']")
	public WebElement pOReceiptTransactions;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Cost Transactions']")
	public WebElement inventoryCostTransactions;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Engineering Item Master']")
	public WebElement engineeringItemMaster;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PO Issue']")
	public WebElement pOIssue;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Order Authorization']")
	public WebElement purchaseOrderAuthorization;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PO-AP Match']")
	public WebElement pOAPMatch;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Requisition']")
	public WebElement purchaseRequisition;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PO Receipt Reversals']")
	public WebElement pOReceiptReversals;
	

	@FindBy(xpath = "//a[normalize-space(.)='PO Issue Reversal']")
	public WebElement pOIssueReversal;
  
  @FindBy(linkText = "Sales Order Entry")
	public WebElement salesOrderEntry1;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Location Add']")
	public WebElement inventoryLocationAdd;

}

