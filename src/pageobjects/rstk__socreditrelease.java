package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__socreditrelease"                                
               , summary=""
               , page="socreditrelease"
               , namespacePrefix="rstk"
               , object="rstk__sohdr__c"
               , connection="QARSF_Admin"
     )             
public class rstk__socreditrelease {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Number']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement orderNumber;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Refresh Data Display']")
	public WebElement refreshDataDisplay;
	@ButtonType()
	@FindBy(xpath = "//td[contains(@id,'pbs_SOList')]//input[1]")
	public WebElement selectSO;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Release Selected Order(s)']")
	public WebElement ReleaseSelectedOrder;
	
}
