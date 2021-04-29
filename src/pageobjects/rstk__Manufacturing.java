package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.SalesforcePage;

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
	@FindBy(linkText = "Rootstock Site Map")
	public WebElement rootstockSiteMap;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[2]/div[2]/div/div[2]/div/li[5]//a[1]")
	public WebElement purchaseOrderEntry;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[2]/div[2]/div/div[2]/div/li[7]//a[1]")
	public WebElement purchaseOrderReceipts;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[2]/div[2]/div/div[2]/div/li[22]//a[1]")
	public WebElement pOReceiptTransactions;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//td[contains(@class, \"sidebarCell\")]/div[7]/div/div[2]/div/li[10]//a[1]")
	public WebElement inventoryCostTransactions;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[1]/div[1]/div/div[2]/div/li[1]//a[1]")
	public WebElement engineeringItemMaster;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[2]/div[2]/div/div[2]/div/li[8]//a[1]")
	public WebElement pOIssue;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[2]/div[2]/div/div[2]/div/li[9]//a[1]")
	public WebElement purchaseOrderAuthorization;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[2]/div[2]/div/div[2]/div/li[10]//a[1]")
	public WebElement pOAPMatch;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[2]/div[1]/div/div[2]/div/li[4]//a[1]")
	public WebElement purchaseRequisition;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[2]/div[2]/div/div[2]/div/li[17]//a[1]")
	public WebElement pOReceiptReversals;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[2]/div[2]/div/div[2]/div/li[18]//a[1]")
	public WebElement pOIssueReversal;

}
