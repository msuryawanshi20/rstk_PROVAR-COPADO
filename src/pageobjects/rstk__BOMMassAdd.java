package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ BOM Mass Add"                                
               , summary=""
               , page="BOMMassAdd"
               , namespacePrefix="rstk"
               , object="rstk__bommassadd__c"
               , connection="QARSF_Admin"
     )             
public class rstk__BOMMassAdd {

	@TextType()
	@FindBy(xpath = "//input[@id='item__c_autocomplete']")
	public WebElement Assembly_Item;
	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement Assembly_Item1;
	@PageTable(row = Components.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_lineItems']")
	public List<Components> components;
	@PageRow(byColumn = true)
	public static class Components {

		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='componentitem_autocomplete__c']")
		public WebElement componentItem;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='line__c']")
		public WebElement line;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='qtyper__c']")
		public WebElement qtyPer;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='scrappct__c']")
		public WebElement scrapFactor;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='setupqty__c']")
		public WebElement setupQty;
	}
	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement Component_Item1;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='Division']/parent::span/parent::th/parent::tr/parent::tbody/parent::table/parent::div/parent::div/parent::span/parent::div/following-sibling::div[1]//input")
	public WebElement save;
	
}
