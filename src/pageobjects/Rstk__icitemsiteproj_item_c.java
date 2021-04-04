package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="rstk__icitemsiteproj_item_c"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class Rstk__icitemsiteproj_item_c {

	@TextType()
	@FindBy(xpath = "//*[contains(text(),'Item Number')]//following::td[1]//div//a")
	public WebElement itemBySiteProjectDetail;
	@LinkType()
	@FindBy(xpath = "//span[contains(text(),'Site')]//following::td[1]//div[1]//a")
	public WebElement site;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Project')]//following::td[1]//div[1]//a")
	public WebElement project;
	@TextType()
	@FindBy(xpath = "//*[contains(text(),'Qty On-Hand')]//following::td[1]//div")
	public WebElement qtyOnHand;
	@TextType()
	@FindBy(xpath = "//*[contains(text(),'Qty Allocated')]//following::td[1]//div")
	public WebElement qtyAllocated;
	@TextType()
	@FindBy(xpath = "//*[text()='Qty Available']//following::td[1]")
	public WebElement qtyAvailable;
	@TextType()
	@FindBy(xpath = "//*[text()='Qty Consigned']//following::td[1]")
	public WebElement qtyConsigned;
	@TextType()
	@FindBy(xpath = "//*[text()='Qty Non-Nettable']//following::td[1]")
	public WebElement qtyNonNettable;
	@TextType()
	@FindBy(xpath = "//*[text()='Net Qty Available']//following::td[1]")
	public WebElement netQtyAvailable;

	
}
