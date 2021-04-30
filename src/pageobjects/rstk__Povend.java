package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Povend"                                
               , summary=""
               , page="Povend"
               , namespacePrefix="rstk"
               , object="rstk__povend__c"
               , connection="Devqaff"
     )             
public class rstk__Povend {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Salesforce Account Name']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement salesforceAccountName;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'povend_vendno')]")
	public WebElement vendorNo;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
