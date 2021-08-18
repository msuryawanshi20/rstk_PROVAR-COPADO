package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__soinv"                                
               , summary=""
               , page="Soinv"
               , namespacePrefix="rstk"
               , object="rstk__soinv__c"
               , connection="Devqaff"
     )             
public class rstk__soinv {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Invoice Number']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement invoiceNumber;
	@ButtonType()
	@FindByLabel(label = "Approve Invoice")
	public WebElement approveInvoice;
	@TextType()
	@VisualforceBy(componentXPath = "c:standardHeader//h2[contains(@class, \"pageDescription\")]")
	public WebElement pageTitle;
	@TextType()
	@FindBy(xpath = "//td[normalize-space(.)='Invoice approved.']")
	public WebElement Success_Message;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Approved']/parent::span/parent::th/following-sibling::td[1]//img")
	public WebElement approved;
	@ButtonType()
	@FindByLabel(label = "Delete Invoice")
	public WebElement deleteInvoice;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Preapprove Invoice']")
	public WebElement preapproveInvoice;
	
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Pre-Approved']/parent::span/parent::th/following-sibling::td[1]//img")
	public WebElement preapproved;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='De-Preapprove Invoice']")
	public WebElement depreapproveInvoice;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='De-approve Invoice']")
	public WebElement deapproveInvoice;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Print Invoice']")
	public WebElement printInvoice;
	
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Printed']/parent::span/parent::th/following-sibling::td[1]//img")
	public WebElement printed;
	
	@ButtonType()
	@FindBy(xpath = "//button[text()='OK']")
	public WebElement OK;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Transfer to A/R']")
	public WebElement TransferToAR;
	
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Transferred']/parent::span/parent::th/following-sibling::td[1]//img")
	public WebElement transferred;
	
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Posted (in A/R)']/parent::span/parent::th/following-sibling::td[1]//img")
	public WebElement postedInAR;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Commission Details']")
	public WebElement CommissionDetails;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Account Distribution']")
	public WebElement AccountDistribution;
	
		@ButtonType()
	@FindBy(xpath = "//input[@value='Line Formatting']")
	public WebElement LineFormatting;
	
	
	@ButtonType()
	@FindBy(xpath = "//button[text()='Close']")
	public WebElement Close;
	
	@TextType()
	@FindBy(xpath = "//h3[text()='Account Distribution Summary']")
	public WebElement AccountDistributionSummary;
	
	@TextType()
	@FindBy(xpath = "//h3[text()='Account Distribution Detail']")
	public WebElement AccountDistributionDetail;
	
	@ButtonType()
	@FindBy(xpath = "//button[text()='Done']")
	public WebElement Done;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Create New Invoice']")
	public WebElement CreateNewInvoice;
	
	
	@ButtonType()
	@FindBy(xpath = "//h3[text()='Line Formatting']/following::table//tr//td//input[@name='popupCancelButton']")
	public WebElement Cancel;
	@TextType()
	@FindBy(xpath = "//h3[normalize-space(.)='Line Formatting']")
	public WebElement LineFormattingTitle;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Commission Details']")
	public WebElement CommissionDetailsTitle;
	@ChoiceListType()
	@FindBy(xpath = "//select")
	public WebElement SelectFormTemplate;
	
	@TextType()
	@FindBy(xpath = "//div[@id='winCreateNewInvoice']//h2")
	public WebElement CreateNewInvoiceTitle;
	
	
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Invoice Number')]/following::span[contains(text(),'INV')][1]")
	public WebElement InvoiceNumber;
	
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'soinv_grandtotal')]")
	public WebElement InvoiceTotal;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Add and Delete Invoice Lines']")
	public WebElement AddandDeleteInvoiceLines;
	
	@TextType()
	@FindBy(xpath = "//h3[text()='Add and Delete Invoice Lines']")
	public WebElement AddandDeleteInvoiceLinesTitle;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Add']")
	public WebElement Add;
	
	@ButtonType()
	@FindBy(xpath = "//span//input[@id='cml_savebtn']")
	public WebElement Save;
	
	@TextType()
	@FindBy(xpath = "//input[@class='ac_input']")
	public WebElement Product;
	
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Product_Select;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'soinvline_qty')]")
	public WebElement Quantity;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'soinvline_price')]")
	public WebElement Price;
	
	@BooleanType()
	@FindBy(xpath = "//a[text()='Select']/following::input[@type='checkbox'][1]")
	public WebElement Selectchkbox;
	
		
	@ButtonType()
	@FindBy(xpath = "//input[@value='Remove Selected']")
	public WebElement RemoveSelected;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Details']")
	public WebElement Details;
	
	@TextType()
	@FindBy(xpath = "//h2[text()='Line Details']")
	public WebElement LineDetailsTitle;
	
	@TextType()
	@FindBy(xpath = "//input[@class='amount predisc']")
	public WebElement Price_Details;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save Details']")
	public WebElement SaveDetails;
	
	@ButtonType()
	@FindBy(xpath = "//h2[text()='Line Details']/following::button[@onclick='component_close()']")
	public WebElement Close_Details;
	
}
