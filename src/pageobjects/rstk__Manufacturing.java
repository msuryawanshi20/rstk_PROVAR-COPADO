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

	@FindBy(xpath = "//a[normalize-space(.)='Inventory Location Add']")
	public WebElement inventoryLocationAdd;


}
