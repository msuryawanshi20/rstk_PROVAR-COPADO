package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SalesOrderHeader_RSTKLUI"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class SalesOrderHeader_RSTKLUI {

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
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[3]/lightning-output-field//lightning-formatted-text")
	public WebElement Order_Number;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement new_;
			
}
