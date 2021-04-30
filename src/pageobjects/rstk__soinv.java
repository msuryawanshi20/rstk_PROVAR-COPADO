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
	
}
