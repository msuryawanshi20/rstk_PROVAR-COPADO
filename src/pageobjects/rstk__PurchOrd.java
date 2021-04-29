package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Purch Ord"                                
               , summary=""
               , page="PurchOrd"
               , namespacePrefix="rstk"
               , object="rstk__pohdr__c"
               , connection="QARSFAdmin"
     )   
     
              
public class rstk__PurchOrd {

	public WebDriver driver;

	public rstk__PurchOrd(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Number']")
	public WebElement OrderNumer;
	@ChoiceListType()
//	@FindBy(name = "pg:fm:pb:pbs_Main:j_id702:pohdr_vendno__c:j_id705:j_id712")
//	public WebElement Vendor1;
	@FindBy(xpath = "//select[contains(@name,'pohdr_vendno__c')]")
	public WebElement Vendor;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_lineItems']")
	public List<LineItems> lineItems;
	@PageRow(byColumn = true)
	public static class LineItems {

		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='poline_item_autocomplete__c']")
		public WebElement item;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='poline_qtyreq__c']")
		public WebElement qtyReq;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='poline_unitpricemcurr__c']")
		public WebElement unitPrice;
	}
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Itemlist;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@VisualforceBy(componentXPath = "c:standardHeader//h2[contains(@class, \"pageDescription\")]")
	public WebElement pageTitle;
	@TextType()
	@FindBy(xpath = "//td[normalize-space(.)='APPROVED']")
	public WebElement orderStatus;
	@ButtonType()
	@FindByLabel(label = "Submit PO to Vendor")
	public WebElement submitPOToVendor;
//	@ButtonType()
//	@VisualforceBy(componentXPath = "apex:form[@id='fm']//div[4]//button[2]")
//	public WebElement cancel;
	@FindBy(xpath = "//button[@onclick='printOptions_cancel();window.location.reload();']")
	public WebElement cancel;	
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Order Number')]/following::td//span[contains(@id,'pohdr_ordno__c')]//div/input")
	public WebElement orderNumber;
	@TextType()
	@FindBy(xpath = "//h3[normalize-space(.)='Advanced']")
	public WebElement Advanced;
	@TextType()
	@FindBy(id = "img_pg:fm:pb:j_id739")
	public WebElement Advanced1;
	@TextType()
	@FindBy(id = "pg:fm:pb:j_id739:pbs_tp_terms_lbl")
	public WebElement Termstab;
	@ChoiceListType()
	@FindBy(name = "pg:fm:pb:j_id739:j_id1194:j_id1243:pohdr_frghtrm__c:j_id1245:j_id1251")
	public WebElement FreightTerms;
	@ChoiceListType()
	@FindBy(name = "pg:fm:pb:j_id739:j_id1194:j_id1259:pohdr_terms__c:j_id1261:j_id1267")
	public WebElement PaymentTerms;
	@ButtonType()
	@FindByLabel(label = "Submit Change to Vendor")
	public WebElement submitChangeToVendor;
	@TextType()
	@FindBy(xpath = "//td[normalize-space(.)='VENDOR NOTIFIED']")
	public WebElement orderStatus1;
	@ButtonType()
//	@FindByLabel(label = "Add")
//	public WebElement add;
	@FindBy(xpath = "//span/input[@value='Add']")
	public WebElement add;
	
		public void selectOptions(String ItemName) throws InterruptedException {

		Thread.sleep(2000);

		WebElement option = driver.findElement(
				By.xpath("//div[@class='ac_results']/ul[@role='listbox']/li[contains(text(),'" + ItemName + "')]"));

		option.click();

	}
	
}
