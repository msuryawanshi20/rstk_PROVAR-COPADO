package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__salesorder"                                
               , summary=""
               , page="SalesOrder"
               , namespacePrefix="rstk"
               , object="rstk__sohdr__c"
               , connection="Devqaff"
     )             
public class rstk__salesorder {

	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Sales Order']")
	public WebElement pageTitle;
	@TextType()
	@FindBy(xpath = "//input[contains(@name,'sohdr_order__c')]")
	public WebElement orderNumber;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'sohdr_custno__c')]")
	public WebElement Customer;
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Customer_Select;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_lineitems']")
	public List<LineItems> lineItems;
	@PageRow(byColumn = true)
	public static class LineItems {

		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='soline_textproduct__c']")
		public WebElement product;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_qtyorder__c']")
		public WebElement qtyOrdered;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_price__c']")
		public WebElement unitPrice;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_firm__c']")
		public WebElement firm;
		@TextType()
		//@VisualforceBy(componentXPath = "apex:outputField[@id='soline_linestatustext__c']")
		@FindBy(xpath="//span[contains(@id,'soline_linestatustext__c')]")
		public WebElement Firmed;
		@ChoiceListType()
		//@VisualforceBy(componentXPath = "apex:selectlist[@id='soline_prodtype__c']")
		@FindBy(xpath="//select[contains(@id,'soline_prodtype__c')]//option")
		public WebElement productType;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_discpct__c']")
		public WebElement discountPct;
		@TextType()
		@FindBy(xpath = "//input[contains(@id,'soline_duedate__c')]")
		public WebElement dueDate;		
	}
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Product_Select;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Sales Order - SO-Jan21-1']")
	public WebElement pageTitle1;
	@ButtonType()
	@FindByLabel(label = "Order Fulfillment")
	public WebElement orderFulfillment;
	@ButtonType()
	@FindByLabel(label = "Add")
	public WebElement add;
	@ButtonType()
	@FindByLabel(label = "Firm All Lines")
	public WebElement Firm_All_Lines;
	@ButtonType()
	@FindByLabel(label = "Add New Order")
	public WebElement addNewOrder;
	@ButtonType()
	@FindByLabel(label = "Clone")
	public WebElement clone;
	@ButtonType()
	@FindByLabel(label = "Quick Entry")
	public WebElement quickEntry;
	@TextType()
	@FindBy(xpath = "//div[@id='quickEntryGridPopup']/span//div/h3")
	public WebElement Sales_Order_Line_Quick_Entry_Header;
	@ButtonType()
	@FindByLabel(label = "Ok")
	public WebElement ok;
	@ButtonType()
	@FindByLabel(label = "Set Due Date on All Lines")
	public WebElement setDueDateOnAllLines;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'dueDateOverride')][1]")
	public WebElement dueDateOverride;
	@ButtonType()
	@FindBy(xpath = "//h3[text()='Due Date Override']/following::div//table[@class='detailList']//input[@name='popupOkButton' and @value='Continue']")
	public WebElement continue_;
	
	
	
}
