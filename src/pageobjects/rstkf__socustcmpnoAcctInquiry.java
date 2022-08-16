package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__socustcmpno Acct Inquiry"                                
               , summary=""
               , page="socustcmpnoAcctInquiry"
               , namespacePrefix="rstkf"
               , object="rstkf__socustcmpno__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__socustcmpnoAcctInquiry {


    @TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Financial Customer Account Inquiry']")
	public WebElement Financial_Customer_Account_Inquiry_pageTitle;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Sales Order']")
	public WebElement tab_SalesOrders_lbl;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Sales Order Shippers']")
	public WebElement tab_SOShippers_lbl;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Sales Invoices']")
	public WebElement tab_Invoices_lbl;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Prepayments']")
	public WebElement tab_prepayments_lbl;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Addresses']")
	public WebElement tab_Addresses_lbl;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='AR Invoices & Memos']")
	public WebElement tab_arinvdue_lbl;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Cash Receipts']")
	public WebElement tab_arcashd_lbl;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Aging']")
	public WebElement tab_aging_lbl;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'op_tabs')]")
	public WebElement Tabs;
	
}
