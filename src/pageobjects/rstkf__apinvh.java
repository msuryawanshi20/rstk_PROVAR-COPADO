package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__apinvh"                                
               , summary=""
               , page="apinvh"
               , namespacePrefix="rstkf"
               , object="rstkf__apinvh__c"
               , connection="QARSFAdmin"
     )             
public class rstkf__apinvh {

	@TextType()
	@FindBy(xpath = "//input[@name='apinvtxn_vendno__c_autocomplete']")
	public WebElement vendor;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement Vendorlist;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Document Number (e.g., Invoice Number)']/parent::th/following-sibling::td[1]//input")
	public WebElement documentNumberEGInvoiceNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Transaction Total (Txn Currency)']/parent::th/following-sibling::td[1]//input")
	public WebElement transactionTotalTxnCurrency;
	@ButtonType()
	@FindBy(xpath = "//span/input[@value='Save']")
	public WebElement save;
	@TextType()
	@VisualforceBy(componentXPath = "c:standardHeader//h2[contains(@class, \"pageDescription\")]")
	public WebElement pageTitle;
	@ButtonType()
	@FindBy(xpath = "//span/input[@value='Close Session']")
	public WebElement closeSession;
	@ButtonType()
	@FindBy(xpath = "//span/input[@value='Post Session']")
	public WebElement postSession;
	
}
