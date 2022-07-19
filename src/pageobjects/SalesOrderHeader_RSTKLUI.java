package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SalesOrderHeader_RSTKLUI"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class SalesOrderHeader_RSTKLUI {
WebDriver driver;
String ProdType;
 public SalesOrderHeader_RSTKLUI(WebDriver driver)
{this.driver = driver;
}
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sales Order Header']")
	public WebElement salesOrderHeader;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Customer']/following-sibling::div[1]//input")
	public WebElement Customer;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div/span/lightning-formatted-text")
	public WebElement CustomerSelect;
	@TextType()
	@FindBy(xpath = "//span[@class='slds-listbox__option-text slds-listbox__option-text_entity']")
	public WebElement CustomerSelect_NewInvoice;
	@TextType()
	@FindBy(xpath = "//input[@name='rstk__sohdr_order__c']")
	public WebElement orderNumber;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//span[text()='Order Number']/following::div[@class='slds-form-element__control']//lightning-formatted-text[@data-output-element-id='output-field']")
	public WebElement Order_Number;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement new_;
	@ButtonType()
	@FindBy(xpath = "//button[@title='Add']")
	public WebElement Add;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[contains(@name,'rstk__soline_prodtype__c')]")
	public WebElement ProductType;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-sales_-order_-header_-record_-page_-default1___rstk__sohdr__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_sales_order_header_record_page_default1_rstk__sohdr__c__view_js').shadowRoot.querySelector('rootstock-rootstock-soline-grid').shadowRoot.querySelector('c-rootstock-datatable').shadowRoot.querySelectorAll('lightning-primitive-cell-factory')[2].shadowRoot.querySelector('lightning-primitive-custom-cell').shadowRoot.querySelector('c-rootstock-lookup').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('input')")
	public WebElement Product;
	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[contains(@name,'rstk__soline_prodtype__c')]/../following::div//ul//li//span//span[2]")
	public WebElement ProductType_Select;
	@TextType()
	@FindBy(xpath = "//lightning-primitive-cell-factory[@data-label='Product']//div[@role='listbox']//ul[@class='slds-listbox slds-listbox_vertical']//li//span//span")
	public WebElement Product_Select;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='ActionsShow menu']")
	public WebElement actions;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Firm All Lines']")
	public WebElement firmAllLines;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Sales Order Batch - SO_BATCH_SAVE']")
	public WebElement salesOrderBatchSOBATCHSAVE;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Job completed successfully']//lightning-base-formatted-text")
	public WebElement _;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Order Fulfillment']")
	public WebElement orderFulfillment;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h1[normalize-space(.)='Sales Order Fulfillment']")
	public WebElement Sales_Order_Fulfillment_title;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[20]//lightning-input//label/span[1]")
	public WebElement _Allocate___Pick__Pack__Ship_and_Invoice;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[9]//button[normalize-space(.)='Process']")
	public WebElement process;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[8]//button[normalize-space(.)='Continue Processing']")
	public WebElement continueProcessing;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//td/lightning-button/button[normalize-space(.)='Close']")
	public WebElement Close;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('rootstock-sales-order-header-fullfillment').shadowRoot.querySelector('c-sales-order-fulfillment-soline-list').shadowRoot.querySelector('lightning-datatable').shadowRoot.querySelectorAll('lightning-primitive-cell-factory')[16].shadowRoot.querySelector('lightning-formatted-url').shadowRoot.querySelector('a')")
	public WebElement Invoice;
	@TextType()
	@FindBy(xpath = "//lightning-icon[@title='Processing Done']")
	public WebElement ProcessingStatus;
	
	@PageRow()
	public static class SOLineGrid {

       /* @TextType()
	    @FindBy(xpath = ".//th//button[contains(@name,'rstk__soline_prodtype__c')]")
	    public WebElement ProductType;	*/
	    
	    
	      @TextType()
	    @FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[contains(@name,'rstk__soline_prodtype__c')]")
	    public WebElement ProductType;	
	    
	    
	 /*   @TextType()
	    @FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[contains(@name,'rstk__soline_prodtype__c')]/../following::div[@role='listbox']")
	    public WebElement ProductType;	*/
	    
	    @ChoiceListType()
	    @FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[contains(@name,'rstk__soline_prodtype__c')]/../following::div//ul//li//span//span[text()='Service']")
	    public WebElement ProductType_Select;
	    
	    @TextType()
		@FindBy(xpath = ".//td[3]//input")
		public WebElement Product;
		
	}
	
	
	
	
	public void Click(String ProdType) throws InterruptedException{
	//driver.findElement(By.xpath("(//input[@placeholder='Select'])[1]")).click();
	//Thread.sleep(1000);
	//driver.findElement(By.xpath("//span[contains(text(),'DJ_Prod01_No-Track (No Track_MFG)')]")).click();
//	driver.findElement(By.xpath("//span[contains(text()"+var1+"))".click();
    
    driver.findElement(By.xpath("//div[contains(@class,'active') and contains(@class,'oneContent')]//button[contains(@name,'rstk__soline_prodtype__c')]/../following::div//ul//li//span//span[text()='"+ProdType+"']")).click(); 

	}
	
	
	
	
	
	@FindBy(xpath = "//flexipage-component2[@data-component-id='rootstockSolineGrid']//table//tbody//tr")
	@PageTable(firstRowContainsHeaders = false, row = SOLineGrid.class)
	public List<SOLineGrid> table;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='relatedListsTab__item']")
	public WebElement related;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='detailTab__item']")
	public WebElement details;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//h1//lightning-formatted-text")
	public WebElement InvoiceHeader_Title;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'No record found with Id: ')]")
	public WebElement InvoiceHeader_Deleted;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Commission Details']")
	public WebElement CommissionDetails;
	@TextType()
	@FindBy(xpath = "//h2//span[text()='Commission Details']//following::div//div[@class='slds-table_header-fixed_container slds-scrollable_x']")
	public WebElement CommissionDetailsPopup;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Edit']")
	public WebElement Edit;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Approve Invoice']")
	public WebElement approveInvoice;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='De-Approve Invoice']")
	public WebElement deapproveInvoice;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Print Invoice']")
	public WebElement printInvoice;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Delete']")
	public WebElement Delete;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a//span[contains(text(),'Credit This Invoice')]")
	public WebElement CreditThisInvoice;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a//span[contains(text(),'Create New Invoice')]")
	public WebElement CreateNewInvoice;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a//span[contains(text(),'Transfer To A')]")
	public WebElement TransferToAR;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a//span[contains(text(),'Add To Invoice')]")
	public WebElement AddToInvoice;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='ProcessingComplete']//lightning-base-formatted-text")
	public WebElement ProcessingIndicator;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Close']")
	public WebElement close;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Approved']/span[1]")
	public WebElement approved;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Printed']/span[1]")
	public WebElement printed;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='YOUR FLOW FINISHED']")
	public WebElement PrintInvoiceMsg;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Close this window']")
	public WebElement closeThisWindow;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Transferred']/span[1]")
	public WebElement transferred;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a//span[contains(text(),'Reverse A')]")
	public WebElement ReverseARTransfer;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h1/lightning-formatted-text[contains(text(),'Edit Record:')]")
	public WebElement EditRecord_title;
	@TextType()
	@FindBy(xpath = "//input[@name='rstk__soinv_phone__c']")
	public WebElement phone;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement save_Edit;
	@TextType()
	@FindBy(xpath = "//input[@name='rstk__soinv_email__c']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//span[text()='Email']/following::div[@class='slds-form-element__control']//lightning-formatted-text")
	public WebElement email_value;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Credit This Invoice']")
	public WebElement CreditThisInvoice_popup;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label/span[1]")
	public WebElement AllowShippers_chkbox;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//p[normalize-space(.)='Process has been completed successfully.']")
	public WebElement CreditThisInvoice_successmsg;
	@TextType()
	@FindBy(xpath = "//span[text()='Transaction Type']/following::lightning-formatted-text")
	public WebElement transactionType;
	@TextType()
	@FindBy(xpath = "//span[text()='Invoice Number']/following::lightning-formatted-text")
	public WebElement invoiceNumber_CreditMemo;
	@LinkType()
	@FindBy(xpath = "//span[text()='Invoice Credited by this CR Memo']/following::div[@class='slds-form-element__control']//a//span")
	public WebElement invoiceCreditedByThisCRMemo;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Add Shippers to the Invoice']")
	public WebElement AddShippers_popup;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Select Item 1']/preceding::input[1]")
	public WebElement AddShippers_chkbox;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Add Shippers to the Invoice']")
	public WebElement addShippersToTheInvoice;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='New Sales Order Invoice Header']")
	public WebElement NewSalesOrderInvoiceHeader_popup;
	@TextType()
	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement customerRecordName;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Create Invoice']")
	public WebElement createInvoice;
	
	//@FindBy(xpath = "//div[@id='listbox-id-1-1379']//ul//li//span//span")
	//public WebElement ProductSelect;

			
}
