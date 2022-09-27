package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SalesOrderControl"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class SalesOrderControl {

	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='GEO Service']")
	public WebElement tab_geo_lbl;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Enable Avalara Address Validation']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement enableAvalaraAddressValidation;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Enable Avalara Tax Calculation']/parent::span/parent::th/following-sibling::td//input")
	public WebElement enableAvalaraTaxCalculation;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Auto-Fetch Order Line Tax']/parent::span/parent::th/following-sibling::td//input")
	public WebElement autoFetchOrderLineTax;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save']")
	public WebElement save;
			
}
