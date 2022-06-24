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
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Approve Invoice']")
	public WebElement approveInvoice;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='ProcessingComplete']//lightning-base-formatted-text")
	public WebElement ProcessingIndicator;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Close']")
	public WebElement close;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Approved']/span[1]")
	public WebElement approved;
	
	//@FindBy(xpath = "//div[@id='listbox-id-1-1379']//ul//li//span//span")
	//public WebElement ProductSelect;

			
}
